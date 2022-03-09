package Memento;

import java.util.ArrayList;

public class RegisterLetter {

        ArrayList<Letter> letters = new ArrayList<Letter>();

        public void addLetter(Letter letter) {
            letters.add(letter);
        }

        public ArrayList<Letter> getLetters() {
            return (ArrayList<Letter>) letters.clone();
        }

        public LetterMemento save() {
            return new LetterMemento(getLetters());
        }

        public void revert(LetterMemento letterMemento){
           letters = letterMemento.getLetters();
        }

        @Override
        public String toString() {
            return "FbLetters{" +
                    "letters=" + letters +
                    '}';
        }

        static class LetterMemento {
            ArrayList<Letter> letters;

            public LetterMemento(ArrayList<Letter> letters) {
                this.letters = letters;
            }

            private ArrayList<Letter> getLetters() {
                return letters;
            }
        }

}
