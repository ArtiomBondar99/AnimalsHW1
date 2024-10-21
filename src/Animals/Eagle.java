package Animals;
import Mobility.Point;
import Olympics.Medal;

import java.util.Arrays;

public class Eagle extends AirAnimal {
    private double altitudeOfFlight;
    static final int MAX_ALTITUDE = 1000;
    /**
     * Constructs an Eagle object with the specified attributes.
     *
     * @param name             the name of the eagle
     * @param gender           the gender of the eagle
     * @param weight           the weight of the eagle
     * @param speed            the speed of the eagle
     * @param medals           the medals won by the eagle
     * @param location         the location of the eagle
     * @param wingspan         the wingspan of the eagle
     * @param altitudeOfFlight the altitude of flight of the eagle
     */
    public Eagle(String name, Gender gender, double weight, double speed, Medal[] medals, Point location,double wingspan, double altitudeOfFlight)
    {
        super(name,gender,weight,speed,medals,location,0.0,wingspan);
        this.altitudeOfFlight = altitudeOfFlight;
    }
    /**
     * Default constructor for creating an Eagle object.
     *
     */
    public Eagle()
    {
        super();
        this.altitudeOfFlight = MAX_ALTITUDE;
    }
    /**
     * Returns a string representation of the eagle.
     *
     * @return a string representation of the eagle
     */

    @Override
    public String toString() {
        return "Eagle is: "+super.toString()+"|Altitude of flight: "+altitudeOfFlight;
    }
    /**
     * Returns the altitude of flight of the eagle.
     *
     * @return the altitude of flight
     */
    public double getAltitudeOfFlight() {return altitudeOfFlight;}
    /**
     * Compares this eagle to another object.
     *
     * @param obj the object to compare to
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if (!(obj instanceof Eagle))
            return false;
        Eagle eagle = (Eagle)obj;
        return altitudeOfFlight==eagle.altitudeOfFlight && super.equals(eagle);
    }
    /**
     * Sets the altitude of flight of the eagle.
     *
     * @param altitudeOfFlight the new altitude of flight
     * @return true if the altitude was set successfully, false if it exceeded the maximum altitude
     */
    public boolean setltitudeOfFlight(double altitudeOfFlight)
    {
        if (altitudeOfFlight > MAX_ALTITUDE)
        {
            this.altitudeOfFlight = MAX_ALTITUDE;
            return false;
        }
        else
        {
            this.altitudeOfFlight = altitudeOfFlight;
            return true;
        }
    }
    /**
     * Returns the sound the eagle makes.
     *
     * @return the sound of the eagle
     */
    @Override
    protected String getSound() {
        return "Clack-wack-chack";
    }
}
