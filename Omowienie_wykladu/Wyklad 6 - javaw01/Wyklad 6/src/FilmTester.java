class Film{
    String tytul;
    String rodzaj;
    int ocena;

    void odtworz(){
        System.out.println("Odtwarzamy film.");
    }
    void wypiszInfo(){
        System.out.println("Tytuł: "+tytul);
        System.out.println("Rodzaj: "+rodzaj);
        System.out.println("Ocena: "+ocena);
    }
}

public class FilmTester{
    public static void main(String[] args){
        Film pierwszy = new Film();
        pierwszy.tytul = "Tarzan";
        pierwszy.rodzaj = "Fantastyka";
        pierwszy.ocena = 8;
        pierwszy.wypiszInfo();
        Film drugi = new Film();
        drugi.tytul = "Avatar 2";
        drugi.rodzaj = "Fantastyka";
        drugi.ocena = 9;
        drugi.odtworz();
    }
}