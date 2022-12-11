import java.util.Scanner;
public class DaireAlanCevreHesaplama {
    public static void main(String[] args) {

        double r,pi = 3.14,alan,cevre;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı: " +alan);
        System.out.println("Dairenin Çevresi: " +cevre);

        //@author Diyar akdemir


    }
}