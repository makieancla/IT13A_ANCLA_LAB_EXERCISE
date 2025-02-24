package PRELIM;

import java.util.Scanner;

public class Ancla_lab2_exercise2 {

    public static void main(String[] args) {
        Scanner makie = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int mak1 = makie.nextInt();

        System.out.print("Enter second number: ");
        int mak2 = makie.nextInt();

        System.out.print("Enter third number: ");
        int mak3 = makie.nextInt();

        int greatest = Math.max(mak1, Math.max(mak2, mak3));

        System.out.println("The greatest number is: " + greatest);

        makie.close();
    }
}


