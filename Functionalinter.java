@FunctionalInterface
public interface Functionalinter {
    
//functional interface which contains only one abstract method
//functional interface are more helpfu in streams api
    public abstract void greet(String name);
}

class Testing{
    
    public static void main(String args[]){

        Functionalinter fi = (String a) -> System.out.print("The name : " + a);
        fi.greet("john");
    }
}
