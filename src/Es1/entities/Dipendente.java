package Es1.entities;

public class Dipendente {
    public double baseStipendio=1000;
    private int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello tipo =Livello.OPERARIO;
    private Dipartimento tips=Dipartimento.AMMINISTRATORE;


    public Dipendente(int matricola, Dipartimento tips,double baseStipendio,double importoOrarioStraordinario,Livello tipo) {
        this.matricola = matricola;
        this.tips = tips;
        this.stipendio=baseStipendio;
        this.importoOrarioStraordinario=importoOrarioStraordinario;
        this.tipo=tipo;
    }

    public Dipendente(double baseStipendio, int matricola, double stipendio, double importoOrarioStraordinario, Livello tipo, Dipartimento tips) {
        this.baseStipendio = baseStipendio;
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.tipo = tipo;
        this.tips = tips;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setTips(Dipartimento tips) {
        this.tips = tips;
    }


    public double getBaseStipendio() {
        return baseStipendio;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Livello getTipo() {
        return tipo;
    }
}
