package edu.avogadro.Nazario;

public class Auto extends Veicolo {
    private String numeroPorte;
    private String livelloSicurezza;
    private String colore;
    private String categoriaDiAuto;

    public String getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(String numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    public String getLivelloSicurezza() {
        return livelloSicurezza;
    }

    public void setLivelloSicurezza(String livelloSicurezza) {
        this.livelloSicurezza = livelloSicurezza;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String getCategoriaDiAuto() {
        return categoriaDiAuto;
    }

    public void setCategoriaDiAuto(String categoriaDiAuto) {
        this.categoriaDiAuto = categoriaDiAuto;
    }
}
