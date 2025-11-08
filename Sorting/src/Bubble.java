import java.util.Scanner;

public class Bubble {

    void bubble(int arr[], int n){
        for(int i=0;i<n-1;i++){
            boolean swap=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap=true;
                }
            }
            if(!swap) break;
        }
    }

    void printArray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

    public static void main(String[] args) {
        Bubble obj=new Bubble();

        Scanner sc = new Scanner(System.in);
        int n;
        n= sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array print: ");
        obj.printArray(arr,n);
        obj.bubble(arr,n);
        System.out.println("Sorted array: ");
        obj.printArray(arr,n);

    }
}
