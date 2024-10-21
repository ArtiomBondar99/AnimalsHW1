package Animals;
import Mobility.Point;
import Olympics.Medal;

import java.util.Arrays;

public class Alligator extends WaterAnimal implements IReptile
{
    private String AreaOfLiving;
    /**
     * Constructor for creating an Alligator object.
     *
     * @param name         the name of the alligator
     * @param gender       the gender of the alligator
     * @param weight       the weight of the alligator
     * @param speed        the speed of the alligator
     * @param medals       the medals won by the alligator
     * @param location     the location of the alligator
     * @param diveDept     the dive depth of the alligator
     * @param AreaOfLiving the area where the alligator lives
     */
    public Alligator(String name, Gender gender, double weight, double speed, Medal[] medals, Point location,double diveDept,double totalDistance,String AreaOfLiving)
    {
        super(name,gender,weight,speed,medals,location,diveDept,totalDistance);
        this.AreaOfLiving = AreaOfLiving;
    }
    /**
     * Default constructor for creating an Alligator object.
     *
     */
    public Alligator()
    {
        super();
        this.AreaOfLiving = "";
    }

    /**
     * Attempts to increase the speed of the object.
     * If the resulting speed exceeds the maximum speed limit,
     * the speed is set to the maximum speed.
     *
     * @param speed the amount to increase the current speed by
     * @return true if the speed was successfully increased without exceeding the maximum speed,
     *         false if the speed was set to the maximum speed
     */
    @Override
    public boolean speedUp(int speed)
    {
        if (getSpeed() + speed > MAX_SPEED)
        {
            setSpeed(MAX_SPEED);
            return false;
        }
        setSpeed(MAX_SPEED + speed);
        return true;
    }
    /**
     * Sets the speed of the object.
     * If the specified speed is less than zero, the speed is set to zero.
     *
     * @param speed the speed to set
     * @return true if the speed was set successfully, false if the speed was set to zero
     */
    protected boolean setSpeed(double speed)
    {
        if (speed<0)
        {
            this.setSpeed(0);
            return false;
        }
        this.setSpeed(speed);
        return true;
    }
    /**
     * Returns the sound the alligator makes.
     *
     * @return the sound of the alligator
     */
    @Override
    public String getSound()
    {
        return "Roar";
    }
    /**
     * Gets the area where the alligator lives.
     *
     * @return the area of living
     */

    public String getAreaOfLiving()
    {
        return AreaOfLiving;
    }
    /**
     * Sets the area where the alligator lives.
     *
     * @param AreaOfLiving the area of living to set
     * @return true if the area of living is valid and set, false otherwise
     */
    public boolean setAreaOfLiving(String AreaOfLiving)
    {
        if(AreaOfLiving==null || AreaOfLiving.isEmpty())
            return false;
        this.AreaOfLiving = AreaOfLiving;
        return true;
    }

    /**
     * Compares this alligator to another object.
     *
     * @param obj the object to compare to
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (!(obj instanceof Alligator))
            return false;
        Alligator other = (Alligator) obj;
        return AreaOfLiving.equals(other.AreaOfLiving) && super.equals(obj);
    }

    /**
     * Returns a string representation of the alligator.
     *
     * @return a string representation of the alligator
     */
    @Override
    public String toString()
    {

        return "Alligator is: " +super.toString() + "Area Of Living: " + AreaOfLiving+'}' ;
    }

}
