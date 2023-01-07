import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Haneesh","Sujitha","Bala","Varshitha","Vanitha","Ramya S", "Alekhya Banda","Alekhya Barla","Likhitha","Ramya A","Poojitha");
		names.stream()
		.forEach((t)->System.out.println(t));
		
		System.out.println("==== display names starts with letter V");
		names.stream()
		.filter((t)->t.startsWith("V"))
		.forEach((t)->System.out.println(t));
		
		System.out.println("==== Collect names containing letter e");
		List<String> containE=names.stream()
				.filter((t)->t.contains("e"))
				.collect(Collectors.toList());
		System.out.println(containE);
		
		

	}

}
