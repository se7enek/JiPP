public class main {
    public static void main(String[] args) {
        Pracownik m1 = new Manager("Konrad", "kowalski", 500);
        Pracownik s1 = new SeniorProgramista("Wojtek", "Malcer", 1000);
        Pracownik j1 = new JuniorProgramista("Jan", "Nowak", 1500);

        int projekt = projekt(m1,j1,s1);
        System.out.println(projekt);
        Pracownik[] listaPracownikow = listaPracownikow(m1, s1, j1);

        for (Pracownik pracownik:listaPracownikow) {
            if(pracownik == null)
                continue;
            System.out.println(pracownik.toString());
        }

        System.out.println("Nasi pracownicy sa zatrudnieni lacznie: " + projekt + " godzin.");
    }

    public static int projekt(Pracownik... pracowniks){
        int liczCzas = 0;
        for (Pracownik pracownik:pracowniks) {
            liczCzas += pracownik.getCzas();

        }
        return liczCzas;
    }

    public static Pracownik[] listaPracownikow (Pracownik... pracowniks) {
        Pracownik[] tablica = new Pracownik[10];

        int licznik = 0;
        for (Pracownik pracownik:pracowniks){
            tablica[licznik] = pracownik;
            licznik++;

        }
        return tablica;

    }
}
