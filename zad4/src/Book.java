public class Book implements Message{

    @Override
    public void printMessage() {
        System.out.println("Wiadomosc z Booka");
    }

    public PrintingHouse printingHouse;

    public Book(PrintingHouse printingHouse) {
        this.printingHouse = printingHouse;
    }

    public Book() {}


    public PrintingHouse getPrintingHouse() {
        return printingHouse;
    }

    public void setPrintingHouse(PrintingHouse printingHouse) {
        this.printingHouse = printingHouse;
    }
}
