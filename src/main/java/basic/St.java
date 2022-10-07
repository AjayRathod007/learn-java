package basic;

public class St {
	public static void main(String[] args) {
		aj();
	}
	public static void aj() {
		String name = "yeh mera desh";
		int l = name.length();
		int count =1;
		for(int i=0; i<=l-1; i++) {
			char c = name.charAt(i);
			if(c == ' ') {
				count++;
				
				
			}
			
		}
		System.out.println(count);
	}

}
