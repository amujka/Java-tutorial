import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        EvidecnijaVozila evidencija = new EvidecnijaVozila();
        try {
            Automobil auto1 = new Automobil("Porche", "ZG-1234-AA", 2015, 3);
            evidencija.dodadjVoziloUListu(auto1);

            Automobil auto2 = new Automobil("Mercedes", "KA-4321-AB", 2010, 5);
            evidencija.dodadjVoziloUListu(auto2);

            Motocikl moto1 = new Motocikl("Honda", "ST-5678-BB", 2012, "Sportski");
            evidencija.dodadjVoziloUListu(moto1);

            Motocikl moto2 = new Motocikl("Harley Davidson", "CK-123-GM", 2018, "Chopper");
            evidencija.dodadjVoziloUListu(moto2);

            Motocikl moto3 = new Motocikl("Vespa", "SB-222-MG", 2000, "scooter");
            evidencija.dodadjVoziloUListu(moto3);

        } catch (NeispravniPodaciException e) {
            System.out.println(e.getMessage());
        }

        evidencija.prikaziSvaVozila();
        evidencija.spremiPodatkeUDatoteku("vozila.txt");
        evidencija.ucitajPodatkeIzDatoteke("vozila.txt");

    }

}
