package Decorator;

public class Novels implements Books {

    @Override
    public void read() {
        System.out.println("reading novels");
    }
}
