package static_final;

final class FinalClass {
    // Final variable
    final int a = 5;

    // Final method that can only be accessed within the same package
    final int finalMethod() {
        System.out.println("This is a final method within the same package.");

        return a;

    }

}

class Driver{
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();

        System.out.println("Accessing Var from Final Class " + fc.finalMethod());
    }
}

