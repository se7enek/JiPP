public enum DniTygodnia {

    pn("Poniedzialek"),
    wt("Wtorek"),
    sr("Sroda"),
    cz("Czwartek"),
    pi("Piatek"),
    so("Sobota"),
    ni("Niedziela");

    private String dzienTygodnia;

    DniTygodnia(String dzienTygodnia) {
        this.dzienTygodnia = dzienTygodnia;
    }

    public String getDzienTygodnia() {
        return dzienTygodnia;
    }

    public void setDzienTygodnia(String dzienTygodnia) {
        this.dzienTygodnia = dzienTygodnia;
    }
}
