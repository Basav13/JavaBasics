import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;

interface Cube
{
	int calculate(int x);
}
public class FunctionalInterface {

	public static void main(String[] args) {
		
		int val = 7;
		Cube c = (int x)->x*x*x;
		System.out.println((c.calculate(val)));
		
		//Consumer
		Consumer<List<Integer>> consumer = (list) -> {
			for(int i = 0 ; i < list.size() ; i++)
			{
				list.set(i,3*list.get(i));
			}
		};
		Consumer<List<Integer>> display = list -> {
			for(int i = 0 ; i < list.size() ; i++)
			{
				System.out.print(list.get(i)+" ");
			}
		};
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
//		consumer.accept(list);
//		display.accept(list);
		consumer.andThen(display).accept(list);
		
		//Predicate
		List<String> names = new ArrayList<String>();
		names.add("Java");
		names.add("JavaScript");
		names.add("C++");
		names.add("jade");
		names.add("Scala");
		System.out.println();
		Predicate<String> p = str -> str.startsWith("J");
		for(String st : names)
		{
			if(p.test(st))
				System.out.print(st+" ");
		}
		System.out.println();
		
		//Function
		Function<Integer,Double> half = a -> a/2.0;
		half = half.andThen(a -> a*3);
		//half = half.compose(a->a/3);
		System.out.println(half.apply(9));
		Function<Integer,Integer> id = Function.identity();
		System.out.println(id.apply(3));
		
		//Supplier
		Supplier<Double> sup = () -> Math.random();
		System.out.println(sup.get());
	}

}
