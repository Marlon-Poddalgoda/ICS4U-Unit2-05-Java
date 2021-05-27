/**
 * This pclass file is for the Vehicle Class.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-25
 */

public class Vehicle {
    // Class for Vehicle

    // fields
    /**
    * License number.
    */
    private String licenseNum;
    /**
    * Colour.
    */
    private String colour;
    /**
    * Number of doors.
    */
    private int numOfDoors;
    /**
    * Speed.
    */
    private int speed;
    /**
    * Max Speed.
    */
    private int maxSpeed;

    // constructor
    /**
    * This contructor creates a base vehicle.
    */
    public Vehicle() {
        this.licenseNum = null;
        this.colour = "white";
        this.numOfDoors = 4;
        speed = 0; // initial speed of 0
        maxSpeed = 120; // speed in km per hour
    }

    // Getters
    /**
    * This getter returns the license plate number.
    * @return licenseNum This is the license number.
    */
    public String getLicense() {
        return licenseNum;
    }

    /**
    * This getter returns the colour.
    * @return colour This is the colour.
    */
    public String getColour() {
        return colour;
    }

    //setters
    /**
    * This setter sets the license plate number.
    * @param inputLicense This is the license number.
    */
    public void setLicense(final String inputLicense) {
        this.licenseNum = inputLicense;
    }

    /**
    * This setter sets the vehicle colour.
    * @param inputColour This is the colour of the car.
    */
    public void setColour(final String inputColour) {
        this.colour = inputColour;
    }

    //methods
    /**
    * This method accelerates the car.
    * @param increaseSpeed This is the acceleration.
    * @return speed This is the speed of the car.
    */
    public int accelerate(final int increaseSpeed) throws Exception {
        // adds speed to vehicle
        try {
            this.speed += increaseSpeed;

            if (this.speed > maxSpeed) {
                this.speed = maxSpeed;
                return this.speed;
            } else {
                return this.speed;
            }
        } catch (Exception e) {
            throw null;
        }
    }

    /**
    * This method brakes the car.
    * @param decreaseSpeed This is the decceleration.
    * @return speed This is the speed of the car.
    */
    public int brake(final int decreaseSpeed) throws Exception {
        // adds speed to vehicle
        try {
            this.speed -= decreaseSpeed;

            if (this.speed < 0) {
                this.speed = 0;
                return this.speed;
            } else {
                return this.speed;
            }
        } catch (Exception e) {
            throw null;
        }
    }

    /**
    * This method prints all vehicle info.
    */
    public void printInfo() {
        // prints every current field
        System.out.println("The license number of this vehicle is "
                            + this.licenseNum);
        System.out.println("The colour of this vehicle is "
                            + this.colour);
        System.out.println("The number of doors for this vehicle is "
                            + this.numOfDoors);
        System.out.println("The current speed of this vehicle is "
                            + this.speed + " km/h.");
        System.out.println("The maximum speed of this vehicle is "
                            + this.maxSpeed + " km/h.");
    }
}
