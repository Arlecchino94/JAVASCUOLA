package edu.avogadro.Nazario;

import java.util.Date;

public class Veicolo {
    public final double KW_TO_CV_FACTOR = 1.35962;
    private int numeroRuote;
    private int numeroPosti;
    private String marcaProduttrice;
    private String modello;
    private Date dataImmatricolazione;
    private int potenzaKW;
    private int cilindrata;
    private String tipoMotore;
    private String intestatarioProprietario;
    private String aziendaProprietaria;
    private String targa;



    public int getNumeroRuote() {
        return numeroRuote;
    }

    public void setNumeroRuote(int numeroRuote) {
        this.numeroRuote = numeroRuote;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

    public String getMarcaProduttrice() {
        return marcaProduttrice;
    }

    public void setMarcaProduttrice(String marcaProduttrice) {
        this.marcaProduttrice = marcaProduttrice;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Date getDataImmatricolazione() {
        return dataImmatricolazione;
    }

    public void setDataImmatricolazione(Date dataImmatricolazione) {
        this.dataImmatricolazione = dataImmatricolazione;
    }

    public long getPotenzaCV() {
        return Math.round(potenzaKW * KW_TO_CV_FACTOR);
    }

    public void setPotenzaKW(int potenzaKW) {
        this.potenzaKW = potenzaKW;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getTipoMotore() {
        return tipoMotore;
    }

    public void setTipoMotore(String tipoMotore) {
        this.tipoMotore = tipoMotore;
    }

    public String getIntestatarioProprietario() {
        return intestatarioProprietario;
    }

    public void setIntestatarioProprietario(String intestatarioProprietario) {
        this.intestatarioProprietario = intestatarioProprietario;
    }

    public String getAziendaProprietaria() {
        return aziendaProprietaria;
    }

    public void setAziendaProprietaria(String aziendaProprietaria) {
        this.aziendaProprietaria = aziendaProprietaria;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }
}
