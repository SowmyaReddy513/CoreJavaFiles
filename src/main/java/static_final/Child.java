package static_final;

public class Child extends Parent{

    public String childVariable;

    public Child(String parentVariable, String childVariable) {
        this.parentVariable = parentVariable;
        this.childVariable = childVariable;
    }

    public Child(String childVariable) {

        this.childVariable = childVariable;
    }

    public String getChildVariable() {
        return childVariable;
    }

    public void setChildVariable(String childVariable) {
        this.childVariable = childVariable;
    }

    @Override
    public String toString() {
        return "Child{" +
                "Parent='" + parentVariable + '\'' + "childVariable='" + childVariable +
                '}';
    }

    public static void main(String[] args) {

        Child ch =  new Child("From Parent", "From Child");

        System.out.println(ch);
    }
}
