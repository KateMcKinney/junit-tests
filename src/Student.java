import org.junit.Before;
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
    @Before
    public long getId(){
        return id;
    }

    // returns the student's name
    @Before
    public String getName(){
        return name;
    }

    // adds the given grade to the grades list
    @Before
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    @Before
    public double getGradeAverage(){
        double allGrades = 0;
        for (double grade: grades){
            allGrades += grade;
        }
        return (allGrades/grades.size());
    }
}
