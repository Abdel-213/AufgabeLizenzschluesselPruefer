import java.util.ArrayList;

public class Pruefer {
    public boolean istLizenzGueltig(String key){
        Conditions condition = new Conditions();
        boolean[] bool = new boolean[] {

                condition.regel1(key),
                condition.regel2(key),
                condition.regel3(key),
                condition.regel4(key),
                condition.regel5(key)
        };
        String[] message = new String[]{

                "Länge nicht korrekt.",
                "Format nicht korrekt",
                "Zusammensetzung Block 1 fehlerhaft.",
                "Zusammensetzung Block 2 fehlerhaft.",
                "Zusammensetzung Block 3 fehlerhaft."
        };

        for (int i = 0; i < bool.length; i++ ){
            if (bool[i] == true) {
                continue;

            } else {
                System.out.println("ERROR: Regel " + (i + 1) + ", " + message[i]);
                return false;

                }
        }
        System.out.println("Lizenzschlüssel ist Gültig");
        return true;
    }
}
