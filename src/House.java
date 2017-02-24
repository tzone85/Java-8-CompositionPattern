/**
 * Created by Thando Mini on 2/1/2017.
 */
public class House {
    private String door;
    private String furniture;
    private Bedroom room;
    private int windowsNum;


    public House(String door, String furniture, Bedroom room, int windowsNum) {
        this.door = door;
        this.furniture = furniture;
        this.room = room;
        this.windowsNum = windowsNum;
    }


    public int getWindowsNum() {
        return this.windowsNum;
    }

    public void typeFurniture(){
        System.out.println("We're in teh house class -> typeFurniture recliner sofar");
        room.make();
    }
}
