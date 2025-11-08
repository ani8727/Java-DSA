public class Selection {

    static void sortS(int arr[]){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            if(i!=index){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }
    static void display(int arr[]){
        for(int i: arr) System.out.print(i+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr={2,4,1,0,9};

        sortS(arr);

        display(arr);
    }
}
