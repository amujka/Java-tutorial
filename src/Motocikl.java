public class Motocikl extends Vozilo {
    private String tipMotora;

    public Motocikl(String marka, String registracija, int godinaProizvodnje, String tipMotora) throws NeispravniPodaciException {
        super(marka, registracija, godinaProizvodnje);
        if (tipMotora.isEmpty()) throw new NeispravniPodaciException("Premalo slova u tipu motora");
        this.tipMotora = tipMotora;
    }

    public String getTipMotora() {
        return this.tipMotora;
    }

    public void setTipMotora(String tipMotora) throws NeispravniPodaciException {
        if (tipMotora.isEmpty()) throw new NeispravniPodaciException("Premalo slova u tipu motora");
        this.tipMotora = tipMotora;
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println("Tip motora: " + tipMotora + "\n");
    }

    @Override
    public String vratiPodatkeOVozilu() {
        return super.vratiPodatkeOVozilu() + ", Tip motora: " + this.tipMotora;
    }
}
