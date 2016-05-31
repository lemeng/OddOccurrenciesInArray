
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class OddOccurrencesInArray {

	public static void main(String[] args) {
		
		int[] input = {9,3,9,3,9,7,9};
		
		int result = solution(input);
		
		System.out.println(result);

	}
	
	public static int solution(int[] A) {
		Map<Integer, Integer> arrayElementAndCount = new HashMap<>();
		
		//build hash table with count of occurrence.
		for (int element : A) {
			Integer occurrence = arrayElementAndCount.get(element);
			if (occurrence == null) {
				arrayElementAndCount.put(element,1);
			} else {
				arrayElementAndCount.put(element,++occurrence);
			}
		}
		
		int oddOccurrenceNumber = 0;
		
		Set<Entry<Integer, Integer>> entrySet = arrayElementAndCount.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			
			if (entry.getValue() % 2 != 0) {
				oddOccurrenceNumber = entry.getKey();
			}
		}
		
		return oddOccurrenceNumber;
	}
}
