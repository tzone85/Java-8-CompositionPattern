/**
 * Created by Thando Mini on 1/26/2017.
 */
public class Monitor {
    private String model;
    private String manufactuer;
    private int size;
    private Resolution nativeResolution;        //early example of a resolution

    public Monitor(String model, String manufactuer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufactuer = manufactuer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at "+ x + "," + y + " in colour "+ color);
    }

    public String getModel() {
        return model;
    }

    public String getManufactuer() {
        return manufactuer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}