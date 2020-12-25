package task2;

public class Star extends SpaceObject {
    private String type;

    public Star(String name, double weight, String type) {
        super(name, weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
