import java.time.LocalDate;

public class Student extends Osoba implements Cloneable,Comparable<Osoba>{
    private Double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, Double sredniaOcen){
        super(nazwisko,dataUrodzenia);
        this.sredniaOcen=sredniaOcen;
    }

    public Double getSredniaOcen(){
        return sredniaOcen;
    }

    @Override
    public String toString(){
        return super.toString()+" "+getClass().getName()+" ["+sredniaOcen+"]";
    }

    @Override
    public boolean equals(Object OtherStudent){
        if(!super.equals(OtherStudent)){
            return false;
        }

        Student other=(Student) OtherStudent;

        return sredniaOcen==other.sredniaOcen;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int compareTo(Osoba o){
        if(o instanceof Student){
            Student s=(Student) o;
            int check=super.compareTo(s);
            if(check!=0){
                return check;
            }
            return Double.compare(sredniaOcen,s.sredniaOcen);
        }
        return super.compareTo(o);
    }
}
