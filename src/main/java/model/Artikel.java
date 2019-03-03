package model;

public class Artikel {

    private String naam;
    private double prijs;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public Artikel(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "naam='" + naam + '\'' +
                ", prijs=" + prijs +
                '}';
    }
}
