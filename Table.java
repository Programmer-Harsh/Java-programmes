import java.io.*;

class Table {
    Console c = System.console();
    int columns = Integer.parseInt(c.readLine("Enter the number of columns : "));
    int rows = Integer.parseInt(c.readLine("Enter the number of elements : "));
    String s[][] = new String[rows][columns];

    void input() {
        for (int i = 0; i < columns; i++) {
            System.out.println("Column " + (i + 1));
            for (int j = 0; j < rows; j++) {
                s[j][i] = c.readLine("Enter element:" + (j + 1) + " -> ");
            }
        }
    }

    void showTable() {
        for (int i = 0; i < columns; i++) {
            System.out.println("Column " + (i + 1));
            for (int j = 0; j < rows; j++) {
                System.out.println("Element:" + (j + 1) + " -> " + s[j][i]);
            }
        }
    }

    public static void main(String args[]) {
        Table ob = new Table();
        ob.input();
        ob.showTable();
    }

}
