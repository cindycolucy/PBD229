import java.util.ArrayList;
import java.util.Random;

public class BasicArrays2 {

    public static void main(String[] args){
        Random r = new Random();

        //Declare an array of 10 integers
        int a[] = new int[10];

        for(int i = 0; i < a.length; i++){
            a[i] = 1 + r.nextInt(100);
            System.out.println("Slot " + i + " contains a " + a[i]);
        }
    }
}
