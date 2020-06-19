import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class Main {

    public static void main(String[] args) {

        List<Double> lista = new ArrayList<>();

        lista.add(55.00);
        lista.add(12.00);
        lista.add(40.50);
        lista.add(10.00);
        lista.add(100.00);
        //lista.add(100.00);

        double suma = 0.00;

        for (double i :lista
                ) {
            suma += i;

        }

        System.out.println("Suma: " + suma);

        System.out.println("Srednia: " + (suma / lista.size()));

        double mediana = 0.00;

        if (even(lista.size()))
            mediana = (lista.get(lista.size()/2) + lista.get(lista.size()/2 - 1))/2;
        else
            mediana = lista.get(lista.size()/2);

        System.out.println("Mediana: " + mediana);

    }

    public static boolean even(int x){
        return x % 2 == 0;
    }

}
