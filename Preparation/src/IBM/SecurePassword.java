package IBM;

public class SecurePassword {

	public static void main(String[] args) {
		String pwd = "100101";
		System.err.println(minChanges(pwd));

	}
	
	public static int minChanges(String pwd) {
		int changes = 0;
		
		if(pwd.length() % 2 != 0) {
			pwd = pwd.substring(0, pwd.length() - 1);
		}
		
		for(int i=0; i < pwd.length(); i +=2) {
			if(pwd.charAt(i) != pwd.charAt(i + 1)) {
				changes ++;
			}
		}
		return changes;
	}

}
