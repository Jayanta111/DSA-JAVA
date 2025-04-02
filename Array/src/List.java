import java.util.ArrayList;

public class List {
    public static void main(String[] args){
        // Creating an ArrayList of Integer type with an initial capacity of 10
        ArrayList<Integer> list = new ArrayList<>(10);

        // Adding elements to the list
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(900);
        list.add(700);
        list.add(800);
        list.add(900);


        // Print the elements in the list
        System.out.println(list);
        System.out.println(list.contains(900));


    }
}
