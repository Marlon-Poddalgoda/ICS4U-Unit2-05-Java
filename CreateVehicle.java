/**
 * This program adds number to an array using OOP.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-20
 */

public final class CreateVehicle {
    private CreateVehicle() {

        // Throw an exception if this ever *is* called
        throw new AssertionError("Instantiating utility class.");
    }

    /**
    * This method creates 2 instances of vehicles.
    * @param args
    */
    public static void main(final String[] args) {
        // main stub, creates 2 vehicles

        // basic info
        System.out.println("This program creates 2 instances of "
                        + "the vehicle class.");

        try {
            // try statement

            // new instance
            Vehicle vehicle1 = new Vehicle();
            Vehicle vehicle2 = new Vehicle();

            // variables
            final String license1 = "MELON-123";
            final String license2 = "PUMPKIN-3";
            final String colour2 = "Red";
            final int accelerate1 = 15;
            final int brake1 = 20;
            final int accelerate2 = 130;
            final int brake2 = 50;

            //VEHICLE1
            // print info method
            System.out.println();
            System.out.println("The current properties of vehicle 1 are: ");
            System.out.println();
            vehicle1.printInfo();

            // change license method
            System.out.println();
            System.out.println("The license for vehicle1 has been changed to: "
                                + license1);
            vehicle1.setLicense(license1);

            // change speed
            System.out.println();
            System.out.println("Vehicle 1 has accelerated by "
                                + accelerate1 + " km/h");
            System.out.println("The current speed of vehicle 1 is "
                                + vehicle1.accelerate(accelerate1) + " km/h");
            System.out.println("Vehicle 1 tries to brake by "
                                + brake1 + " km/h");
            System.out.println("The current speed of vehicle 1 is "
                                + vehicle1.brake(brake1) + " km/h");

            // print info method
            System.out.println();
            System.out.println("The current properties of vehicle 1 are: ");
            System.out.println();
            vehicle1.printInfo();

            System.out.println();

            // VEHICLE 2
            // print info method
            System.out.println();
            System.out.println("The current properties of vehicle 2 are: ");
            System.out.println();
            vehicle2.printInfo();

            // change license method
            System.out.println();
            System.out.println("The license for vehicle2 has been changed to: "
                            + license2);
            vehicle2.setLicense(license2);

            // change colour method
            System.out.println();
            System.out.println("The colour for vehicle 2 has been changed to: "
                            + colour2);
            vehicle2.setColour(colour2);

            // change speed
            System.out.println();
            System.out.println("Vehicle 2 has accelerated by "
                            + accelerate2 + " km/h");
            System.out.println("The current speed of vehicle 2 is "
                            + vehicle2.accelerate(accelerate2) + " km/h");
            System.out.println("Vehicle 2 tries to brake by "
                            + brake2 + " km/h");
            System.out.println("The current speed of vehicle 2 is "
                            + vehicle2.brake(brake2) + " km/h");

            // print info method
            System.out.println();
            System.out.println("The current properties of vehicle 2 are: ");
            System.out.println();
            vehicle2.printInfo();

            // Done
            System.out.println();
            System.out.println("Done.");

        } catch (Exception e) {
            System.out.println();
            System.out.println("Sorry, invalid input.");
        }
    }
}
