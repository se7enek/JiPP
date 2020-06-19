import static java.time.LocalDate.now;

public class Publication implements Message {

    @Override
    public void printMessage() {
        System.out.println("Wiadomosc z Publication");
    }

    @Override
    public void pokazCzas() {
        System.out.println(now());
    }
}
