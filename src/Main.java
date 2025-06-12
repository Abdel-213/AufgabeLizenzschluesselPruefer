//import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Schlüssel
        System.out.println(" Bitte gib deinen Schlüssel ein : ");
        String key = scanner.nextLine();
        
        try {
            Pruefer condition = new Pruefer();
            condition.istLizenzGueltig(key);
        }catch (Exception e){
            System.out.println("Eingabe ist leer !! Bitte erneut versuchen");
        }
        scanner.close();
        System.out.println("Programm beendet.");

    }

}

