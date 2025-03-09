class Student {
    static String collegeName = "IIT Bombay"; 

    int id;
    String name;
    long contact;
    double percentage;
    char grade;
    boolean isPassed;

    public void showMinmax() {
        // Can be used as the - infinite to infinite
        System.out.println("Min value of int: " + Integer.MIN_VALUE);
        System.out.println("Max value of int: " + Integer.MAX_VALUE);
    }
}

class Datatypes {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        s1.id = 100;
        s1.name = "Shyam";
        s1.contact = 63027_45946L;
        s1.percentage = 98.5d;
        s1.grade = 'A';
        s1.isPassed = true;

        Student s2 = new Student();

        s2.id = 100;
        s2.name = "Piyush";
        s2.contact = 63027_45946L;
        s2.percentage = 95.5d;
        s2.grade = 'A';
        s2.isPassed = true;

        System.out.println("\n ------------------- Primitve Types ------------------- \n");

        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("College: " + Student.collegeName);
        System.out.println("Contact: " + s1.contact);
        System.out.println("Percentage: " + s1.percentage);
        System.out.println("Grade: " + s1.grade);
        System.out.println("Is Passed: " + s1.isPassed);

        System.out.println("-------------");

        System.out.println("ID: " + s2.id);
        System.out.println("Name: " + s2.name);
        System.out.println("College: " + Student.collegeName);
        System.out.println("Contact: " + s2.contact);
        System.out.println("Percentage: " + s2.percentage);
        System.out.println("Grade: " + s2.grade);
        System.out.println("Is Passed: " + s2.isPassed);

        System.out.println("\n ------------------- MIN/MAX ------------------- \n");

        /*
         * Min max concept
         */
        s1.showMinmax();

        System.out.println("\n ------------------- Multiple Variable Declaration ------------------- \n");
        /* 
          Multiple variable declaration
        */
        int a = 10, b = 20, c = 30;
        System.out.println("a: " + a + " b: " + b + " c: " + c);

        int b_same;
        int a_same = b_same = 1;
        System.out.println("a_same: " + a_same + " b_same: " + b_same);

        System.out.println("\n ------------------- Type Casting ------------------- \n");
        int smaller = 10;
        long larger = smaller; // Implicit casting

        System.out.println("Smaller: " + smaller + " Larger: " + larger);

        int mid = (int) larger; // Explicit casting
        System.out.println("Mid: " + mid);

        // Truncating
        double d = 100.04;
        long l = (long) d;
        System.out.println("Double value: " + d);
        System.out.println("Long value (Truncated): " + l);
    }
}