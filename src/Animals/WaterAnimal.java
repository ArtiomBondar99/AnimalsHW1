package Animals;

import Mobility.Point;
import Olympics.Medal;

public class WaterAnimal extends Animal {
    static final int MAX_DIVE = -800;
    private double diveDept;
    /**
     * Constructs a new Water Animal with the specified attributes.
     *
     * @param name      The name of the water animal.
     * @param gender    The gender of the water animal (Male, Female, Hermaphrodite).
     * @param weight    The weight of the water animal in kilograms.
     * @param speed     The speed of the water animal in kilometers per hour.
     * @param medals    The medals awarded to the water animal.
     * @param location  The location coordinates of the water animal.
     * @param diveDept  The dive depth capability of the water animal.
     */
    public WaterAnimal(String name, Gender gender, double weight, double speed,  Medal[] medals, Point location,double totalDistance,double diveDept)
    {
        super(name, gender, weight, speed, medals, location);
        this.diveDept = diveDept;
    }
    /**
     * Constructs a new Water Animal with default attributes.
     *
     */
    public WaterAnimal()
    {
        super();
        this.setLocation(new Point(50,0));
        this.diveDept = 0.0;
    }
    /**
     * Returns a string representation of the water animal, focusing on its dive depth capability.
     *
     * @return A string representation of the water animal.
     */
    @Override
    public String toString() {
        return "Water Animal" + super.toString() + "|dive Dept=" + diveDept + '}';
    }
    /**
     * Compares this water animal to the specified object. The result is true if and only if the argument
     * is not null and is a WaterAnimal object that has the same dive depth capability as this water animal.
     *
     * @param obj The object to compare this water animal against.
     * @return True if the given object represents a WaterAnimal with the same dive depth capability, false otherwise.
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (!(obj instanceof WaterAnimal))
            return false;
        WaterAnimal other = (WaterAnimal) obj;
        return this.diveDept==other.diveDept && super.equals(obj);
    }
    /**
     * Returns an empty string as water animals do not necessarily make a sound.
     *
     * @return An empty string.
     */
    @Override
    protected String getSound()
    {
        return "";
    }
    /**
     * Sets the dive depth capability of the water animal.
     *
     * @param diveDept The dive depth to set for the water animal.
     * @return True if the dive depth was set successfully, false otherwise.
     */
    public boolean setDiveDept(double diveDept)
    {
        if (diveDept < MAX_DIVE)
            return false;
        this.diveDept = diveDept;
        return true;
    }
    /**
     * Simulates the action of diving by reducing the dive depth of the water animal by a specified depth.
     *
     * @param depth The depth by which to dive.
     */
    public void Dive(double depth)
    {
        if (this.diveDept - depth < MAX_DIVE)
        {
            this.diveDept = MAX_DIVE;
        }
        else {
            this.diveDept -= depth;
        }
    }
    /**
     * Gets the dive depth capability of the water animal.
     *
     * @return The dive depth capability of the water animal.
     */
    public double getDiveDept()
    {
        return diveDept;
    }


}
