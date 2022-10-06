import java.util.ArrayList;

public class Student {

    /* Instance Variables */
    private final String firstName;
    private final String lastName;
    private int gradYear;
    private final ArrayList<Double> scores;
    private int highestInd;

    /* Constructor; see Note 1 below */
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        scores = new ArrayList<>();
        highestInd = -1;
    }

    /* Getter Methods */
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public Double getHighestGrade() {return scores.get(highestInd);}

    /* Setter Methods */
// Sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {gradYear = newGradYear;}

    /* All Other Methods */
// Adds newTestScore to accumulatedTestScores
// and increments testScoreCount by 1
    public void addTestScore(double newTestScore) {
        if (highestInd == -1 || newTestScore > scores.get(highestInd)) {
            highestInd = scores.size();
        }

        scores.add(newTestScore);
    }

    // Returns true if the student’s average test score is greater
// than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {return averageTestScore() >= 65;}

    public double averageTestScore() {
        double av = 0;
        for (Double score : scores) {av += score;}
        return av / scores.size();
    }

    // this method prints the students full name, grad year, test average,
// and whether they are passing (see Note 3 below)
    public void printStudentInfo() {
        System.out.printf("Student: %s %s\n", firstName, lastName);
        System.out.printf("Graduation year: %s\n", gradYear);
        System.out.printf("Number of tests: %s\n", scores.size());
        System.out.printf("Test average: %s\n", averageTestScore());
        System.out.printf("Highest score: %s", getHighestGrade());
        System.out.printf("Passing: %s\n", isPassing() ? "Yes" : "No");
    }
}