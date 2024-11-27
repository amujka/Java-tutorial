public class Automobil extends Vozilo {
    private int brojVrata;

    public Automobil(String marka, String registracija, int godinaProizvodnje, int brojVrata) throws NeispravniPodaciException {
        super(marka, registracija, godinaProizvodnje);
        if (brojVrata <= 0) throw new NeispravniPodaciException("brojVrata ne moze biti negativan");
        this.brojVrata = brojVrata;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) throws NeispravniPodaciException {
        if (brojVrata <= 0) throw new NeispravniPodaciException("brojVrata ne moze biti negativan");
        this.brojVrata = brojVrata;
    }

    @Override
    public void prikaziPodatke() {
        super.prikaziPodatke();
        System.out.println("Broj vrata: " + brojVrata + "\n");
    }

    @Override
    public String vratiPodatkeOVozilu() {
        return super.vratiPodatkeOVozilu() + ", Broj vrata: " + this.brojVrata;
    }
}
