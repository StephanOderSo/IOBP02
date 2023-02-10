package onlineshop.waren;

public class Sachbuch extends Buch {
    private static final String KLASSEN_PRAEFIX = "SB";
    private String thema;

    public Sachbuch() {
    }

    public String getThema() {
        return thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }

    /**
    * fasst alle Themen des Sachbuches zusammen
     * @return Zusammenfassung als String
    * */
    public String zusammenfassen() {
        String zusammenfassung = "";
        int anzahlThemen = getAnzahlThemen();

        if (thema == null) {
            return "";
        }

        for (int i = 0; i < anzahlThemen; i++) {
            zusammenfassung += "Thema " + i + ":\n";
        }
        return zusammenfassung;
    }

    /**
     * gibt Themenahzahl des Sachbuches zurueck
     * @return Themenanzahl (int)
     * */
    private int getAnzahlThemen() {
        return 0;
    }
}
