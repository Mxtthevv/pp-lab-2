import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ile ocen chcesz dodać?");
        int iloscOcen = scan.nextInt();

        int[] oceny = new int[iloscOcen];   // tworzenie talbicy o podanym rozmiarze

        for (int i = 0; i < iloscOcen; i++) {   // petla na pobieranie ocen i zapisywanie do tablicy
            int ocena;
            do {
                System.out.println("Podaj ocenę numer " + (i + 1) + ":");
                ocena = scan.nextInt();
                if (ocena <= 0 || ocena > 6) {
                    System.out.println("Wprowadzona przez Ciebie liczba jest nieprawidłowa, prawidłowy zakres to 1-6");
                }
            } while (ocena <= 0 || ocena > 6);
            oceny[i] = ocena;
        }

        System.out.println("Twoje oceny to:");   // wyswietlanie ocen z tablicy
        for (int ocena : oceny) {
            System.out.println(ocena + " ");
        }

        int suma = 0;   // obliczanie sumy ocen
        for (int ocena : oceny) { 
            suma += ocena;
        }

        System.out.println("Suma twoich ocen to: " + suma);

        double srednia = (double) suma / iloscOcen; // obliczanie sredniej arytmetycznej

        System.out.println("Średnia arytmetyczna twoich ocen to: " + srednia);

        scan.close();
    }
}