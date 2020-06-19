import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Message book = new Book();
        Message publication = new Publication();

        print(book);
        publication.pokazCzas();
        print(publication);
        book.pokazCzas();

        String cos = DniTygodnia.cz.toString();

        DniTygodnia[] values = DniTygodnia.values();
//        for (DniTygodnia dniTygodnia: values){
//            System.out.println(dniTygodnia.toString());
//        }

        //System.out.println(ok2.toString());

        System.out.println("Wprowadz kod dnia: (pn/wt/sr/cz/pi/so/ni)");
        Scanner scanner = new Scanner(System.in);
        String wprowadz = scanner.nextLine().toLowerCase();


        DniTygodnia wybranyDzien = DniTygodnia.valueOf(wprowadz);
        System.out.println("Wybrany dzien: " + wybranyDzien.getDzienTygodnia());


        //String czwartek = DniTygodnia.pn.toString();

        //System.out.println(czwartek);


    }

    public static void print(Message message) {

        message.printMessage();

    }

}


//    Proszę zrealizować interfejs opisujący dowolny fragment rzeczywistości.
//    Proszę zaproponować realizacje tego interfejsu w klasach implementujących go.
//    Proszę wyposażyć interfejs w domyślne metody.