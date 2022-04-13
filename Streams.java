import java.util.ArrayList;
import java.util.List;

public class Streams {
    

    public void filter(){

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //printing the list using foreach with biconsumer
        list.stream().forEach(x -> System.out.println(x));

        System.out.println();
        //filetring out the list using filter()
        list.stream().filter(x -> x > 1 ).forEach(System.out::println);

        System.out.println();
        //printing even numbers using filter and forach
        list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println();
        //map()
        list.stream().map(x -> x * 1).forEach(System.out::println);
        
        System.out.println();
        
        list.stream().map(x -> String.valueOf(x)).forEach(System.out::println);

        System.out.println();

        List<Integer> ilist = new ArrayList<Integer>();

        //adding to another list using Stream map()
        list.stream().filter(x -> x > 1).map(x -> ilist.add(x)).forEach(System.out::println);

        System.out.println();
        ilist.stream().forEach(System.out::println);


    }


    public static void main(String[] args) {
        
        Streams s = new Streams();
        s.filter();
    }
}
