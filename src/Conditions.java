public class Conditions {

    public boolean regel1(String key) {
        if (key.length() != 14) {
            return false;
        }
        return true;
    }

    public boolean regel2(String key){   // charAt()
        char zeichen5 = key.charAt(4);
        char zeichen11 = key.charAt(10);
        if ( zeichen5 != '-' ||  zeichen11 != '-' ){
            return false;
        }
        return true;
    }

    public boolean regel3(String key) {
        String block1 = key.substring(0, 4);
        int anzahlGrossbuchstaben = 0;

        for (int i = 0; i < block1.length(); i++) {
            char c = block1.charAt(i);
           if (!Character.isUpperCase(c)) {
               return false;
           }
        }
        return true;
    }

    public boolean regel4(String key) {
        String block2 = key.substring(5, 10);
        int anzahlGrossbuchstaben = 0;
        int anzahlZiffern = 0;
        for (int i = 0; i < block2.length(); i++) {
            char c = block2.charAt(i);
            if (Character.isUpperCase(c)) {
                anzahlGrossbuchstaben++;
            } else if (Character.isDigit(c)) {
                anzahlZiffern++;
            }
            if (anzahlGrossbuchstaben == 2 && anzahlZiffern == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean regel5(String key) {
        String block3 = key.substring(11);
        int anzahlGrossbuchstaben = 0;

        for (int i = 0; i < block3.length(); i++) {
            char c = block3.charAt(i);
            if (Character.isUpperCase(c)) {
                anzahlGrossbuchstaben++;
            }
        }
        if (anzahlGrossbuchstaben != 2 || key.charAt(13) != '7') {
                    return false;
        }
        return true;
    }
}
