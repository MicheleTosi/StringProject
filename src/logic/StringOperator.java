package logic;

public class StringOperator {
	
	private StringOperator(){}
	
	public static boolean main() {

		String str1 = "ciao ";
		String str2 = "come va";
	
		String res1= concatString(str1, str2);
		
		String res2 = addString(str1, str2);
		
		return areEquals(res1, res2);
	}
	
	private static Boolean areEquals(String str1, String str2) {
		return str1.equals(str2);
	}

	private static String concatString(String str1, String str2) {
		return str1 + str2;
	}

	private static String addString(String str1, String str2) {
		return str1.concat(str2);
	}
}
