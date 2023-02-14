package onlineshop.waren;

import java.util.Objects;

public class Artikel implements Cloneable {

  protected String beschreibung;
  protected String hersteller;

  public String getBeschreibung() {
    return beschreibung;
  }
  public void setBeschreibung(String beschreibung) {
    this.beschreibung = beschreibung;
  }

  public void setHersteller(final String hersteller) {
    this.hersteller = hersteller;
  }

  @Override
  public int hashCode() {
    return this.toString().hashCode();
  }

  @Override
  public String toString() {
    String output = "Beschreibung: " + beschreibung + "\nHersteller: " + hersteller;

    return output;
  }

  @Override
  protected Artikel clone() throws CloneNotSupportedException {
    Artikel artikel = (Artikel) super.clone();
    artikel.hersteller = this.hersteller;
    artikel.beschreibung = this.beschreibung;
    return artikel;
  }

  @Override
  public boolean equals(Object obj) {
    if (Objects.isNull(obj))
      throw new NullPointerException("Passed Object is null");

    if (!(obj instanceof Artikel))
      return false;

    Artikel foreignArtikel = (Artikel) obj;

    if (foreignArtikel == this)
      return true;

    if(foreignArtikel.beschreibung == this.beschreibung && foreignArtikel.hersteller == this.hersteller)
      return true;

    return false;
  }
}

