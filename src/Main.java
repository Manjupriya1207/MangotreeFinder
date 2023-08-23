import java.util.Scanner;

class Main {
    public static boolean isMangoTree(int rows, int columns, int treeNumber) {
        return treeNumber <= columns || treeNumber % columns == 1 || treeNumber % columns == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int treeNumber = scanner.nextInt();

        boolean result = isMangoTree(rows, columns, treeNumber);
        System.out.println(result);

        scanner.close();
    }
}