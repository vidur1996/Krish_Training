package Decorator;

public abstract class BooksDecorator implements Books {

    protected Books decoratedBooks;

    public BooksDecorator(Books decoratedBooks){
        this.decoratedBooks = decoratedBooks;
    }


    @Override
    public void read() {
        decoratedBooks.read();
    }
}
