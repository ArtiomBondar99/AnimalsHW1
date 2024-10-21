package Animals;
import Mobility.Point;
import Olympics.Medal;

import java.util.Arrays;

public class Cat extends TerrestrialAnimals
{
    private boolean castrated;
    /**
     * Constructs a Cat object with the specified attributes.
     *
     * @param name      the name of the cat
     * @param gender    the gender of the cat
     * @param weight    the weight of the cat
     * @param speed     the speed of the cat
     * @param medals    the medals won by the cat
     * @param location  the location of the cat
     * @param castrated whether the cat is castrated
     * @throws Exception if an error occurs during initialization
     */
    public Cat(String name, Animal.Gender gender, double weight, double speed, Medal[] medals, Point location,double totalDistance,int noLegs ,boolean castrated)
    {
        super(name,gender,weight,speed,medals,location,0.0,4);
        this.castrated=castrated;
    }
    /**
     * Default constructor for creating an Cat object.
     *
     */

    public Cat()
    {
        super();
        this.castrated=false;
    }
    /**
     * Returns the sound the cat makes.
     *
     * @return the sound of the cat
     */
    @Override
    protected String getSound()
    {
        return "Meow";
    }
    /**
     * Checks if the cat is castrated.
     *
     * @return true if the cat is castrated, false otherwise
     */
    public boolean isCastrated()
    {
        return castrated;
    }
    /**
     * Sets the castrated status of the cat.
     *
     * @param castrated the new castrated status
     * @return true if the status was set successfully
     */
    public boolean setCastrated(boolean castrated)
    {
        this.castrated = castrated;
        return true;
    }
    /**
     * Returns a string representation of the cat.
     *
     * @return a string representation of the cat
     */
    @Override
    public String toString()
    {

        return "Cat is: "+ super.toString() + "|is castrated: " + castrated + '}';
    }
    /**
     * Compares this cat to another object.
     *
     * @param obj the object to compare to
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this==obj)
            return true;
        if (!(obj instanceof Cat))
            return false;
        Cat cat = (Cat)obj;
        return this.castrated==cat.castrated && super.equals(cat);

    }


}
