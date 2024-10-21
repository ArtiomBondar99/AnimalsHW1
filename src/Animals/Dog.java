package Animals;
import Mobility.Point;
import Olympics.Medal;

import java.util.Arrays;

public class Dog extends TerrestrialAnimals
{
    private String breed;
    /**
     * Constructs a Dog object with the specified attributes.
     *
     * @param name      the name of the dog
     * @param gender    the gender of the dog
     * @param weight    the weight of the dog
     * @param speed     the speed of the dog
     * @param medals    the medals won by the dog
     * @param location  the location of the dog
     * @param breed     the breed of the dog
     */
    public Dog (String name, Gender gender, double weight, double speed,Medal[] medals, Point location,int noLegs,double totalDistance, String breed)
    {
        super(name,gender,weight,speed,medals,location,0.0,4);
        this.breed = breed;
    }
    /**
     * Default constructor for creating an Dog object.
     *
     */
    public Dog()
    {
        super();
        this.breed = "Male";
    }
    /**
     * Returns the sound the dog makes.
     *
     * @return the sound of the dog
     */

    @Override
    protected String getSound()
    {
        return "Woof Woof";
    }
    /**
     * Returns the breed of the dog.
     *
     * @return the breed of the dog
     */
    public String getBreed()
    {
        return breed;
    }
    /**
     * Sets the breed of the dog.
     *
     * @param breed the new breed
     * @return true if the breed was set successfully, false otherwise
     */
    public boolean setBreed(String breed)
    {
        if (breed == null || breed.isEmpty())
            return false;
        this.breed = breed;
        return true;
    }
    /**
     * Returns a string representation of the dog.
     *
     * @return a string representation of the dog
     */
    @Override
    public String toString()
    {
        return "Dog is:" + super.toString() + "breed=" + breed + '}';


    }
    /**
     * Compares this dog to another object.
     *
     * @param obj the object to compare to
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if (!(obj instanceof Dog))
            return false;
        Dog other = (Dog) obj;
        return breed.equals(other.breed) && super.equals(other);
    }
}
