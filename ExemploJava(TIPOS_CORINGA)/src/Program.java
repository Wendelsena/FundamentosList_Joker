import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		// List<Object> myObjs = new ArrayList<Object>();
		// List<Integer> myNumbers = new ArrayList<Integer>();
		// myObjs = myNumbers; >>>>>> ERRO DE COMPILAÇÃO.

		// Existe o super tipo de lista para qualquer tipo de lista. a seguir:
		List<?> myObjs = new ArrayList<Object>(); // ela é representada por "?".
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;

		Object obj;
		Integer x = 10;
		obj = x;

		// ------------------------------------------------- \\
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);

		List<String> myStrs = Arrays.asList("Wendel", "Alefe", "Julia");
		printList(myStrs);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}

	}
	// ------------------------------------------------- \\
	// Porem não é possivel adicionar dados a uma coleção de tipo coringa.
	// public static void main() {
	// List<?> list = new ArrayList<Integer>();
	// list.add(3); // erro de compilação }

}
