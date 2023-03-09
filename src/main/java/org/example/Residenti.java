package org.example;

public class Residenti extends Persona implements Pagamenti{

    ProprietariAppartamenti flagPropietario;

    public Residenti(String nome, String cognome, String indirizzo, String numeroTel, Condominio condominio) {
        super(nome, cognome, indirizzo, numeroTel, condominio);
    }

    @Override
    public void pagaEletricita() {

    }

    @Override
    public void pagaPulizia() {

    }

    @Override
    public void manutenzioneAnnuale() {

    }

    @Override
    public void pagaRiscaldamendo() {

    }

    @Override
    public void pagaAcqua() {

    }

    @Override
    public void pagaRateAmministratore() {

    }

    @Override
    public void PagaPortinaio() {

    }
}
