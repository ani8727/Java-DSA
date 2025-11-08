public class InsertionRec {
    public void recursion(int[] arr, int n){

        if(n<=1) return;

        // start with small size
        recursion(arr,n-1);

        // call recursion until hit base condition

        //when arr sizes 2 it cal
        int last=arr[n-1];
        int j=n-2;

        while(j>=0 && arr[j]>last){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=last;
    }
    public void display(int[] arr){
        for(int i: arr) System.out.print(i+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        InsertionRec obj=new InsertionRec();
        int[] arr ={2,4,1,0,8,2,5,1};

        int n=arr.length;

        obj.recursion(arr,n);
        obj.display(arr);

    }
}
