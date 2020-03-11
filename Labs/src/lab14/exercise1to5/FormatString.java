package lab14.exercise1to5;

//14.2: Write a method that uses lambda expression to format a given string, where a space is
//inserted between each character of string. For ex., if input is “CG”, then expected output is “C G”.

interface StringFormatter{
	public String insertSpaces(String str);
}

public class FormatString {

	public static void main(String[] args) {
		String s = "shailesh";
		StringFormatter sf = (String str)->{
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<str.length();i++) {
				
				sb.append((str.charAt(i)+" "));
			}
			return sb.toString();
		};
		
		String result = sf.insertSpaces(s);
		System.out.println(result);
	}

}
