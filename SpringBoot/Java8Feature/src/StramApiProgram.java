import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StramApiProgram {
	public static void main(String[] args) {

// Find out even number program using java 8
		List<Integer> list = Arrays.asList(30, 5, 2, 7, 1, 3, 11, 40, 10);

		list.stream().filter(n -> n % 2 == 0).forEach(x -> System.out.println("Even no is... " + x));

		// Here, you don't actually need the name x in order to invoke println for each
		// of the elements.
		// That's where the method reference is helpful - the :: operator denotes
		// you will be invoking the println method with a parameter, which name you
		// don't specify explicitly:

		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		System.out.println("***********************************************************************");
		System.out.println("***********************************************************************");

//Find odd number using java 8

		List<Integer> oddFind = Arrays.asList(2, 4, 5, 6, 8, 7, 9, 5, 2, 3, 5, 4);

		oddFind.stream().filter(o -> o % 2 != 0).forEach(o -> System.out.println("Odd number is  " + o));

		System.out.println("***********************************************************************");
		System.out.println("***********************************************************************");

// Find the number starting from number 1 (like 10,30) so 10 should be output
		System.out.println("");
		System.out.println("");
		List<Integer> numberCheck = Arrays.asList(10, 11, 19, 9, 7, 100);

//first convert integer into String
		numberCheck.stream().map(s -> s + "").filter(s -> s.startsWith("1"))
				.forEach(s -> System.out.println("Number start with 1 is " + s));

		System.out.println("***********************************************************************");
		System.out.println("***********************************************************************");
// find duplicate data from list via java 8
		List<Integer> duplicateData = Arrays.asList(10, 5, 5, 7, 9, 8, 7, 11, 15, 4, 4, 5);
		Set<Integer> set = new HashSet<>();

		duplicateData.stream().filter(d -> !set.add(d)).forEach(d -> System.out.println("Duplicate data  " + d));

		long number = duplicateData.stream().count();
		System.out.println("Number of element in list is... " + number);

		duplicateData.stream().sorted().forEach(d -> System.out.println("sorted element is " + d));// means ascending
																									// order sorting

		duplicateData.stream().sorted(Collections.reverseOrder())
				.forEach(d -> System.out.println("Reverse order number" + d));

		// Skip and limit difference
		// skip- skip(long n) method return the remaining element after discarding first
		// n element

		// limit- it will return the limit data

		duplicateData.stream().skip(3).forEach(n -> System.out.println("Skip data is...................... " + n)); //skip first 3 element index start from 1

		System.out.println("***********************************************************************");
		
		duplicateData.stream().limit(3).forEach(n -> System.out.println("Long data is................... " + n));// it will give first 3 data only

		System.out.println("***********************************************************************");
		System.out.println("***********************************************************************");

		// https://javahungry.blogspot.com/2020/05/java-8-coding-and-programming-interview-questions.html
	}

}
