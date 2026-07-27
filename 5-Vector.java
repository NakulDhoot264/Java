import java.util.Vector;
public class vec {
    public static void main(String[] args){

        Vector<Integer> no = new Vector<>();

        no.add(1);
        no.add(2);
        no.add(3);
        no.add(4);

        System.out.println("Vector Elements: " +no);
        no.remove(2);
        System.out.println("After removal of 3: " +no);

        System.out.println("Size of Vector; " +no.size());

        System.out.println("Element at index 2:" +no.get(2));


    }
    
}
