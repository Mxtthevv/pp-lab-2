import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ile ocen chcesz dodać?");
        int iloscOcen = scan.nextInt();

        int[] oceny = new int[iloscOcen]; // tworzenie talbicy o podanym rozmiarze

        for (int i = 0; i < iloscOcen; i++) {   // petla na pobieranie ocen i zapisywanie do tablicy
            System.out.println("Podaj ocenę numer " + (i + 1) + ":");
            oceny[i] = scan.nextInt();
        }

        scan.close();

        int suma = 0;
        for (int ocena : oceny) { // obliczanie sumy ocen
            suma += ocena;
        }

        double srednia = (double) suma / iloscOcen; // obliczanie sredniej arytmetycznej

        System.out.println("Średnia arytmetyczna twoich ocen to: " + srednia);
    }
}