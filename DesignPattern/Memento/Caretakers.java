package Memento;

import java.util.Stack;

public class Caretakers {
    Stack<RegisterLetter.LetterMemento> history = new Stack<>();

    public void save(RegisterLetter registerLetter) {
        history.push(registerLetter.save());
    }

    public void revert(RegisterLetter registerLetter) {
        if(!history.isEmpty()){
            registerLetter.revert(history.pop());
        }
        else {
            System.out.println("cannot revert");
        }
    }
}
