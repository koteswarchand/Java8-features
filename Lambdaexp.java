public interface Lambdaexp {

    public  abstract void add(int a,int b);

    public static void hello(){
        System.out.println("hello this method is inside the interface class");
    }
    
}

class test{

    public static void main(String args[]){

        Lambdaexp le = (int x,int y) -> System.out.print(x + y); 
        le.add(2, 3);
        
    }
}


