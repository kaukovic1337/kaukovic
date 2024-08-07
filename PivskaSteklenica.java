// Predpostavljamo, da razred Steklenica že obstaja
public class Steklenica {
    private String ime;
    private double volumen; // V litrih

    public Steklenica(String ime, double volumen) {
        this.ime = ime;
        this.volumen = volumen;
    }

    public String getIme() {
        return ime;
    }

    public double getVolumen() {
        return volumen;
    }

    @Override
    public String toString() {
        return "Steklenica{ime='" + ime + "', volumen=" + volumen + "}";
    }
}