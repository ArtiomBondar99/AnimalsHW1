package Animals;

import Mobility.Mobile;
import Mobility.Point;
import Olympics.Medal;

import java.util.Arrays;

public abstract class Animal extends Mobile
{

    @Override
    public String toString()
    {
        return "{ name:" +name + "|gender:" + gender + "|weight:" + weight + "|speed:"+speed+ "|medals:"+ Arrays.toString(getMedals()) +"|"+ super.toString() + "}";
    }


    public enum Gender { Male, Female, Hermaphrodite };
    private String name;
    private Gender gender;
    private double weight;
    private double speed;
    private Medal[] medals;


    /**
     * Default constructor for Animal, initializing with default values.
     */
    public Animal()
    {
        super();
        this.name = "Unknown";
        this.gender = Gender.Male;
        this.weight = 0;
        this.speed = 0;
        this.medals = null;
    }

    /**
     * Constructs an Animal object with the specified attributes.
     *
     * @param name     the name of the animal
     * @param gender   the gender of the animal
     * @param weight   the weight of the animal
     * @param speed    the speed of the animal
     * @param medals   the medals won by the animal
     * @param location the location of the animal
     */

    public Animal(String name, Gender gender, double weight, double speed, Medal[] medals, Point location)
    {
        super(location);
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.speed = speed;
        this.medals = new Medal[medals.length];
        for (int i = 0; i < medals.length; i++)
            this.medals[i] = medals[i];
    }
    /**
     * Default constructor for Animal, initializing with default values.
     *
     */

    /**
     * Gets the name of the animal.
     *
     * @return the name of the animal
     */
    public String getName(){ return name;}
    /**
     * Gets the gender of the animal.
     *
     * @return the gender of the animal
     */
    public Gender getGender(){ return gender;}
    /**
     * Gets the weight of the animal.
     *
     * @return the weight of the animal
     */
    public double getWeight(){ return weight;}
    /**
     * Gets the speed of the animal.
     *
     * @return the speed of the animal
     */
    public double getSpeed(){ return speed;}

    /**
     * Gets the medals won by the animal.
     *
     * @return the medals won by the animal
     */
    public Medal[] getMedals(){ return medals;}


    /**
     * Returns the sound the animal makes.
     *
     * @return the sound of the animal
     */
    protected abstract String getSound();
    /**
     * Makes the animal produce its sound.
     */
    public void makeSound()
    {
        System.out.println("Animal " + name + " said " + getSound());
    }
    /**
     * Compares this animal to another object.
     *
     * @param obj the object to compare to
     * @return true if the objects are equal, false otherwise
     */

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (!(obj instanceof Animal))
            return false;
        Animal other = (Animal) obj;
        return name.equals(other.name) && gender.equals(other.gender) && weight == other.weight && speed==other.speed && medals.equals(other.medals) && super.equals(obj);
    }
}
