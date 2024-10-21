package Animals;
import Mobility.Point;
import Olympics.Medal;

import java.util.Arrays;

public class Whale extends WaterAnimal
{
    private String foodType;
    /**
     * Constructs a new Whale with the specified attributes.
     *
     * @param name      The name of the whale.
     * @param gender    The gender of the whale (Male, Female, Hermaphrodite).
     * @param weight    The weight of the whale in kilograms.
     * @param speed     The speed of the whale in kilometers per hour.
     * @param medals    The medals awarded to the whale.
     * @param location  The location coordinates of the whale.
     * @param diveDept  The dive depth capability of the whale.
     * @param foodType  The type of food that the whale consumes.
     */
    public Whale(String name, Gender gender, double weight, double speed,Medal[] medals, Point location,double diveDept, String foodType)
    {
        super(name, gender,weight,speed,medals,location,diveDept,diveDept);
        this.foodType = foodType;
    }
    /**
     * Default constructor for creating an Whale object.
     *
     */
    public Whale()
    {
        super();
        this.foodType = "Unknown";
    }
    /**
     * Returns the sound produced by the whale.
     *
     * @return The sound "Splash".
     */
    @Override
    public String getSound()
    {
        return "Splash";
    }
    /**
     * Retrieves the type of food that the whale consumes.
     *
     * @return The food type of the whale.
     */
    public String getFoodType() {return foodType;}
    /**
     * Sets the type of food that the whale consumes.
     *
     * @param foodType The food type to set for the whale.
     * @return True if the food type was set successfully, false otherwise.
     */
    public boolean setFoodType(String foodType)
    {
        if (foodType == null)
            return false;
        this.foodType = foodType;
        return true;
    }
    /**
     * Compares this whale to the specified object. The result is true if and only if the argument
     * is not null and is a Whale object that has the same food type as this whale.
     *
     * @param obj The object to compare this whale against.
     * @return True if the given object represents a Whale with the same food type, false otherwise.
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (!(obj instanceof Whale))
            return false;
        Whale other = (Whale) obj;
        return foodType.equals(other.foodType);
    }
    /**
     * Returns a string representation of the whale, focusing on its attributes including food type.
     *
     * @return A string representation of the whale.
     */
    @Override
    public String toString() {
        return "Whale is: " + super.toString() + "|foodType: " + foodType + '}';
    }
}
