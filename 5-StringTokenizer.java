import java.util.StringTokenizer;

public class stringtokenizer {
    
    public static void main(String[] args) {
        String str = "Hello, World! Welcome to Java programming.";
        StringTokenizer st = new StringTokenizer(str, ",");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());

        }

    }
}
