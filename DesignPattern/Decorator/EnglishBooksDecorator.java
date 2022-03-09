package Decorator;

public class EnglishBooksDecorator extends BooksDecorator {
    public EnglishBooksDecorator(Books decoratedBooks) {
        super(decoratedBooks);
    }

    @Override
    public void read() {
        decoratedBooks.read();
        setEnglisBooks(decoratedBooks);
    }

    private  void setEnglisBooks(Books decoratedBooks){
        System.out.println("auther - shakespear");
    }
}
