/*
 * To get to basic I need to showcase all of the JUnit assert methods:
 * assertArrayEquals (done, see line 213)
 * assertEquals (done, see line 213)
 * assertFalse (done, see line 252)
 * assertNotNull (done, see line 261)
 * assertNotSame (done, see line 238)
 * assertNull (done, see line 270)
 * assertSame (done, see line 161)
 * assertThat (done, see lines 157, 170, 186)
 * assertTrue (done, see line 291)
 */
package junit;

import java.util.Arrays;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mattn
 */
public class TeacherTest {
    
    public TeacherTest() {
    }

    /**
     * Test of getHeight method, of class Teacher.
     */
    
    //Create an instance of Teacher to use for tests
    Teacher instance = new Teacher(6.2, 170.5, true, false, null, 302);
    
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        double expResult = 6.2;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setHeight method, of class Teacher.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        double height = 6.2;
        instance.setHeight(height);
    }

    /**
     * Test of getWeight method, of class Teacher.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        double expResult = 170.5;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setWeight method, of class Teacher.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        double weight = 170.5;
        instance.setWeight(weight);
    }

    /**
     * Test of getSubject method, of class Teacher.
     */
    @Test
    public void testGetSubject() {
        System.out.println("getSubject");
        String expResult = "Math";
        String result = instance.getSubject();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSubject method, of class Teacher.
     */
    @Test
    public void testSetSubject() {
        System.out.println("setSubject");
        String subject = "Math";
        instance.setSubject(subject);
    }

    /**
     * Test of getDegree method, of class Teacher.
     */
    @Test
    public void testGetDegree() {
        System.out.println("getDegree");
        String expResult = "Bachelors of Mathmatics";
        String result = instance.getDegree();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDegree method, of class Teacher.
     */
    @Test
    public void testSetDegree() {
        System.out.println("setDegree");
        String degree = "Bachelors of Mathmatics";
        instance.setDegree(degree);
    }

    /**
     * Test of getRoom method, of class Teacher.
     */
    @Test
    public void testGetRoom() {
        System.out.println("getRoom");
        int expResult = 302;
        int result = instance.getRoom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRoom method, of class Teacher.
     */
    @Test
    public void testSetRoom() {
        System.out.println("setRoom");
        int room = 302;
        instance.setRoom(room);
    }

    /**
     * Test of teachAddition method, of class Teacher.
     */
    @Test
    public void testTeachAddition() {
        System.out.println("teachAddition");
        int a = 5;
        int b = 7;
        //The expected result and the result must refer to the same object instance
        //int c = a + b;
        //String expResult = "The result of " + a + " + " + b + " = " + c;
        String result = instance.teachAddition(a, b);
        String expResult = result;
        assertSame("should be the same", expResult, result);
    }

    /**
     * Test of teachSubtraction method, of class Teacher.
     */
    @Test
    public void testTeachSubtraction() {
        System.out.println("teachSubtraction");
        int a = 5;
        int b = 7;
        String result = instance.teachAddition(a, b);
        assertThat(result, both(containsString("5")).and(containsString("7")));
    }

    /**
     * Test of teachMultiplication method, of class Teacher.
     */
    @Test
    public void testTeachMultiplication() {
        System.out.println("teachMultiplication");
        int a = 5;
        int b = 7;
        int c = 12;
        String result1 = instance.teachMultiplication(a, b);
        String result2 = instance.teachMultiplication(a, c);
        String result3 = instance.teachMultiplication(b, c);
        assertThat(Arrays.asList(result1, result2, result3), hasItems("The result of 5 x 7 = 35"));
    }

    /**
     * Test of teachDivision method, of class Teacher.
     */
    @Test
    public void testTeachDivision() {
        System.out.println("teachDivision");
        int a = 5;
        int b = 7;
        int c = 12;
        String result1 = instance.teachMultiplication(a, b);
        String result2 = instance.teachMultiplication(a, c);
        String result3 = instance.teachMultiplication(b, c);
        assertThat(Arrays.asList(result1, result2, result3), everyItem(containsString("The result of ")));
    }

    /**
     * Test of calcClassAverage method, of class Teacher.
     */
    @Test
    public void testCalcClassAverage() {
        System.out.println("calcClassAverage");
        double expected [] = {88, 89, 99, 90, 98, 79, 80, 90, 95, 100};
        double[] classGrades = instance.getClassGrades();
        assertArrayEquals(expected, classGrades, 0.00);
        double expResult = 90.8;
        double result = instance.calcClassAverage(classGrades);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of isMale method, of class Teacher.
     */
    @Test
    public void testIsMale() {
        System.out.println("isMale");
        boolean expResult = true;
        boolean result = instance.isMale();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMale method, of class Teacher.
     */
    @Test
    public void testSetMale() {
        System.out.println("setMale");
        boolean male = true;
        instance.setMale(male);
        boolean female = instance.isFemale();
        assertNotSame("should not be the same as female", male, female);
    }

    /**
     * Test of isFemale method, of class Teacher.
     */
    @Test
    public void testIsFemale() {
        System.out.println("isFemale");
        assertFalse("failure - should be false", instance.isFemale());
    }

    /**
     * Test of setFemale method, of class Teacher.
     */
    @Test
    public void testSetFemale() {
        System.out.println("setFemale");
        boolean female = false;
        instance.setFemale(female);
        assertNotNull("should not be null", instance.isFemale());
    }

    /**
     * Test of getAwards method, of class Teacher.
     */
    @Test
    public void testGetAwards() {
        System.out.println("getAwards");
        assertNull("should be null", instance.getAwards());
    }

    /**
     * Test of setAwards method, of class Teacher.
     */
    @Test
    public void testSetAwards() {
        System.out.println("setAwards");
        String awards = "";
        instance.setAwards(awards);
    }

    /**
     * Test of getClassGrades method, of class Teacher.
     */
    @Test
    public void testGetClassGrades() {
        System.out.println("getClassGrades");
        double[] expResult = {88, 89, 99, 90, 98, 79, 80, 90, 95, 100};
        double[] result = instance.getClassGrades();
        boolean isSame = Arrays.equals(result, expResult);
        assertTrue("should be true", isSame);
    }

    /**
     * Test of setClassGrades method, of class Teacher.
     */
    @Test
    public void testSetClassGrades() {
        System.out.println("setClassGrades");
        double[] classGrades = {88, 89, 99, 90, 98, 79, 80, 90, 95, 100};
        instance.setClassGrades(classGrades);
    }
    
}
