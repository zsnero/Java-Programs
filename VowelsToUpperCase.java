public class VowelsToUpperCase {
	public static void toUpperCase(char[] str) {

		for(int i=0; i<str.length; i++) {

			if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u') {

				char ch = Character.toUpperCase(str[i]);
				str[i] = ch;
			}
		}

		for(char c : str) {
			System.out.print(c);
		}
	}

	public static void main(String args[]) {

		String str = "Hello World";
		toUpperCase(str.toCharArray());
	}
}