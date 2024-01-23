package oops;

public class DepartmentSub extends Department {
    private int size;
    public DepartmentSub(int size) {
        this.size = size;
    }
    @Override
    public int getSize() {
        return size;
    }
    public static void main(String[] args) {
        DepartmentSub d = new DepartmentSub(5);
        System.out.println(d.getSize());
    }
}