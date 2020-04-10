import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student amy = new Student(1234567, "Amy");

    @Test
    public void testStudentConstructor(){
        assertEquals("Amy", amy.name);
        assertEquals(1234567, amy.id);
    }

    @Test
    public void testGetId(){
        assertEquals(1234567, amy.getId());
    }

    @Test
    public void testGetName(){
        assertEquals("Amy", amy.getName());
    }

    @Test
    public void testAddGrade(){
        amy.addGrade(90);
        amy.addGrade(83);
        int actual = amy.grades.get(0);
        assertEquals(90, actual);
    }

    @Test
    public void testGetGradeAverage(){
        amy.addGrade(90);
        amy.addGrade(100);
        double actual = amy.getGradeAverage();
        assertEquals(95.0, actual, 0.5);
    }
}
