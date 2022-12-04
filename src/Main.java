import java.util.Scanner;

public class Main {
    static void foo() {
        String m = "Hello";
        System.out.print(m);
        bar(m);
        System.out.print(m);
    }

    static void bar(String m) {
        m += "World!";
    }
    public static void main(String[] args) {
        //Какой результат выведет вызов метода foo()? Объясните результат.

        //foo();
        //Напишите программу, которая выводит в консоль все положительные делители натурального числа.
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Число "+ n + " делится на - ");
        for (int i = 1; i <= n ; i++) {
            if ((n % i)==0){
                System.out.print(i + " ");
            }
        }
    }
}