package polynom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Коэффициенты для полинома
        System.out.println("\tВведите количество коэфициентов для полинома:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] coefs = new double[n];
        for(int i=0; i<n; i++){
            System.out.println("\tВведите коэфициент под номером:" + (i+1));
            coefs[i]=sc.nextInt();
        }
        // Создание полинома:
        Polynom P = new Polynom(coefs);
        System.out.println("\tКоэффициенты исходного полинома:");
        // Коэффициенты полинома:P.show();
        System.out.println("\tЗначение полинома в точке:");
        // Значение полинома для единичного аргумента:
        P.show(1);
        System.out.println("\tВторая производная:");
// Вычисление значения полинома в точке:
        System.out.println("\tЗначение полинома в точке:");
        P.value(1);
        P.show();
// Вычисление второй производной для полинома:
        Polynom Q = P.dif(2);
// Результат вычисления производной (коэффициенты):
        Q.show();
        System.out.println("\tСумма полиномов:");
// Сумма полиномов (результат):
        Q.plus(P).show();
        System.out.println("\tПроизведение полиномов:");
// Произведение полиномов (результат):
        Q.prod(P).show();

        System.out.println("\tРазность полиномов:");
// Разность полиномов (результат):
        Q.minus(P).show();
    }
}

