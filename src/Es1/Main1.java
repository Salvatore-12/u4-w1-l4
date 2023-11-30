package Es1;

import Es1.entities.Dipartimento;
import Es1.entities.Dipendente;
import Es1.entities.Livello;

public class Main1 {
    public static void main (String[] args) {
        Dipendente Marco=new Dipendente(10, Dipartimento.AMMINISTRATORE,1000, 30, Livello.OPERARIO);
        System.out.println(Marco);
    }
}
