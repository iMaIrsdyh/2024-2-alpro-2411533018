package pekan5;

public class TugasPekan5BelahKetupat {
	public static void main(String[] args) {
        int size = 9; // Adjust size as needed for a larger pattern

        for (int i = 0; i < size; i++) {
            // Print top border
            if (i == 0 || i == size - 1) {
                System.out.print("# ");
                for (int j = 0; j < size - (-1); j++) {
                    System.out.print("- ");
                }
                System.out.println("#");
            } else {
                System.out.print("| ");
                for (int j = 0; j < size; j++) {
                    // Print diamond pattern
                    if (j == size / 2 - i || j == size / 2 + i || j == i - size / 2 || j == size - 1 - (i - size / 2)) {
                        System.out.print("<> ");
                    } else {
                        System.out.print(". ");
                    }
                }
                System.out.println("|");
            }
        }
    }
}