package onlineshop.waren;

import jdk.jshell.spi.ExecutionControl;

import java.util.Objects;
import java.util.Scanner;

public class Buch extends Artikel implements Cloneable {
  protected int seiten;
  protected String autor;
  protected String titel;
  Scanner scanner;

  @Override
  public String getBeschreibung() {
    return super.getBeschreibung();
  }

  @Deprecated
  public void setSeiten(int seiten) {
    this.seiten = seiten;
  }

  public void setAnzahlSeiten(int seiten) {
    this.seiten = seiten;
  }

  public void setAutor(final String autor) {
    this.autor = autor;
  }

  public void setTitel(final String titel) {
    this.titel = titel;
  }

  @Override
  public Buch clone() {
    Buch buch = null;

    try {
      buch = (Buch)super.clone();
      buch.titel = this.titel;
      buch.autor = this.autor;
      buch.seiten = this.seiten;
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return buch;
  }

  @Override
  public String toString() {
    return super.toString() + "\nBuch{" +
      "seiten=" + seiten +
      ", autor='" + autor + '\'' +
      ", titel='" + titel + '\'' +
      ", scanner=" + scanner +
      '}';
  }

  @Override
  public boolean equals(Object obj){

    if(Objects.isNull(obj))
      throw new NullPointerException("Passed Object is null");

    if(obj == this)
      return true;

    if(!(obj instanceof Sachbuch))
      return false;

    Sachbuch foreignSachbuch = (Sachbuch) obj;

    if(foreignSachbuch.beschreibung == this.beschreibung && foreignSachbuch.hersteller == this.hersteller
    && foreignSachbuch.seiten == this.seiten && foreignSachbuch.autor == this.autor && foreignSachbuch.titel == this.titel)
      return true;
    else
      return false;
  }

  @Override
  public int hashCode(){
    return this.toString().hashCode();
  }
}
