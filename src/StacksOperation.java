import java.util.*;
public class StacksOperation {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("Last");
		st.push("In");
		st.push("First");
		st.push("Out");
		System.out.println(st);
		System.out.println("Popped item : "+st.pop());
		System.out.println(st);
		System.out.println(st.search("Last"));

	}

}
