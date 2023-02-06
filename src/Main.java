import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1;
        int num2;
        int result;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите, что вы хотите вычислить: ");

        String str = reader.nextLine();
        String[] subStr;
        String delimiter = " ";
        subStr = str.split(delimiter);

        if(isNumeric(subStr[0], subStr[2])) {
            num1 = Integer.parseInt(subStr[0]);
            num2 = Integer.parseInt(subStr[2]);

            op = subStr[1].charAt(0);

            switch(op) { // убрать в метод
                case '+': result = num1 + num2;
                    break;
                case '-': result = num1 - num2;
                    break;
                case '*': result = num1 * num2;
                    break;
                case '/': result = num1 / num2;
                    break;
                default:  System.out.println("Ошибка! введена неверная операция");
                    return;
            }

            System.out.println("Результат вычисления: ");
            System.out.println(num1 + " " + op + " " + num2 + " = " + result);


        } else {
            num1 = ConvertFromRoman.convert(subStr[0]);
            num2 = ConvertFromRoman.convert(subStr[2]);

            op = subStr[1].charAt(0);

            switch(op) { // убрать в метод
                case '+': result = num1 + num2;
                    break;
                case '-': result = num1 - num2;
                    break;
                case '*': result = num1 * num2;
                    break;
                case '/': result = num1 / num2;
                    break;
                default:  System.out.println("Ошибка! введена неверная операция");
                    return;
            }

            String roman1 = subStr[0];
            String roman2 = subStr[2];
            String resultRoman = ConvertFromArabic.convert(result);


            System.out.println("Результат вычисления: ");
            System.out.println(roman1 + " " + op + " " + roman2 + " = " + resultRoman);
        }


    }
    public static boolean isNumeric(String b, String c) {
        int intValue;

        if((b == null || b.equals("")) & (c == null || c.equals(""))) {
            System.out.println("Введите корректное значение");
            return false;
        }

        try {
            intValue = Integer.parseInt(b);
            intValue = Integer.parseInt(c);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Введите корректное значение");
        }
        return false;

    }


}