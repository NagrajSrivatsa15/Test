package JavaDevlopment;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] array={1,2,3,4,5,6};
        System.out.println("before reversal array" + Arrays.toString(array));
        Reverse(array);
        System.out.println("After reversing array" +Arrays.toString(array));
    }

    public static void Reverse(int[] array){

        int maxIndex=array.length-1;
        int halflength=array.length/2;
        for(int i=0; i<halflength;i++){
            int temp=array[i];
            array[i]=array[maxIndex-i];
            array[maxIndex-i]=temp;
            //Pushing it again for checking
        }
    }
}
