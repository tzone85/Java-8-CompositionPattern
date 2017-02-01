/**
 * Created by Thando Mini on 1/26/2017.
 */
public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        //getTheCase().pressPowerButton();
        
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        // fancy graffics
        //getMonitor().drawPixelAt(50,50, "green");
        monitor.drawPixelAt(50,50, "green");
    }
/*
    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }*/
}
