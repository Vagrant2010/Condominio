package it.java2023;

public class ProprietariAppartamenti extends Persona implements Pagamenti{
    private int interno,piano;

    public ProprietariAppartamenti(String nome, String cognome, String indirizzo, String numeroTel, Condominio condominio) {
        super(nome, cognome, indirizzo, condominio);
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
