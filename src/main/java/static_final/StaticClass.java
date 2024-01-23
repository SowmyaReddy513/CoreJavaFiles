package static_final;

public class StaticClass {
    // Static variable
    private static int staticVariable = 10;

    // Static method that returns the static variable
    public static int getStaticVariable() {
        return staticVariable;
    }

    public static void main(String[] args) {
        // Accessing the static variable
        //print the static variable
        System.out.println(StaticClass.staticVariable);

        // Accessing the static variable through the static method
        int result = StaticClass.getStaticVariable();

        //Result from the static method
        System.out.println(result);


    }
}
