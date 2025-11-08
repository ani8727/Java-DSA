import java.util.Scanner;

public class Quick {

    //cal find pivot and differentiate lower and higher value to pivot
    int partition(int arr[], int st,  int end){
        // assume last as pivot
        int pivot=arr[end];

        int i=st; // for smaller value then pivot
        for(int j=st;j<end;j++){
            if(arr[j]<pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        // now at i index value less than pivot
        // i replace pivot because its next greater
        // return i at that index less value left side and greater vakue right
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        return i; // its pivot element
    }

    // quick sort call
    void quickSort(int arr[], int st, int end){
        if(st>=end) return;

        int pivot=partition(arr,st,end);

        // now left side of pivot
        quickSort(arr,st,pivot-1);
        // now right side of pivot
        quickSort(arr, pivot+1,end);
    }

    void sort(int arr[]){
        int n=arr.length;
        if(n<=1) return;

        // quick sort call
        quickSort(arr, 0, n-1);

    }

    void print(int arr[]){
        for(int i: arr) System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Quick obj=new Quick();

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        obj.print(arr);

        obj.sort(arr);

        obj.print(arr);

    }
}
