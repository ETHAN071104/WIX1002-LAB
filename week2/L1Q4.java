package week2;

public class L1Q4 {
    public static void main(String[] args) {
        String[] months = {
            "January 2016 ", 
            "February 2016", 
            "March 2016   ", 
            "April 2016   ", 
            "May 2016     ", 
            "Jun 2016     "
        };
        int[] amounts = {2500, 1600, 2000, 2700, 3200, 800};

        System.out.println("================ Total Sales of Product A ================");
        System.out.println("Scale: Each '*' represents 100 units\n");

        for (int i = 0; i < months.length; i++) {
            System.out.printf("%s | ", months[i]);
            int stars = amounts[i] / 100;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.printf(" (%d)\n", amounts[i]);
        }
        System.out.println("==========================================================");
    }
}