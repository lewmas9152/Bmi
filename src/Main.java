import java.util.Scanner;

import static java.lang.Double.valueOf;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;
        double bmi;

        System.out.print("Input your height: ");
        height = Double.parseDouble(scanner.nextLine());
        System.out.print("Input your weight: ");
        weight = Double.parseDouble(scanner.nextLine());

        bmi = weight/(height*height);

        System.out.printf("Your BMI is %.2f",bmi);

    }
}