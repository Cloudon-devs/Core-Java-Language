public class Methods {
    static double sum(double a, double b) {
        return a + b;
    }

    /*
     * Multiple args
     */
    static void print(int... items) {
        System.out.println(items[0]);
        System.out.println(items[1]);
        System.out.println(items[2]);
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        Methods.print(1, 2, 3);
    }
}
