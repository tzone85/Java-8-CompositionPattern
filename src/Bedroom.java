/**
 * Created by Thando Mini on 2/1/2017.
 */
public class Bedroom extends House {

    private String bed;
    private int windowsNum;
    private boolean bathroom;
    private double mirrorSize;

    public Bedroom( Bedroom room, String bed, int windowsNum, boolean bathroom, double mirrorSize) {
        super("wooden", "pine", room, 6);
        this.bed = bed;
        this.windowsNum = windowsNum;
        this.bathroom = bathroom;
        this.mirrorSize = mirrorSize;
    }

    public String getBed() {
        return bed;
    }

    @Override
    public int getWindowsNum() {
        return windowsNum;
    }

    public boolean isBathroom() {
        return bathroom;
    }

    public double getMirrorSize() {
        return mirrorSize;
    }

    public void make(){
        System.out.println("We're in the bed class -> making no Furniture ");
    }
}
