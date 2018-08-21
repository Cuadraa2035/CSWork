public class loops {
    public static void main(String[] args){
       // writeSquares();
      //  writeSquares2();
       // writeSquares3();
        writeSquares4(1000000000);

    }

    public static void writeSquares(){
        System.out.println("writeSquares...");
        //We want to create a program to print the squares
        //of the first five integers, one way to do this is :
        System.out.println(1 + " squared = " + (1*1));
        System.out.println(2 + " squared = " + (2*2));
        System.out.println(3 + " squared = " + (3*3));
        System.out.println(4 + " squared = " + (4*4));
        System.out.println(5 + " squared = " + (5*5));
    }

    //This can be another way:
    public static void writeSquares2()
    {
        System.out.println("writeSquares2...");
        for(int i = 1; i <= 5; i++){
            System.out.println( i + " squared = " + (i * i));
        }
        // There are three parts to a for loop,they are all optional
        // The first part is used to initialize a variable
        // for the above for loop, we create a variable
        // called i and intialize it to 1
        // The middle part is the condition which will continue
        // the loop for the above one, the loop will continue
        // as long as ui is less or equal to 5.
    }

    //This this time changed i to 100 for a longer loop
    public static void writeSquares3() {
        System.out.println("writeSquares3...");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " squared = " + (i * i));
        }

    }
    public static void writeSquares4(int stopVal) {
        System.out.println("writeSquares4...");
        System.out.println("stop value is " + stopVal);
        for (int i = 1; i <= stopVal; i++) {
            System.out.println(i + " squared = " + (i * i));
        }
    }
}

