package groupnamea.Projectnamep;

public class Prime {

	public static void main(String[] args) {
		String input ="Jamnagar";
		boolean isPalindrome = isPalindrome(input);
		
		if(isPalindrome) {
			System.out.println(input+" "+"is Palindrome");
		}else {
			System.out.println(input+" "+"is not palindorme");

		}
		}
public static boolean isPalindrome(String str) {
	int left=0;
	int right = str.length()-1;
	
	while(left<right) {
		if(str.charAt(left)!=str.charAt(right)) {
			return false;
		}
		left++;
		right--;
	}
	return true;
}}
