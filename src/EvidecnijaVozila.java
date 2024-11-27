import java.io.*;
import java.util.ArrayList;

public class EvidecnijaVozila {

    private final ArrayList<Vozilo> listaVozila;

    public EvidecnijaVozila() {
        this.listaVozila = new ArrayList<>();
    }

    public void dodadjVoziloUListu(Vozilo vozilo) {
        this.listaVozila.add(vozilo);
    }

    public void prikaziSvaVozila() {
        for (Vozilo vozilo : listaVozila) {
            vozilo.prikaziPodatke();
        }
    }

    public void spremiPodatkeUDatoteku(String datoteka) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(datoteka))) {
            for (Vozilo vozilo : listaVozila) {
                writer.println(vozilo.vratiPodatkeOVozilu());
            }
        } catch (IOException e) {
            System.err.println("Greška prilikom zapisivanja podataka u datoteku: " + e.getMessage());
        }
    }

    public void ucitajPodatkeIzDatoteke(String datoteka) throws IOException {
        FileReader in = null;
        try {
            File inputFile = new File(datoteka);
            in = new FileReader(inputFile);
            int c;
            System.out.println("Ispis iz datoteke " + datoteka + ":");
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.err.println("Greška prilikom citanja podataka iz datoteke: " + e.getMessage());
        } finally {
            in.close();
        }
    }
}
