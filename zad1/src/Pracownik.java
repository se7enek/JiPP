abstract public class Pracownik {
    private String imie;
    private String nazwisko;
    private int czas;

    public Pracownik(String imie, String nazwisko, int czas) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.czas = czas;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getCzas() {
        return czas;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setCzas(int czas) {
        this.czas = czas;
    }

    @Override
    public String toString() {
        return "Imie: '" + imie + '\'' +
                ", Nazwisko: '" + nazwisko + '\'' +
                ", Czas: " + czas +
                ", Rola: " + getClass().getTypeName();
    }
}
