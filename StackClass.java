import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        // System.out.println(st.empty()); // false
        // System.out.println(st.peek());  // 40
        // System.out.println(st.pop());   // 40
        // System.out.println(st.pop());   // 30
        // System.out.println(st.pop());   // 20
        // System.out.println(st.pop());   // 10
        // System.out.println(st.empty()); // true

        // int position = st.search(20); // position from top
        // System.out.println("Position of 20 from top: " + position);
        // System.out.println("size of the stack: " + st.size());
        
        //-- trarverse stack
        // while (!st.empty()) {
        //     System.out.println(st.pop());
        // }
    }
}
