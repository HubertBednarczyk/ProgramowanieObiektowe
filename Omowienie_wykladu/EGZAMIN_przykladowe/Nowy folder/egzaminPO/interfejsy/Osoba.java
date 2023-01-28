import javax.print.attribute.standard.MediaSize;
import java.time.LocalDate;

public class Osoba implements Cloneable,Comparable<Osoba>{
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia){
        this.nazwisko=nazwisko;
        this.dataUrodzenia=dataUrodzenia;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    @Override
    public String toString(){
        return getClass().getName()+" ["+nazwisko+","+dataUrodzenia+"]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public boolean equals(Object OtherOsoba){
        if(this==OtherOsoba){
            return true;
        }

        if(OtherOsoba==null){
            return false;
        }

        if(getClass()!=OtherOsoba.getClass()){
            return false;
        }

        Osoba other=(Osoba) OtherOsoba;

        return nazwisko.equals(other.nazwisko) && dataUrodzenia.equals(other.dataUrodzenia);
    }

    @Override
    public int compareTo(Osoba o) {
        int check=nazwisko.compareTo(o.nazwisko);
        if(check!=0){
            return check;
        }
        return dataUrodzenia.compareTo(o.dataUrodzenia);
    }

}
