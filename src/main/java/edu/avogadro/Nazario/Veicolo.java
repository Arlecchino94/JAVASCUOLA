package edu.avogadro.Nazario;

import java.util.Date;

public class Veicolo {
    private int numeroRuote;
    private int numeroPosti;
    private String marcaProduttrice;
    private String modello;
    private Date dataImmatricolazione;
    private int potenzaInCvKw;
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

    public int getPotenzaInCvKw() {
        return potenzaInCvKw;
    }

    public void setPotenzaInCvKw(int potenzaInCvKw) {
        this.potenzaInCvKw = potenzaInCvKw;
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
