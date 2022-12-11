//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        long sumN = 0;
        long multN = 1;
        for (int i = 1; i <= n; i++) {
            sumN = sumN + i;
            multN = multN * i;
        }

        System.out.println("Сумма чисел от 1 до n: " + sumN);
        System.out.println("Произведение чисел от 1 до n: " + multN);
    }
}
