//Вывести все простые числа от 1 до 1000

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        int i, x, n;

        n = 1000;
        int a = 0;
        for(i = 2; i < n; i++) {
            for(x = 1; x <= i; x++) {
                if (i % x == 0) {
                    a++;
                }
            }
            if (a == 2){
                System.out.println(i);
                a = 0;
            }
            else {
                a = 0;
            }

        }
    }
}