import java.util.Scanner;

public class BubbleRec {

    static void recursion(int arr[], int n){
        if(n==1) return;
        boolean swapped=false;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                swap(arr,i,i+1);
                swapped =true;
            }
        }
        if(!swapped) return;
        recursion(arr,n-1);
    }

    private static void swap(int arr[], int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void print(int arr[], int n){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n;
        n= sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        recursion(arr, n);
        print(arr,n);



    }
}
