package Easy;

public class OrderAgnosticBinarySearch {
	
	public static void main(String[]args) {
		
		int[] arr = {-18, -12, 22, 0, 89};
		int target = 22;
		int ans = orderAgnosticBS(arr, target);
		System.out.println(ans);
	}

	private static int orderAgnosticBS(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		boolean isAsc = arr[start] < arr[end];
		
		while(start<=end) {
			
			int mid = start + (end-start) /2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if (isAsc) {
				
				if(target<arr[mid]) {
					end = mid-1;
				}else if(target>arr[mid]) {
					start = mid+1;
				}
				
			}else {
				
				if(target<arr[mid]) {
					start = mid+1;
				}else if(target>arr[mid]) {
					end = mid-1;
				}
			}
			
		}
		
		return -1;
	}

}
