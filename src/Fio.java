import java.util.Scanner;

public class Fio {
    public static void main(String[] args){
        String fio;

        StringBuilder name = new StringBuilder("Имя: ");

        StringBuilder surname = new StringBuilder("Фамилия: ");

        StringBuilder otchestvo = new StringBuilder("Отчество: ");



        Scanner scanner = new Scanner(System.in);



        fio = scanner.nextLine();

        fio = fio.trim() + " ";

        int count = 0;

        if (fio.length() > 1) {



            //Фамилия

            for (int i = 0; i < fio.indexOf(" "); i++, count++) {

                if ((fio.charAt(i) >= 'a' && fio.charAt(i) <= 'z') || (fio.charAt(i) >= 'A' && fio.charAt(i) <= 'Z')

                        || ((fio.charAt(i) >= 'а' && fio.charAt(i) <= 'я') || (fio.charAt(i) >= 'А' && fio.charAt(i) <= 'Я')

                        || (fio.charAt(i) == 'ё') || (fio.charAt(i) == '-'))) {

                    surname.append(fio.charAt(i));

                } else {

                    System.out.println("Неправильная фамилия");

                    return;

                }

            }



            //Имя

            if (!(fio.indexOf(" ") == fio.length() - 1)) {

                for (int i = count + 1; i < fio.indexOf(" ", count + 1); i++, count++) {

                    if ((fio.charAt(i) >= 'a' && fio.charAt(i) <= 'z') || (fio.charAt(i) >= 'A' && fio.charAt(i) <= 'Z')

                            || ((fio.charAt(i) >= 'а' && fio.charAt(i) <= 'я') || (fio.charAt(i) >= 'А' && fio.charAt(i) <= 'Я')

                            || (fio.charAt(i) == 'ё') || (fio.charAt(i) == '-'))) {

                        name.append(fio.charAt(i));

                    } else {

                        System.out.println("Неправильное имя");

                        return;

                    }

                }

            } else {

                System.out.println("Вы не ввели имя");

                return;

            }




            //Отчество
            fio = fio.trim();

            if (!(count == fio.length() - 1)) {

                for (int i = count + 2; i < fio.length(); i++, count++) {

                    if ((fio.charAt(i) >= 'a' && fio.charAt(i) <= 'z') || (fio.charAt(i) >= 'A' && fio.charAt(i) <= 'Z')

                            || ((fio.charAt(i) >= 'а' && fio.charAt(i) <= 'я') || (fio.charAt(i) >= 'А' && fio.charAt(i) <= 'Я')

                            || (fio.charAt(i) == 'ё') || (fio.charAt(i) == '-'))) {

                        otchestvo.append(fio.charAt(i));

                    } else if (fio.charAt(i) == ' ') {

                        System.out.println("Неверный ввод");

                        return;

                    } else {

                        System.out.println("Неправильное Отчество");

                        return;

                    }

                }


            }




            if (count + 2 == fio.length()) {
                System.out.println(surname);
                System.out.println(name);
                System.out.println(otchestvo);
            } else if (count + 1 == fio.length()) {
                System.out.println(surname);
                System.out.println(name);
                System.out.println("Отчества нет");
            } else
                System.out.println("Неверный ввод");


        }




   }
}
