package Easy;

public class CeilingOfANumberAscending {
	
	public static void main(String[] args) {
		
		int[] arr = {-18, -12, 22, 0, 89};
		int target = 19;
		int ans = ceiling(arr, target);
		System.out.println(ans);
	}

	private static int ceiling(int[] arr, int target) {
		
		if(target>arr[arr.length-1]) {
			return -1;
		}
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end){
			
			int mid = start+(end-start)/2;
			
			if(target<arr[mid]) {
				end = mid -1;
			}else if (target>arr[mid]) {
				start = mid +1;
			}else {
				return mid;
			}
		}
		return start;
	}

}
