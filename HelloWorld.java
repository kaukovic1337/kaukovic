// HelloWorld.java
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Vnesite material steklenice: ");
            String material = scanner.nextLine();

            System.out.print("Vnesite prostornino steklenice v litrih: ");
            double prostornina = scanner.nextDouble();
            scanner.nextLine(); // Čiščenje nove vrstice

            Steklenica steklenica = new Steklenica(material, prostornina);

            System.out.println("Steklenica ustvarjena z materialom: " + steklenica.getMaterial() + " in prostornino: " + steklenica.getProstornina() + " litrov.");

            steklenica.odpri();

            System.out.print("Vnesite količino za nalivanje: ");
            double kolicina = scanner.nextDouble();
            steklenica.nalij(kolicina);

            steklenica.zapri();
        } catch (IllegalArgumentException e) {
            System.out.println("Napaka: " + e.getMessage());
        }
    }
}