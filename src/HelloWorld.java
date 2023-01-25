import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		/*int[] arr = new int[5];
		Scanner scn = new Scanner(System.in);
		for(int i = 0 ; i < 5 ; i++)
		{
			arr[i] = scn.nextInt();
		}
		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.println(arr[i]);
		}
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int i = 0 ; i < 5 ; i++)
		{
			ar.add(i+1);
		}
		System.out.println(ar);*/
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("Java");
		System.out.println(sb);
        sb.replace(1,3,"C++");
        System.out.println(sb);
        sb.delete(1,4);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
	}

}
