package DemoModule;

public class generics2 {
	public static <P> void PrintArray(P[] inputArray)
	{
		for(P element: inputArray)
		{
			System.out.printf("%s", element);
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5,6};
		Double[] doubleArray = {1.1,1.2,1.3,1.4,1.5,1.6};
		Character[] charArray = {'a','b','c','d','e'};
		System.out.println("\nArray integerArray Contains");
		PrintArray(intArray);
		System.out.println("\nArray doubleArray Contains");
		PrintArray(doubleArray);
		System.out.println("\nArray charactergerArray Contains");
		PrintArray(charArray);
		
		

	}

}
