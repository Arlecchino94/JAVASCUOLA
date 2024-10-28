package edu.avogadro.Nazario;

public class Pullman extends Veicolo{
    private String tipoServizio;
    private String numeroLinea;
    private String orarioInizio;
    private String orarioFine;
    private String ingressoDisabili;

    public String getTipoServizio() {
        return tipoServizio;
    }

    public void setTipoServizio(String tipoServizio) {
        this.tipoServizio = tipoServizio;
    }

    public String getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(String numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public String getOrarioInizio() {
        return orarioInizio;
    }

    public void setOrarioInizio(String orarioInizio) {
        this.orarioInizio = orarioInizio;
    }

    public String getOrarioFine() {
        return orarioFine;
    }

    public void setOrarioFine(String orarioFine) {
        this.orarioFine = orarioFine;
    }

    public String getIngressoDisabili() {
        return ingressoDisabili;
    }

    public void setIngressoDisabili(String ingressoDisabili) {
        this.ingressoDisabili = ingressoDisabili;
    }
}
