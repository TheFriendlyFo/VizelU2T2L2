public class Student {

    /* Instance Variables */
    private final String firstName;
    private final String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;

    /* Constructor; see Note 1 below */
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        accumulatedTestScores = 0.0;
        testScoreCount = 0;
    }

    /* Getter Methods */
// Returns firstName
    public String getFirstName() {return firstName;}
    // Returns lastName
    public String getLastName() {return lastName;}

    /* Setter Methods */
// Sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {gradYear = newGradYear;}

    /* All Other Methods */
// Adds newTestScore to accumulatedTestScores
// and increments testScoreCount by 1
    public void addTestScore(double newTestScore) {
        accumulatedTestScores += newTestScore;
        testScoreCount++;
    }

    // Returns true if the student’s average test score is greater
// than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {return averageTestScore() >= 65;}

    // Returns the Student’s average test score as the
// quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {return accumulatedTestScores / testScoreCount;}

    // this method prints the students full name, grad year, test average,
// and whether they are passing (see Note 3 below)
    public void printStudentInfo() {
        System.out.printf("Student: %s %s\n", firstName, lastName);
        System.out.printf("Graduation year: %s\n", gradYear);
        System.out.printf("Number of tests: %s\n", testScoreCount);
        System.out.printf("Test average: %s\n", averageTestScore());
        System.out.printf("Passing: %s\n", isPassing() ? "Yes" : "No");
    }
}