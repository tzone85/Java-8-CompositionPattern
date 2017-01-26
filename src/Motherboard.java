/**
 * Created by Thando Mini on 1/26/2017.
 */
public class Motherboard {
    private String model;
    private String manufacturere;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturere, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturere = manufacturere;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String progName){
        System.out.println("Program "+progName+" is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturere() {
        return manufacturere;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
