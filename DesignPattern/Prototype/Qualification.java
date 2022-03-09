package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Qualification {

    private Map<DegreeType,Degree> degrees = new HashMap<>();

    public Qualification(){
        this.initialize();
    }


    public  Degree getDegree(DegreeType degreeType){
        Degree degree = null;

        try {

           degree = (Degree) degrees.get(degreeType).clone();
      }catch (CloneNotSupportedException e){
          e.printStackTrace();
      }

      return degree;
    }

    private  void initialize(){

        Bachelors bachelors  = new Bachelors();
        bachelors.setMajorSubject("computer science");
        bachelors.setCourseName("BCS");
        bachelors.setDuration(3);

        Masters masters = new Masters();
        masters.setType("full time");
        masters.setDuration(1);
        masters.setCourseName("MCS");

        degrees.put(DegreeType.BACHELORS,bachelors);
        degrees.put(DegreeType.MASTERS,masters);

    }
}
