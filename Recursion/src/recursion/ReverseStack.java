package recursion;

import java.util.Stack;

public class ReverseStack {

    static void insertAtBottom(Stack<Integer> st,int bottom){
        if(st.empty()){
            st.push(bottom);
            return;
        }

        int top=st.pop();
        insertAtBottom(st,bottom);
        st.push(top);
    }

    static void reverse(Stack<Integer> st){
        if(st.empty()) return;

        int top =st.pop();
        reverse(st);
        insertAtBottom(st,top);
    }

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        reverse(st);

        while(!st.empty()){
            System.out.println(st.pop()+" ");
        }
    }
}
