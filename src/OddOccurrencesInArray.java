
public class OddOccurrencesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {9,9,9,3,9,3,9,7,9,3,3};
		
		int result = solution(input);
		
		System.out.println(result);

	}
	
	public static int solution(int[] A) {
		int unpaired = 0;
		//int currentIndex = 0;
		
		for (int i = 0; i < A.length; i++) {
			//unpaired = A[i];
			//currentIndex = i;
			boolean finished = false;
			
			for (int j = i+1; j < A.length && !finished; j++) {
				if (A[i] == 0) { 
					finished = true;
					}
					
				if (A[i] == A[j]) {
					//unpaired = 0;
					A[i] = 0;
					A[j] = 0;
					finished = true;
				}
				
			}
			
		}
		
		for (int z = 0; z < A.length; z++) {
			if (A[z] != 0) {
				unpaired = A[z];
				//return A[z];
			}
		}
		return unpaired;
	}

}
