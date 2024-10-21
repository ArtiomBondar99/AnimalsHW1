package Animals;

import Mobility.Point;
import Olympics.Medal;

public abstract class AirAnimal extends Animal
{
    private double wingspan;

    /**
     * Constructor for creating an AirAnimal object.
     *
     * @param name      the name of the animal
     * @param gender    the gender of the animal
     * @param weight    the weight of the animal
     * @param speed     the speed of the animal
     * @param medals    the medals won by the animal
     * @param location  the location of the animal
     * @param wingspan  the wingspan of the animal
     */
    public AirAnimal(String name, Gender gender, double weight, double speed,  Medal[] medals, Point location,double totalDistance,double wingspan)
    {
        super(name, gender, weight, speed, medals, location);
        this.wingspan = wingspan;
    }
    /**
     * Default constructor for creating an AirAnimal object.
     *
     */

    public AirAnimal()
    {
        super();
        this.setLocation(new Point(0,100));
        this.wingspan = 0.0;
    }
    /**
     * Gets the wingspan of the animal.
     *
     * @return the wingspan of the animal
     */

    public double getWingspan() {
        return wingspan;
    }
    /**
     * Compares this AirAnimal to another object.
     *
     * @param obj the object to compare to
     * @return true if the objects are equal, false otherwise
     */

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (!(obj instanceof AirAnimal))
            return false;
        AirAnimal airAnimal = (AirAnimal) obj;
        return wingspan == airAnimal.wingspan && super.equals(obj);
    }
    /**
     * Returns a string representation of the AirAnimal.
     *
     * @return a string representation of the AirAnimal
     */

    @Override
    public String toString()
    {
        return "Air Animal " + super.toString() + "|wingspan=" + wingspan + '}';

    }
}
