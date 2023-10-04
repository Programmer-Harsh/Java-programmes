import java.io.*;

public class Pattern {

    Console c = System.console();
    int col, row;

    void input() {
        col = Integer.parseInt(c.readLine("Enter the number of Column :- "));//Taking number of columns as input
        row = Integer.parseInt(c.readLine("Enter the number of rows :- "));//Taking number of rows as input
    }

    void pattern1() { // Declaring a method to Print a rectangle
        for (int j = 0; j < row; j++) { // This loop decides row
            for (int i = 0; i < col; i++) { // This loop decides column
                System.out.print(" * ");
            } // end of inner loop
            System.out.print("\n");
        } // End of outer loop
    }

    void pattern2() { // For printing hollow rectangle
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void pattern3() { // For printing half pyramid
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    void pattern4() { // For printing Inverted half pyramid
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    void pattern5() { // For printing Inverted Half Pyramid(rotated by 180 degree)
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern6() { // For printing Half pyramid with numbers
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void pattern7() { // For printing Inverted HAlf pyramid with numbers
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void pattern8() { // Declaring method to print floyd's Triangle
        int r = 1;
        for (int i = r; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + r + " ");
                r++;
            }
            System.out.println();
        }
    }

    void pattern9() { // For printing 0-1 Triangle
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) { // For Even value print 1
                    System.out.print(" 1 ");
                } else { // For odd value print 0
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Pattern ob = new Pattern();
        ob.input();
        ob.pattern1();
        System.out.println();
        ob.pattern2();
        System.out.println();
        ob.pattern3();
        System.out.println();
        ob.pattern4();
        System.out.println();
        ob.pattern5();
        System.out.println();
        ob.pattern6();
        System.out.println();
        ob.pattern7();
        System.out.println();
        ob.pattern8();
        System.out.println();
        ob.pattern9();

    }
}
