package Decorator;

public class Fictions implements Books {
    @Override
    public void read() {
        System.out.println("reading fictions");
    }
}
