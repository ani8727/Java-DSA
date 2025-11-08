public class Insertion {
    static void sortIn(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
    }
    static void display(int arr[]){
        for(int i: arr) System.out.print(i+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={3,5,2,1,5};
        sortIn(arr);
        display(arr);
    }
}
