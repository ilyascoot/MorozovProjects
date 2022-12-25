package Comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class comparator
{
    public static void main(String[] args)
    {
        List<Car> cars = new ArrayList<>();

        Car reno = new Car(2010, "Reno Logan", 140);
        Car buggati = new Car(2008, "Buggati Veyron", 350);
        Car bmw = new Car(2012, "BMw M3", 250);

        cars.add(reno);
        cars.add(bmw);
        cars.add(buggati);

        Comparator maxspeed = new maxspeed();
        Collections.sort(cars, maxspeed);

        System.out.println(cars);
    }
}