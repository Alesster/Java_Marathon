package FinalProject;

public enum ObjectList {
    LINKOR(4,"$"), KRUISER(3,"$"), DESTROYER(2, "$"), TORPEDSHIP(1,"$"), AURA(1,"*"), EMPTY(1,"_"), KILL(1,"X"), NOKILL(1,"0");

    private int value;
    private String img;

    ObjectList(int value, String img){
        this.value = value;
        this.img = img;
    }

    public int getValue() {
        return value;
    }

    public String getImg() {
        return img;
    }

}
