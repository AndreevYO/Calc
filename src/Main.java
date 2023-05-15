//a.length() - длина строки
//a.charAt(0) - символ в строке по номеру
//string.split - делит строку по выбранному символу (13:00)

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int a;
        int c;

        Numbers number1 = new Numbers();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String[] g = string.split("[-+*/]");
        if (g.length > 2) {
            try {
                throw new IOException();
            } catch (IOException e) {
                throw new IOException("Можно вводить только 2 числа");
            }

        } else {

            string.indexOf("+");
            string.indexOf("-");
            string.indexOf("/");
            string.indexOf("*");
            try {

                a = Integer.parseInt(g[0]);
                //b = String.valueOf(string.charAt(1));
                c = Integer.parseInt(g[1]);


                if (string.indexOf("+") == -1 && string.indexOf("-") == -1 && string.indexOf("*") == -1) {

                    number1.a1 = a;
                    number1.a2 = "/";
                    number1.a3 = c;
                } else if ((string.indexOf("+") == -1 && string.indexOf("-") == -1 && string.indexOf("/") == -1)) {
                    number1.a1 = a;
                    number1.a2 = "*";
                    number1.a3 = c;
                } else if ((string.indexOf("/") == -1 && string.indexOf("-") == -1 && string.indexOf("/") == -1)) {
                    number1.a1 = a;
                    number1.a2 = "+";
                    number1.a3 = c;
                } else if ((string.indexOf("/") == -1 && string.indexOf("+") == -1 && string.indexOf("/") == -1)) {
                    number1.a1 = a;
                    number1.a2 = "-";
                    number1.a3 = c;
                }
            } catch (NumberFormatException e) {
                throw new RuntimeException("Вы ввели что-то не то");

            }


            number1.calc(String.valueOf(a));
        }
    }

    static class Numbers {
        static int a1;
        static String a2;
        static int a3;

        public static String calc(String input) throws IOException {
            if (a1>10 && a3>10 || a1>10 || a3>10){
                try {
                    throw new IOException();
                } catch (IOException e) {
                    throw new IOException("Числа не могут быть больше 10");
                }

            }else {

                switch (a2) {
                    case "+":
                        input = String.valueOf(a1 + a3);
                        break;

                    case "-":
                        input = String.valueOf(a1 - a3);
                        break;

                    case "*":
                        input = String.valueOf(a1 * a3);
                        break;

                    case "/":
                        if (a3 != 0) {
                            input = String.valueOf(a1 / a3);
                            ;
                        } else {
                            System.out.println("Ошибка: Деление на ноль невозможно!");
                        }
                        break;

                    default:
                        System.out.println("Ошибка: Некорректная операция!");
                        break;
                }
                //a1=input;
                System.out.println(input);
                //System.out.println(a1);

            }return input;

        }

        }

    }




