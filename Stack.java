import java.io.*;

class Stack {
    public static int top = -1, num = 0;
    public static int arr[] = new int[20];//Array with limit of 20

    static void push() {//Declaring this method for push operation
        Console c = System.console();
        num = Integer.parseInt(c.readLine("Enter the number of elements (Not More than 20):- "));//Taking number of elements as input from user
        System.out.println("\t<---- Enter the elements one by one -----> ");
        //Taking elements as input in the stack
        for (int i = 0; i < num; i++) {
            top++;
            arr[i] = Integer.parseInt(c.readLine("Enter element " + i + " : "));
        }
    }

    static void show() {//Method shows the elements present in the Stack
        if(top==-1){//If Stack is empty than execute this condition
            System.out.println("\tStack is underflow....");
        }
        else{
            System.out.println("\t<---- Entered element is ----> ");
            for (int i = top; i >= 0; --i) {
                System.out.println(arr[i]);
            }
        }
    }

    static void pop() {//Declaring this method for Pop operation
        if (top == -1) {//If stack is already empty than execute this condition
            System.out.println("\tStack is underflow.....");
        }
        else{
        System.out.println("The poped element is : " + (arr[top]));
        top = top - 1;
        }
    }

    public static void main(String args[]) {//Main method
        Console c = System.console();
        int choice;
        while (true) {
            //Taking choice from the user
            System.out.println("\t-: What do you want to do :-");
            choice = Integer
                    .parseInt(c.readLine("1.Push operation\n2.Pop operation\n3.Show\n4.End\nEnter your choice :- "));
            if (choice == 1) {
                push();
            } else if (choice == 2) {
                pop();
            } else if (choice == 3) {
                show();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("\tInvalid choice....");
            }
        }//End of while loop
    }//End of main method
}//End of the class