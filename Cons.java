class Cons{
    public static void main(String args[]){
        Cons obj =new Cons();//Creating object of the class
        obj.meth();//Calling method with the help of object
    }
    Cons(){//Constructer
        System.out.println("Constructor called...");
    }
    void meth(){//Method
        System.out.println("Method called...");
    }
}