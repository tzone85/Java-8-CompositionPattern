/**
 * Created by Thando Mini on 2/1/2017.
 */
public class Bedroom extends House {

    private String bed;
    private int windows;
    private boolean bathroom;
    private double mirrorSize;

    public Bedroom( Bedroom room, String bed, int windows, boolean bathroom, double mirrorSize) {
        super("wooden", "pine", room);
        this.bed = bed;
        this.windows = windows;
        this.bathroom = bathroom;
        this.mirrorSize = mirrorSize;
    }
}
