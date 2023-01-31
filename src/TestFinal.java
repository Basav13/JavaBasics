import java.util.*;
public class TestFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int[] arr = new int[] {1,2,3,4,5};
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		arr[3] = 6;
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		final StringBuffer str = new StringBuffer("Kabir");
		System.out.println(str);
		str.append("Singh");// non-transitivity : same reference can point to other objects 
		System.out.println(str);
		str.delete(1, 3);//non-transitivity
		System.out.println(str);
		StringBuffer new_str = new StringBuffer("Preeti");
		//str = new_str; //can't be reassigned
		
		
	}

}
