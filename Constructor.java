public class Constructor {
    Constructor() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        System.out.println(c1);
    }
}
