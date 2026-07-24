public class marks {
    public static void main(String[] args) {
        String[] markStrings = {"10", "20", "15", "25", "10"};
        int total = 0;

        for (String markString : markStrings) {
            try {
                int mark = Integer.parseInt(markString);
                total += mark;
            } catch (NumberFormatException e) {
                System.out.println("Invalid mark: " + markString);
            }
        }

        System.out.println("Total marks: " + total);
    }
}
