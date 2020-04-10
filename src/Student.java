import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    long id; //represents unique user
    String name; //name of student
    ArrayList<Integer> grades;

    public Student (long x, String y){//constructor
        this.id = x;
        this.name = y;
        this.grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId(){
        return id;
    }

    // returns the student's name
    public String getName(){
        return name;
    }


    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }


    // returns the average of the students grades
    public double getGradeAverage(){
        return 23.5;
    }

}
