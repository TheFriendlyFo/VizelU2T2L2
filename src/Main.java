public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Charles", "Smith", 2023);
        student1.addTestScore(85.5);
        student1.printStudentInfo();
        System.out.println();

        student1.addTestScore(94);
        student1.printStudentInfo();
        System.out.println();

        student1.addTestScore(95);
        student1.printStudentInfo();
        System.out.println();

        Student student2 = new Student("Amy", "Adams", 2022);
        student2.addTestScore(68.2);
        student2.printStudentInfo();
        System.out.println();

        student2.addTestScore(57.5);
        student2.printStudentInfo();
        System.out.println();

        student2.setGradYear(2023);
        student2.printStudentInfo();
        System.out.println();

        double student1avg = student1.averageTestScore();
        double student2avg = student2.averageTestScore();
        String student1name = student1.getFirstName() + " " + student1.getLastName();
        String student2name = student2.getFirstName() + " " + student2.getLastName();

        if (student1avg > student2avg)
        {
            System.out.println(student1name + " has a higher average!");
        }
        else if (student2avg > student1avg)
        {
            System.out.println(student2name + " has a higher average!");
        }
        else
        {
            System.out.println(student1name + " and " + student2name + " have equal averages");
        }

    }
}