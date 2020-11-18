
public class Vasya {

    public static void main(String[] args) {

        String text = "Вася заработал 50 рублей, Петя - 7563 рубля, а Маша - 33789 рублей";



        StringBuilder result = new StringBuilder();
        StringBuilder result1 = new StringBuilder();

        //Считаем Васю
        for (int i = 0; i < text.indexOf(","); i++)
            if (text.charAt(i) >= '0' && text.charAt(i) <= '9')
                result.append(text.charAt(i));



        //Считаем Машу
        for (int i = text.indexOf("Маша"); i < text.length(); i++)
            if (text.charAt(i) >= '0' && text.charAt(i) <= '9')
                result1.append(text.charAt(i));



        int sum;

        sum = Integer.parseInt(String.valueOf(result1)) + Integer.parseInt(String.valueOf(result));;

        System.out.println(sum);







    }

}