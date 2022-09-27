package Easy;

public class LinearSearchExample2 {
	
	public static void main(String[] args) {
		
		String str = "Satyam";
		char target = 'y';
		boolean checkIfPresent = search(str, target);
		System.out.println(checkIfPresent);
	}

	private static boolean search(String str, char target) {
		
		if(str.length()==0) {
			return false;
		}
		
		for(int i=0; i<str.length(); i++) {
			if(target==str.charAt(i)) {
				return true;
			}
		}
		return false;
	}

}
