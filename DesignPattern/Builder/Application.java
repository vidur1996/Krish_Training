package Builder;

public class Application {

    public static void main(String[] args) {

        SmartPhone.Builder builder = new SmartPhone.Builder("12MP");

        SmartPhone smartPhone = builder.audioJack(true).dualSim(true).build();
        System.out.println(smartPhone);
    }
}
