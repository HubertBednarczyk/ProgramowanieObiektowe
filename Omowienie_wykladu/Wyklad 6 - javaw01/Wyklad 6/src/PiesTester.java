class Pies{
    int wielkosc;
    String rasa;
    String imie;
    void przedstawienie_psa(){
        System.out.println("Pies waży: "+wielkosc+" kg, jego rasa to: "+rasa+", a imie to: "+imie);
    }
    void szczekaj(){
        System.out.println("Chau! Chauuu!");
    }
}

public class PiesTester{
    public static void main(String[] args){
        Pies p = new Pies();
        p.wielkosc = 5;
        p.rasa = "Shitzu";
        p.imie = "Fado";
        p.szczekaj();
        p.przedstawienie_psa();
    }
}


