import java.util.Scanner;

public class Merge {

    // merge after divided
    public void merge(int arr[], int st, int mid, int end){
        int temp[]=new int[end+1];

        int left=st;
        int right=mid+1;
        int i=0;

        while(left<=mid && right<=end){
            if(arr[left]<arr[right])
                temp[i++]=arr[left++];
            else
                temp[i++]=arr[right++];
        }
        while(left<=mid){
            temp[i++]=arr[left++];
        }
        while(right<=end){
            temp[i++]=arr[right++];
        }
        //back to the main array
        for(int ele=0;ele<i;ele++){
            arr[st+ele]=temp[ele];
        }
    }

    // merge sort call
    public void mergeSort(int arr[], int st, int end){
        // base case
        if(st>=end) return;

        int mid=st+(end-st)/2;
        //first half
        mergeSort(arr, st, mid);
        //second half
        mergeSort(arr, mid+1, end);

        // after divide hit base case then call merge
        merge(arr, st, mid, end);

    }

    public void Sort(int arr[]){
        int n=arr.length;
        // call merge sort
        if(n<=1) return;
        mergeSort(arr,0,n-1);
    }

    public void print(int arr[]){
        for(int i:arr) System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Merge obj=new Merge();

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        obj.print(arr);

        obj.Sort(arr);

        obj.print(arr);

    }
}
