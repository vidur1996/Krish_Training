package Decorator;

public class Appilcation {

    public static void main(String[] args) {
        Books fictions  = new Fictions();

        Books englishFictions = new EnglishBooksDecorator(new Fictions());

        Books englishNovels = new EnglishBooksDecorator(new Novels());

        System.out.println("fictions are interesting");

        fictions.read();

        System.out.println("fiction in english");

        englishFictions.read();

        System.out.println("novels in english");

        englishNovels.read();

    }
}
