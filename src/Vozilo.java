public abstract class Vozilo {
    private String marka;
    private String registracija;
    private int godinaProizvodnje;

    public Vozilo(String marka, String registracija, int godinaProizvodnje) throws NeispravniPodaciException {
        if (marka.isEmpty() || registracija.isEmpty()) throw new NeispravniPodaciException("Premalo slova");
        else if (godinaProizvodnje <= 0) throw new NeispravniPodaciException("Godina ne moze biti negativna");
        this.marka = marka;
        this.registracija = registracija;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) throws NeispravniPodaciException {
        if (marka.isEmpty()) throw new NeispravniPodaciException("Premalo slova u imenu");
        this.marka = marka;
    }

    public String getRegistracija() {
        return registracija;
    }

    public void setRegistracija(String registracija) throws NeispravniPodaciException {
        if (registracija.isEmpty()) throw new NeispravniPodaciException("Premalo slova u registraciji");
        this.registracija = registracija;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) throws NeispravniPodaciException {
        if (godinaProizvodnje <= 0)
            throw new NeispravniPodaciException("Godina proizvodnje ne moze biti negativna ili 0");
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public void prikaziPodatke() {
        System.out.println("Marka: " + marka);
        System.out.println("registracija: " + registracija);
        System.out.println("Godina proizvodnje: " + godinaProizvodnje);
    }

    public String vratiPodatkeOVozilu() {
        return "Marka: " + this.marka + ", registracija: " + this.registracija + ", Godina proizvodnje: " + this.godinaProizvodnje;
    }

}
