package Comparator;

import java.util.Comparator;

public class maxspeed implements Comparator<Car>
{
    public int compare(Car carOne, Car carTwo)
    {
        return carOne.getMaxSpeed() - carTwo.getMaxSpeed();
    }
}
