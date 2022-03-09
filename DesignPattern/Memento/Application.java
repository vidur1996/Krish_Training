package Memento;

public class Application {
    public static void main(String[] args) {
        Caretakers careTaker = new Caretakers();
        RegisterLetter registerLetter = new RegisterLetter();

        registerLetter.addLetter(new Letter("offical letter"));
        registerLetter.addLetter(new Letter("invitation"));
        careTaker.save(registerLetter);
        System.out.println(registerLetter);

        registerLetter.addLetter(new Letter("Appointment letter"));
        careTaker.save(registerLetter);
        System.out.println(registerLetter);

        registerLetter.addLetter(new Letter("wedding"));
        careTaker.save(registerLetter);
        System.out.println(registerLetter);

        registerLetter.addLetter(new Letter("Birthday party"));
        careTaker.save(registerLetter);
        System.out.println(registerLetter);

        careTaker.revert(registerLetter);
        System.out.println(registerLetter);

        careTaker.revert(registerLetter);
        System.out.println(registerLetter);

        careTaker.revert(registerLetter);
        System.out.println(registerLetter);

        careTaker.revert(registerLetter);
        System.out.println(registerLetter);

        careTaker.revert(registerLetter);
        System.out.println(registerLetter);
    }
}
