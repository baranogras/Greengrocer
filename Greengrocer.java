package Lesson2;
import java.util.Scanner;

public class Greengrocer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double perPear=2.14,perApple=3.67,perTomato=1.11,perBanana=0.95,perAubergine=5.00;
        double kgPear,kgApple,kgTomato,kgBanana,kgAubergine,total;

        System.out.print("Please Enter The Kilos of Pear : ");
        kgPear = input.nextDouble();
        System.out.print("Please Enter The Kilos of Apple : ");
        kgApple = input.nextDouble();
        System.out.print("Please Enter The Kilos of Tomato : ");
        kgTomato = input.nextDouble();
        System.out.print("Please Enter The Kilos of Banana : ");
        kgBanana = input.nextDouble();
        System.out.print("Please Enter The Kilos of Aubergine : ");
        kgAubergine = input.nextDouble();

        total = (perPear*kgPear)+(perApple*kgApple)+(perTomato*kgTomato)+(perBanana*kgBanana)+(perAubergine*kgAubergine);
        System.out.print("Total Amount : " +total);
        System.out.print("TL");


    }
}
