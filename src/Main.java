import java.util.Scanner;
public class allaHjartansDagBlomma {
    public static void main(String[] args) {

        //Skriv "Hur många blad har blomman?"
        System.out.println("Hur många blad har blomman? (ange i siffra-heltal): ");

        //Läs in antalBlad som ett heltal från användaren
        Scanner scanner = new Scanner(System.in);
        int antalBlad = scanner.nextInt();

        while (antalBlad > 0) {     //Medan antalBlad > 0:

            if (antalBlad % 2 == 0) {  //Om antalBlad är jämnt delbart med 2:
                System.out.println("Älskar inte");   //Skriv "Älskar inte"
            } else {   //Annars:
                System.out.println("Älskar");   //Skriv "Älskar"
            }
            antalBlad--;
        }
        System.out.println("Nu finns det inga blad kvar.");  //Skriv "Nu finns det inga blad kvar."
    }
}
