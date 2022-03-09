package Prototype;

public class Bachelors extends Degree {

    private  String MajorSubject;

    public String getMajorSubject() {
        return MajorSubject;
    }

    public void setMajorSubject(String majorSubject) {
        MajorSubject = majorSubject;
    }

    @Override
    public String toString() {
        return "Bachelors{" +
                "MajorSubject='" + MajorSubject + '\'' +
                '}';
    }
}
