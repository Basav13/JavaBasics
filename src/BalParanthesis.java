import java.util.*;
public class BalParanthesis {
	static boolean isValid(String s)
	{
		Stack<Character> st = new Stack<Character>();
		for(int i = 0 ; i < s.length(); i++)
		{
			if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[')
				st.push(s.charAt(i));
			else
			{
				if(st.size() == 0)
					return false;
				char ch = st.peek();
				st.pop();
				if((s.charAt(i) == ')' && ch == '(') || (s.charAt(i) == '}' && ch == '{') || (s.charAt(i) == ']' && ch == '['))
				{
					continue;
				}
				else
					return false;
			}
		}
		return st.empty();
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = scn.nextLine();
		System.out.println(isValid(str));

	}

}
