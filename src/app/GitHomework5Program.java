package app;

import java.util.Scanner;

public class GitHomework5Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть сумму доходу :");
        double income = scanner.nextDouble();
        double tax = 0.0;
        double rate1 = 0.025;
        double rate2 = 0.045;
        double rate3 = 0.067;
        if (income <= 10000) {
            tax = income * rate1;
        } else if (income <= 25000) {
            tax = income * rate1 + (income - 10000) * rate2;
        }
        else {
            tax = income * rate1 + 15000 * rate2 + (income - 25000) * rate3;
        }
        System.out.printf("Сума податку для доходу %.2f грн: %.2f грн %n", income, tax);


        }
    }





