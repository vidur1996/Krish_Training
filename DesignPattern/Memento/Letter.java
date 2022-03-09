package Memento;

public class Letter {

        String address;

        public Letter(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Post{" +
                    "title='" + address + '\'' +
                    '}';
        }
    }
