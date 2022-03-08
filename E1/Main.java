import java.util.*;

public class Main {

	public static void main(String[] args) {
		int its = 10;
		
		int n = 50;
		//int n = 500;
		//int n = 5000;
		//int n = 50000;
		
		//Integer[] numbers = RndIntegerArray(n);
		String[] numbers = RndStringArray(n);
		//Integer[] numbers = sortedRevIntegerArray(n);
		
		for (int i = 0; i < its; i++) {
			long start = System.nanoTime();
			//new BubbleSortUntilNoChange<Integer>().sort(numbers);
			//new BubbleSortPassPerItem<Integer>().sort(numbers);
			//new BubbleSortWhileNeeded<Integer>().sort(numbers);
			
			//new BubbleSortUntilNoChange<String>().sort(numbers);
			new BubbleSortPassPerItem<String>().sort(numbers);
			//new BubbleSortWhileNeeded<String>().sort(numbers);
			long stop = System.nanoTime();
			//System.out.println("["+ n +"]" + " ns " +  ": " + (stop - start));
			System.out.println((stop - start));
		}
	}
	

    	public static Integer[] RndIntegerArray(int n) {
		ArrayList<Integer> list = new ArrayList<>(n);
		Random random = new Random();
		for (int i = 0; i < n; i++) {
		    list.add(random.nextInt(n));
		}
		Integer[] array = new Integer[list.size()];
		array = list.toArray(array);
		//System.out.println(Arrays.toString(array));
		return array;
    	}
    

	public static String[] RndStringArray(int n) {
		ArrayList<String> list = new ArrayList<>(n);
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			list.add(String.valueOf(random.nextInt(n)));
		}
		String[] array = new String[list.size()];
		array = list.toArray(array);
		//System.out.println(Arrays.toString(array));
		return array;
	}

		
	public static Integer[] sortedRevIntegerArray(int n) {
		ArrayList<Integer> list = new ArrayList<>(n);
		Random random = new Random();
		for (int i = 0; i < n; i++) {
		    list.add(random.nextInt(n));
		}
		Collections.sort(list, Collections.reverseOrder());
		Integer[] array = new Integer[list.size()];
		array = list.toArray(array);
		//System.out.println(Arrays.toString(array));
		return array;
	}

}
