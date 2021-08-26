package logic;

public class StringOperator {
	
	public static boolean main(String[] args) {

		String str1 = "ciao ";
		String str2 = "come va";
	
		String res1= concatString(str1, str2);
		
		String res2 = addString(str1, str2);
		
		Boolean b = areEquals(res1, res2);
		
		return b;
	}
	
	private static Boolean areEquals(String str1, String str2) {
		Boolean b= str1.equals(str2);
		return b;
	}

	private static String concatString(String str1, String str2) {
		String str = str1 + str2;
		return str;
	}

	private static String addString(String str1, String str2) {
		String str = str1.concat(str2);
		return str;
	}
}
