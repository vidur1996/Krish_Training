package Prototype;

public class Application {

    public static void main(String[] args) {

        Qualification qualification = new Qualification();

        Bachelors bachelors = (Bachelors) qualification.getDegree(DegreeType.BACHELORS);
        System.out.println(bachelors);

        bachelors.setMajorSubject("Software Engineering" );

        System.out.println(bachelors);

        Bachelors bachelors1 = (Bachelors) qualification.getDegree(DegreeType.BACHELORS);
        System.out.println(bachelors1);
    }
}
