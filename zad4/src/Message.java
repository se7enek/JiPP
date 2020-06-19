public interface Message {

    void printMessage();

    default void pokazCzas(){
        System.out.println("Placeholder for Czas");
    }

}
