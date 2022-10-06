import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student s;
        Scanner scan = new Scanner(System.in);
        boolean run = true;

        // Student initialization:
        System.out.println("----------------------");
        System.out.println("Student Initialization");
        System.out.println("----------------------\n");

        System.out.print("Enter student ID: ");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter student's first name: ");
        String firstName = scan.nextLine();

        System.out.print("Enter student's last name: ");
        String lastName = scan.nextLine();

        System.out.print("Enter student's graduation year: ");
        int gradYear = scan.nextInt();
        scan.nextLine();

        s = new Student(firstName, lastName, gradYear, id);

        // Main loop:
        while (run) {
            // Moves a bunch of lines down to approximate clearing the console:
            System.out.println("\n\n\n\n\n\n\n\n\n\n");

            System.out.println("[}--------------------------{]");
            System.out.println("|---------Main Menu----------|");
            System.out.println("[}--------------------------{]");
            System.out.println("\n1. Add test score");
            System.out.println("2. Update graduation date");
            System.out.println("3. Print test average");
            System.out.println("4. Print full student information");
            System.out.println("5. Exit");
            System.out.print("\nSelection: ");

            switch (scan.nextLine()) {
                case "1" -> {
                    System.out.print("Enter new test score: ");
                    s.addTestScore(scan.nextDouble());
                    scan.nextLine();
                }
                case "2" -> {
                    System.out.print("Enter new graduation year: ");
                    s.setGradYear(scan.nextInt());
                    scan.nextLine();
                }
                case "3" -> {
                    System.out.printf("\nAverage: %s\n\n", s.averageTestScore());
                    scan.nextLine();
                }
                case "4" -> {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n");
                    s.printStudentInfo();
                    scan.nextLine();
                }
                case "5" ->
                    run = false;

                default -> {
                    System.out.println("Invalid entry.");
                    scan.nextLine();
                }
            }
        }
    }
}