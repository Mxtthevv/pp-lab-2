import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoją ocene z matematyki:" + " ");
        int matematyka = scan.nextInt();

        System.out.println("Podaj swoją ocene z fizyki:" + " ");
        int fizyka = scan.nextInt();

        System.out.println("Podaj swoją ocene z chemii:" + " ");
        int chemia = scan.nextInt();

        scan.close();

        int srednia = (matematyka + fizyka + chemia)/3;

        System.out.println("Średnia arytmetyczna twoich ocen to: " + srednia);
    }
}