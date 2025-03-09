public class BasicDS {
    static void array() {
        int[] scores = new int[4];

        scores[0] = 100;
        scores[1] = 200;
        scores[2] = 300;
        scores[3] = 400;

        System.out.println("Score - 1: " + scores[0]);
        System.out.println("Score - 2: " + scores[1]);
        System.out.println("Score - 3: " + scores[2]);
        System.out.println("Score - 4: " + scores[3]);

        System.out.println("Length of array: " + scores.length);
    }

    static void multidimesionArray() {
        int[][] scores = new int[2][2]; // Only declaration
        int[][] scores2 = {{100, 200}, {300, 400}}; // Declaration and initialization
        int[][][] scores3 = {{{1,2}}, {{3, 4}}, {{5,6}}}; // 3D array 

        scores[0][0] = 100;
        scores[0][1] = 200;
        scores[1][0] = 300;
        scores[1][1] = 400;

        System.out.println("Score - 1: " + scores[0][0]);
        System.out.println("Score - 2: " + scores[0][1]);   
        System.out.println("Score - 3: " + scores[1][0]);
        System.out.println("Score - 4: " + scores[1][1]);
        System.out.println(scores2[0][0]);

        System.out.println("Length of array: " + scores.length);
    }

    public static void main(String[] args) {
        array();
        multidimesionArray();

    }
}
