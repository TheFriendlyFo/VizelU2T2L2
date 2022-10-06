import java.util.ArrayList;

public class Student {

    /* Instance Variables */
    private final String firstName;
    private final String lastName;
    private final int id;
    private int gradYear;
    private final ArrayList<Double> grades;
    private int highestInd;

    // Constructor:
    public Student(String firstName, String lastName, int gradYear, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.gradYear = gradYear;
        grades = new ArrayList<>();
        highestInd = -1;
    }

    /* Getter Methods */
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public Double getHighestGrade() {return grades.get(highestInd);}
    public int getNumGrades() {return grades.size();}
    // Returns true if the student’s average test score is greater than or equal to 65; returns false otherwise
    public boolean isPassing() {return averageTestScore() >= 65;}

    // gradYear setter:
    public void setGradYear(int newGradYear) {gradYear = newGradYear;}

    // Adds a new score to grades and if necessary update highestInd:
    public void addTestScore(double newTestScore) {
        if (highestInd == -1 || newTestScore > grades.get(highestInd)) {
            highestInd = grades.size();
        }

        grades.add(newTestScore);
    }

    // Gets the sum of the test scores by looping through them and divides by the number of scores:
    public double averageTestScore() {
        double av = 0;
        for (Double score : grades) {av += score;}
        return av / grades.size();
    }

    // Prints all data about the student:
    public void printStudentInfo() {
        System.out.printf("Student %s:\n", id);
        System.out.println("-----------------------");
        System.out.printf("Student name: %s %s\n", firstName, lastName);
        System.out.printf("Graduation year: %s\n", gradYear);
        System.out.printf("Number of tests: %s\n", getNumGrades());
        System.out.printf("Test average: %s\n", averageTestScore());
        System.out.printf("Highest score: %s\n", getHighestGrade());
        System.out.printf("Passing: %s\n", isPassing() ? "Yes" : "No");
        System.out.println("-----------------------");
    }
}

/* NOTE:
* I did the extra credit task of keeping track of the highest grade, but somewhat weirdly. Instead of storing the sum
* of all grades, I stored every grade individually in an arraylist, that way in theory you could access them. I know
* it isn't necessary, but it sounded interesting to try. Anyway, the point is that instead of storing the highest grade
* itself, I stored the index at which it was found, so it can then be accessed later.*/