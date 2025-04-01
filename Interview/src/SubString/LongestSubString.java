package SubString;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubString {
	public static void main(String[] args) {
		System.out.println("sample 1 output: " + lengthOfString("xdfrabc"));
		System.out.println("sample 2 output: " + lengthOfString("aaaaa"));
		System.out.println("sample 3 output: " + lengthOfString("qcvvopit"));
	}
	
	public static int lengthOfString(String s) {
		 int n = s.length();
	        int maxLength = 0;
	        int i = 0, j = 0;
	        HashSet<Character> set = new HashSet<>();

	        while (i < n && j < n) {
	            if (!set.contains(s.charAt(j))) {
	                set.add(s.charAt(j++));
	                maxLength = Math.max(maxLength, j - i);
	            } else {
	                set.remove(s.charAt(i++));
	            }
	        }
		
		return maxLength;
	}

}
