import java.util.*;
import java.util.function.Consumer;
public class ConsumerInterface {

	public static void main(String[] args) {
		
		Consumer<List<Double>> increment = (lst) -> {
			for(int i = 0 ; i < lst.size() ; i++)
			{
				lst.set(i, lst.get(i)+((0.15)*lst.get(i)));
			}
		};
		List<Double> list = new ArrayList<>();
		Collections.addAll(list, 5000.0,6000.0,4500.0,8000.0);
		System.out.println(list);
		increment.accept(list);
		System.out.println(list);
		Consumer<List<Double>> display = (lst)-> {
			for(int i = 0 ; i < lst.size() ; i++)
			{
				System.out.print(lst.get(i)+" ");
			}
		};
		increment.andThen(display).accept(list);
		

	}

}
