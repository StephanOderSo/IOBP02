package onlineshop;

import onlineshop.waren.Artikel;
import onlineshop.waren.Buch;
import onlineshop.waren.Sachbuch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Diese Klasse stellt den Einstiegspunkt in das Programm dar.
 * Dies Klasse beinhaltet die <code>mmain</code>-Methode, mit der
 * das Programm gestartet wird. Die <code>main</code>-Methode erzeugt
 * alle benötigten Objekte selbst und beendet sich, nachdem alle
 * Anweisungen abgearbeitet wurden.
 *
 * @author Alfred Walther
 * @version 1.0
 */
public class Main {
  private static Logger LOGGER = LogManager.getLogger(Main.class);

  /**
   * Der verwendete Online Shop.
   */
  public OnlineShop onlineShop = null;

  public static void main(String[] args) {
    // write your code here
    Buch buch = neuesBuch("asdfasdf", "asdfasdfasdf", "asdfasdf", 333);
    Buch buch2 = buch.clone();
    System.out.println("buch2 = " + buch2);

    execEinheit2();

  }

  public static void execEinheit2() {
    Artikel a1 = new Artikel();

    a1.setHersteller("1.Hersteller");
    a1.setBeschreibung("1.Beschreibung");

    Artikel a1_1 = a1;

    System.out.println("Starte Einheit 2");
    System.out.println("Vergleiche Artikel a1 mit a1_1. => Gleicher Artikel, da Slot geklont");
    System.out.println("Erwatetes Ergebnis: 'True'\nErgebnis der Artikel.equalsMethode: " + a1.equals(a1_1));

    Artikel a2 = new Artikel();
    a1.setHersteller("2.Hersteller");
    a1.setBeschreibung("2.Beschreibung");

    System.out.println("Vergleiche Artikel a1 mit a2. => Gleicher Artikel, da Slot geklont");
    System.out.println("Erwatetes Ergebnis: 'False'\nErgebnis der Artikel.equalsMethode: " + a1.equals(a2));

    System.out.println("Hashcode von a1: " + a1.hashCode());
    System.out.println("Hashcode von a1_1: " + a1_1.hashCode());
    System.out.println("Hashcode von a2: " + a2.hashCode());



    Sachbuch s1 = new Sachbuch();
    s1.setHersteller("Hersteller1");
    s1.setAnzahlSeiten(5000);
    s1.setAutor("Autor1");
    s1.setTitel("Titel1");
    s1.setThema("Thema1");
    System.out.println("Neues Sachbach s1: " + s1.toString());

    Sachbuch s2 = s1.clone();
    System.out.println("Neues Sachbach s2 als Clone von s2: " + s1.toString());
    System.out.println("Hashcode von S1: " + s1.hashCode());
    System.out.println("Hashcode von S2: " + s2.hashCode());
    System.out.println("s1 == s2: " + (s1 == s2));
    System.out.println("s1.equals(s2): " + (s1.equals(s2)));




    System.out.println("");


    System.out.println();
    System.out.println("Einheit 2 beendet");

  }


  /**
   * Legt ein neues Buch and und benachrichtigt die
   * Verwaltungsobjekte darüber.
   *
   * @param autor      Name des Autors des neuen Buches
   * @param titel      Titel des neuen Buches
   * @param hersteller Hersteller des neuen Buches
   * @param bestand    Anzahl des Buches im Lager
   * @return neue Buch-Instanz
   * @throws RuntimeException wenn das Aktualisieren des Bestandes fehlschlägt
   */
  static public Buch neuesBuch(String autor, String titel,
                               String hersteller, int bestand) {
    Buch neuesBuch = new Buch();
    neuesBuch.setAutor(autor);
    neuesBuch.setTitel(titel);
    neuesBuch.setHersteller(hersteller);
    return neuesBuch;
  }
}
