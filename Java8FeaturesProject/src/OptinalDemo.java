import java.util.Optional;

public class OptinalDemo {
	    static Optional<String> changeCase(String word) {
	        String name="sometext";
	        if (name != null && word.startsWith("A")) {
	           return Optional.of(word.toUpperCase());
	          }
	        else {
	        return Optional.ofNullable(word); // someString can be null
	        }
	        }

	 

	    public static void main(String[] args) {
	    System.out.println(changeCase("Haneesh"));

	 

	    }

	 

	
}
