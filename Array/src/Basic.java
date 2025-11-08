import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {

        //Syntax
//    datatype[] variable_name = new datatype[size];
//    store 5 five roll number
//      int[] rollNumber = new int[5];
//      or directly store
//    int [] rollNumber = {23,56,78,90,1};

        // declaration of an array
//        int[] rollNumber;
//        rollNumber = new int[5];
//        System.out.print(rollNumber[1]);
       int[] nums =new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<nums.length;i++){
            nums[i]= sc.nextInt();
        }
        for(int num : nums){
//            System.out.print(num+" ");
        }
         System.out.println(Arrays.toString(nums));

        String[] str = new String[5];
        for(int i=0; i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));


    }
}

