import java.util.ArrayList;
public class arr2 {
    public static void main(String[]args){
        ArrayList<String> vegetables = new ArrayList<>();
        
        vegetables.add("Carrot");
        vegetables.add("Broccoli");
        vegetables.add("Spinach");
        vegetables.add("tomato");
        
        System.out.println("Vegetables in list: " +vegetables);
        vegetables.remove("tomato");

        System.out.println("Ater Removal of Tomato: " +vegetables);

        System.out.println("No. of Vegetables: " +vegetables.size());
        System.out.println("Carrot is present: " +vegetables.contains("Carrot"));

    }
    
}
