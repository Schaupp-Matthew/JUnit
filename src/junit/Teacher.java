/*
 * This class is meant to be used to practice Test Driven Developement.  I will 
 * start by providing the Teacher object with its attributes, getter and setter 
 * methods, and any other important methods.  These will all be stub methods which
 * I will then use to create the test class to then create the tests and then fill
 * in the coding logic for each method.  The cool thing about using JUnit is it will
 * automate my testing.  This will speed up development because instead of me 
 * manually testing each method by interacting with the program myself, I allow
 * my JUnit tests to automatically do it and provide me with detailed feedback.
 */
package junit;

import java.util.Arrays;

/**
 *
 * @author Mattn
 */
public class Teacher {
    
    //The attributes of a teacher
    double height;
    double weight;
    String subject = "Math";
    String degree = "Bachelors of Mathmatics";
    boolean male;
    boolean female;
    String awards;
    int room;
    
    double classGrades [] = {88, 89, 99, 90, 98, 79, 80, 90, 95, 100};

    //The constructor function

    public Teacher(double height, double weight, boolean male, boolean female, String awards, int room) {
        this.height = height;
        this.weight = weight;
        this.male = male;
        this.female = female;
        this.awards = awards;
        this.room = room;
    }
    
    
    //The getter and setter methods

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public double[] getClassGrades() {
        return classGrades;
    }

    public void setClassGrades(double[] classGrades) {
        this.classGrades = classGrades;
    }
    
    //Stub methods to use during Test Driven Developement
    public String teachAddition(int a, int b) {
    //String expResult = "The result of " + a + " + " + b + " = " + c;
        int c = a + b;
        String result = "The result of " + a + " + " + b + " = " + c;
        return result;
    }
    
    public String teachSubtraction(int a, int b) {
    
        int c = a - b;
        String result = "The result of " + a + " - " + b + " = " + c;
        return result;
    }
    
    public String teachMultiplication(int a, int b) {
    
        int c = a * b;
        String result = "The result of " + a + " x " + b + " = " + c;
        return result;
    }
    
    public String teachDivision(int a, int b) {
    
        int c = a / b;
        String result = "The result of " + a + " / " + b + " = " + c;
        return result;
    }
    
    public double calcClassAverage (double classGrades []) {
        double total = 0;
        for (double grade:classGrades) {
            total += grade;
        }
        double classAvg = total / classGrades.length;
        
        return classAvg;
    }
}
