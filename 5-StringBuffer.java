public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        
        sb.append(" World");
        System.out.println("After append:" +sb);

        sb.insert(6, "Java ");

        sb.replace(0,5,"Hi");
        System.out.println("After replace:" +sb);

        sb.delete(2,5);
        System.out.println("After delete:" +sb);

        sb.reverse();
        System.out.println("After reverse:" +sb);
    }
}
