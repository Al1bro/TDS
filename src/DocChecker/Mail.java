package DocChecker;

import java.io.InputStream;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.search.FlagTerm;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Mail {

    public static void main(String[] args) {
        String host = "imap.mail.ru";
        String user = "your@bk.ru";
        String password = "yourpass";

        Properties properties = new Properties();

        properties.setProperty("mail.store.protocol", "imaps");
        properties.put("mail.imaps.host", host);
        properties.put("mail.imaps.port", "993");

        Session emailSession = Session.getDefaultInstance(properties);
        try {
            Store store = emailSession.getStore("imaps");

            store.connect(host, user, password);

            Folder emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_WRITE);

            Message[] messages = emailFolder.search(new FlagTerm(new Flags(Flags.Flag.SEEN), false));
            System.out.println("Новых сообщений: " + messages.length);

            for (Message message : messages) {
                processMessage(message);
            }

            emailFolder.close(false);
            store.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void processMessage(Message message) {
        try {
            String contentType = message.getContentType();
            if (contentType.contains("multipart")) {
                Multipart multiPart = (Multipart) message.getContent();
                for (int i = 0; i < multiPart.getCount(); i++) {
                    MimeBodyPart part = (MimeBodyPart) multiPart.getBodyPart(i);
                    if (Part.ATTACHMENT.equalsIgnoreCase(part.getDisposition())) {
                        String fileName = part.getFileName();
                        if (fileName.endsWith(".docx") || fileName.endsWith(".doc")) {
                            InputStream is = part.getInputStream();
                            XWPFDocument document = new XWPFDocument(is);
                            boolean hasRequiredFont = false;
                            for (XWPFParagraph paragraph : document.getParagraphs()) {
                                for (XWPFRun run : paragraph.getRuns()) {
                                    if ("Times New Roman".equals(run.getFontName()) &&
                                            run.getFontSize() == 14) {
                                        hasRequiredFont = true;
                                        break;
                                    }
                                }
                                if (hasRequiredFont) {
                                    break;
                                }
                            }
                            if (hasRequiredFont) {
                                forwardMessage(message);
                                replyToMessage2(message, "Документ прошел проверку");
                            } else {
                                replyToMessage(message, "Извините, но документ не корректен");
                            }
                        }
                    }
                }
            }
            message.setFlag(Flags.Flag.SEEN, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void forwardMessage(Message message) throws MessagingException{
        String smtpHost = "smtp.mail.ru";

        Properties properties = System.getProperties();
        properties.put("mail.smtps.ssl.checkserveridentity", true);
        properties.put("mail.smtps.ssl.trust", "*");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.port", "465");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("your@bk.ru", "yourpass");
            }
        });

        MimeMessage newMessage = new MimeMessage(session);
        newMessage.setFrom(new InternetAddress("your@bk.ru"));
        newMessage.addRecipient(Message.RecipientType.TO, new InternetAddress("second@gmail.com"));
        newMessage.setSubject("Fwd: " + message.getSubject());

        BodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setText("Документ прошел проверку");

        MimeBodyPart attachmentPart = new MimeBodyPart();
        attachmentPart.setContent(message, "message/rfc822");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        multipart.addBodyPart(attachmentPart);

        newMessage.setContent(multipart);
        Transport.send(newMessage);
        System.out.println("Сообщение переслано успешно...");

    }

    private static void replyToMessage2(Message message, String text) throws MessagingException {
        String smtpHost = "smtp.mail.ru";

        Properties properties = System.getProperties();
        properties.put("mail.smtps.ssl.checkserveridentity", true);
        properties.put("mail.smtps.ssl.trust", "*");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.port", "465");

        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("your@bk.ru", "yourpass");
            }
        });

        MimeMessage newMessage = new MimeMessage(session);

        newMessage.setFrom(new InternetAddress("your@bk.ru"));
        newMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(message.getFrom()[0].toString()));
        newMessage.setSubject("Ответ на ваше сообщение");
        newMessage.setText(text);

        Transport.send(newMessage);
        System.out.println("Ответное сообщение о успешном прохождении проверки отправлено...");
    }

    private static void replyToMessage(Message message, String text) throws MessagingException {
        String smtpHost = "smtp.mail.ru";

        Properties properties = System.getProperties();
        properties.put("mail.smtps.ssl.checkserveridentity", true);
        properties.put("mail.smtps.ssl.trust", "*");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.port", "465");

        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("your@bk.ru", "yourpass");
            }
        });

        MimeMessage newMessage = new MimeMessage(session);

        newMessage.setFrom(new InternetAddress("your@bk.ru"));
        newMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(message.getFrom()[0].toString()));
        newMessage.setSubject("Ответ на ваше сообщение");
        newMessage.setText(text);

        Transport.send(newMessage);
        System.out.println("Ответное сообщение о не прохождении проверки отправлено...");
    }
}
