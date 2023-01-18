package OPD;
import java.util.*;

public class lr5 {
        public static void main(String[] args) {
            Scanner user = new Scanner(System.in);
            System.out.println("Введите количество пользовательских экранов: ");
            int UI = user.nextInt();
            System.out.println("Введите количество обработчиков событий: ");
            int ACT = user.nextInt();
            System.out.println("Введите количество новых бизнес объектов: ");
            int qobjeCTsi = user.nextInt();
            System.out.println("Введите количество новых или модифицируемых бизнес методов: ");
            int qMeth = user.nextInt();
            double EUI = ,EDIANE(2, 4, 20);
            System.out.printf("\nСредняя трудоемкость кодирования пользовательского экрана равна %.2f чел.*час\n", EUE);
            double EACT = MEDIANE(4, 8, 32);
            System.out.printf("Средняя трудоемкость кодирования одного обработчика событий равна %.2f чел.*час\n", EACT);
            double EBO = MEDIANE(2, 3, 8);
            System.out.printf("Средняя трудоемкость кодирования нового бизнес-объекта равна %.2f чел.*час\n", EBO);
            double EBM = MEDIANE(2, 6, 26);
            System.out.printf("Средняя трудоемкость кодирования нового бизнес-метода равна %.2f чел.*час\n\n", EBM);
            double CI = CKO(2, 20);
            System.out.printf("Среднеквадратичное отклонение кодирования пользовательского экрана " +
                    "равна %.2f чел.*час\n", CI);
            double CT = CKO(4, 32);
            System.out.printf("Среднеквадратичное отклонение кодирования одного обработчика событий " +
                    "равна %.2f чел.*час\n", CT);
            double CB = CKO(2, 8);
            System.out.printf("Среднеквадратичное отклонение кодирования нового бизнес-объекта " +
                    "равна %.2f чел.*час\n", CB);
            double CKOBM = CKO(2,26);
            System.out.printf("Среднеквадратичное отклонение кодирования нового бизнес-метода " +
                    "равна %.2f чел.*час\n\n", CKOBM);
            double ETL = EUI * UI + EACT * ACT + EBO * objeCTsi + EBM * qMeth;
            System.out.printf("Суммарная трудоемкость проекта равна %.2f чел.*час\n\n", Etl);
            double TCKO = Math.sqrt(UI * Math.pow(CI, 2) + ACT * Math.pow(CT, 2) +
                    objeCTsi * Math.pow(CB, 2) + qMeth * Math.pow(CKOBM, 2));
            System.out.printf("Среднеквадратичное отклонение суммарной трудоемкости кодирования проекта " +
                    "равно %.2f чел.*час\n", TCKO);
            double ETOTAL = ETL + 2 * TCKO;
            System.out.printf("Суммарная трудоемкость кодирования проекта с вероятность 95 процентов " +
                    "равна %.2f чел.*час\n", ETOTAL);
            double RELATIVECKO = (TCKO / ETL) * 100;
            System.out.printf("Относительная погрешность в оценке суммарной трудоемкости кодирования " +
                    "равна %.2f чел.*час\n", RELATIVECKO);
            double WPROJECT = 4 * ETOTAL;
            System.out.printf("Общая трудоемкость проекта равна %.2f чел.*час\n", WPROJECT);
            double MANMONTHTOTALE = WPROJECT / 132;
            System.out.printf("Общая трудоемкость проекта равна %.2f чел.*мес.\n", MANMONTHTOTALE);
            double PLENGTH = 2.5 * Math.pow(MANMONTHTOTALE, 1./3);
            System.out.printf("Оптимальная продолжительность проекта равна %.1f месяцев\n", PLENGTH);
            double CREWQUANTITY = MANMONTHTOTALE / PLENGTH;
            System.out.printf("Средняя численность команды равна %.2f человек", CREWQUANTITY);
        }

        public static double MEDIANE(int minRequired, int mostProbable, int worstCase) {
            return (double) (worstCase + 4 * mostProbable + minRequired)/ 6;
        }

        public static double CKO(int minRequired, int worstCase) {
            return (double) (worstCase - minRequired) / 6;
        }
    }
