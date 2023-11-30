import Es1.Dipendente;
import entities.Dipartimento;
import entities.Livello;

public class Main1 {
    public static void main (String[] args) {
        Dipendente Marco = new Dipendente(10, Dipartimento.AMMINISTRATORE, 1000, 30, Livello.OPERARIO);
        System.out.println(Marco);
        Dipendente Luca= new Dipendente(1000,  11, 1200, 40.4, Livello.DIRIGENTE, Dipartimento.VENDITE);
        System.out.println(Luca);
    }
}
