//Реализовать простой калькулятор

import java.util.Scanner;
class Main {
        public static void prompt(){System.out.println("Введите число");}
        public static int parse(String a){int b = Integer.parseInt(a);
                return b;
        }

        public static void main(String [] args){
                Scanner scan = new Scanner(System.in);

                System.out.println("Выберите операцию: +, -, *, /:");
                String type = scan.nextLine();

                if (type.equals("+")){
                        prompt();
                        String num1 = scan.nextLine();
                        prompt();
                        String num2 = scan.nextLine();
                        System.out.println(parse(num1) + parse(num2));
                }
                else if (type.equals("-")) {
                        prompt();
                        String num1 = scan.nextLine();
                        prompt();
                        String num2 = scan.nextLine();
                        System.out.println(parse(num1) - parse(num2));
                }
                else if (type.equals("*")) {
                        prompt();
                        String num1 = scan.nextLine();
                        prompt();
                        String num2 = scan.nextLine();
                        System.out.println(parse(num1) * parse(num2));
                }
                else if (type.equals("/")) {
                        prompt();
                        String num1 = scan.nextLine();
                        prompt();
                        String num2 = scan.nextLine();
                        System.out.println(parse(num1) / parse(num2));
                }

        }
}