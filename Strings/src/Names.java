import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(3,2,6,7,9,12,45,5,34,3,2,1);
		long c=numbers.stream().count();
		System.out.println("Total elements in a pipeline "+c);

		 

		System.out.println("========== Unique elements from a pipeline====");
		numbers.stream()
		.distinct()
		.forEach((t)->System.out.println(t));
		
		System.out.println("========count unqiue elements====");
		long count=numbers.stream()
		.distinct().count();
		System.out.println(count);
		
		System.out.println("=== Distinct even numbers in sorted order===");
		
		numbers.stream()
		.distinct()
		.filter((t)->t%2==0)
		.sorted()
		.forEach((t)->System.out.println(t));
		
		System.out.println("==== Square of every element======");
		Stream<Integer> values = Stream.of(2,5,7,2,4,8,9,5,6,7);
		values.distinct()
		.sorted()                
		.map((sq)->sq*sq)
		.forEach((sqnum)->System.out.println(sqnum));
	}
}
		

		


