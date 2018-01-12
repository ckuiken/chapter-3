public class StarPatterns {
    public static void main(String[] args) {
        for (int row = 0; row < 10; ++row) {
            for (int spaces = 0; spaces < 10 - row - 1; ++spaces) {
                System.out.print("*");
            }
            for (int stars = 10; stars < row + 1; ++stars) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int row = 0; row < 10; ++row) {
            for (int spaces = 0; spaces < 10 - row; ++spaces) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < row; ++stars) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 0; row < 10; ++row) {
            for (int spaces = 10; spaces > 10 - row - 1; --spaces) {
                System.out.print(" ");
            }
            for (int stars = 10; stars > row; --stars) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(" * ");
        System.out.println(" ***");
        System.out.println(" ***** ");
        System.out.println(" *******");
        System.out.println(" ********");
        System.out.println(" *******");
        System.out.println(" *****");
        System.out.println(" ***");
        System.out.println(" *");
    }
}
