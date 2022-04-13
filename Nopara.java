@FunctionalInterface
public interface Nopara {
    
    abstract void empty();
}

class Emptypara{

    public static  void main(String args[]){

        //no parameters passed in lambda expression
        Nopara fi = () ->
            System.out.print("no parameters");
        fi.empty();
    }
}
