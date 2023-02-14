package onlineshop.waren;

import jdk.jshell.spi.ExecutionControl;

import java.util.Objects;

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

    @Override
    public String toString(){
        return super.toString() + "\nThema:" + thema;
    }

//    @Override
//    public boolean equals(Object obj)
//    {
//        if(Objects.isNull(obj))
//            throw new NullPointerException();
//
//        // und so weiter....
//        return false;
//
//    }

    @Override
    public Sachbuch clone(){
        Sachbuch sachbuch = null;
        sachbuch = (Sachbuch) super.clone();

        sachbuch.thema = this.thema;

        return sachbuch;
    }

    @Override
    public int hashCode(){
        return this.toString().hashCode();
    }
}
