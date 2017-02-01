/**
 * Created by Thando Mini on 1/26/2017.
 */
public class Main {
    public static void main(String [] args){

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Lenovo", "350", dimensions);

        Monitor theMonitor = new Monitor("30inch Beast", "Dell", 30, new Resolution(2540, 1440)); //creating a dimensions class on the fly (the dimensions class)

        Motherboard theMotherboard = new Motherboard("Athlon", "Asus", 4, 6, "v3.55");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        //get... methods no longer working for those methods have been removed (commented out)
        /*thePC.getMonitor().drawPixelAt(1500,1200,"blue");
        thePC.getMotherboard().loadProgram("Fedora v.12.4");
        thePC.getTheCase().pressPowerButton();
        */

        thePC.powerUp();
    }
}
