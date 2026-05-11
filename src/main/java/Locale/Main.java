package Locale;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale locale = Locale.forLanguageTag("hr-HR");
        System.out.println(locale.getDisplayName(locale));

    }
}
