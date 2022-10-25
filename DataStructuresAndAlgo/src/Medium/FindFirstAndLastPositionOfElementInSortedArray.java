package Medium;

public class FindFirstAndLastPositionOfElementInSortedArray {
	
	// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
	
	public static void main(String[]args) {
		
		int[] arr = {5, 7, 7, 7, 8, 8, 10};
		int target = 7;
		int [] result = new int[5];
		result = searchRange(arr, target);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
		
		
	}
	
public static int[] searchRange(int[] nums, int target) {
        
        int [] ans = {-1, -1};
        
        ans[0] = search(nums, target, true);
        if(ans[0]!=-1){
            ans[1] = search(nums, target, false); 
        }
         return ans;
    }
    
    static int search (int [] takeArray, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = takeArray.length-1;
        
        while(start<=end){
            
            int mid = start+(end-start)/2;
            
            if(target<takeArray[mid]){
                end = mid-1;
            }
            else if(target>takeArray[mid]){
                start=mid+1;
            }
            else{
                //potential ans found but ...
                ans = mid;
                if(findStartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

}
