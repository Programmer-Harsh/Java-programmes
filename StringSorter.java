import java.io.*;
import java.util.Arrays;

class StringSorter {
    Console c = System.console();

    int features = Integer.parseInt(c.readLine("Enter the number of features : "));
    String featuresName[] = new String[features];

    int elementsSize = Integer.parseInt(c.readLine("Enter the number of elements : "));
    String s[][] = new String[elementsSize][features];

    void input() {
        System.out.println("\n\t<----- Enter the feature's name one by one -----> ");
        for (int i = 0; i < features; i++) {
            featuresName[i] = c.readLine("Feature:" + (i+1) + " ->");
        }

        System.out.println("\n\t<----- Enter the elements Row wise -----> ");
        for (int i = 0; i < elementsSize; i++) {
            System.out.println("\nRow:" + (i + 1));
            for (int j = 0; j < features; j++) {
                s[i][j] = c.readLine("Element [" + i + "][" + j + "] : ");
            }
        }
    }

    void showTable() {
        for (int i = 0; i < features; i++) {
            System.out.print("\t" + featuresName[i]);
        }

        System.out.println("\n");
        for (int i = 0; i < elementsSize; i++) {
            for (int j = 0; j < features; j++) {
                System.out.print("\t" + s[i][j]);
            }
            System.out.println();
        }
    }

    void sortTable(int columnIndex) {
        Arrays.sort(s, (row1, row2) -> row1[columnIndex].compareTo(row2[columnIndex]));
    }

    public static void main(String args[]) {
        StringSorter ob = new StringSorter();
        ob.input();
        System.out.println("\n\t<----- The entered table is ----->\n");
        ob.showTable();

        // Specify the column index to sort by (e.g., 0 for the first column)
        int sortColumn = 0;
        ob.sortTable(sortColumn);

        System.out.println("\n\t<----- The sorted table is ----->\n");
        ob.showTable();
    }
}