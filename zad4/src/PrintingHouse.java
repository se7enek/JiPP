public enum PrintingHouse {
    PolishDruk(50),
    JakisPress(120),
    Costam(99);

    private int edition;

    PrintingHouse(int edition) { this.edition = edition; }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}
