package Prototype;

public class Masters extends Degree {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Masters{" +
                "type=" + type +
                '}';
    }
}
