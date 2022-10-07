package test;

public class Prime {
	public static void main(String[] args) {
		String s = "abcdddc";
		int count=0;
		int l =s.length();
		for(int i=0;i<s.length();i++) {
			int b = s.charAt(i)-'a'+1;
		 count +=isPrime(b);
		
		}
		 System.out.println((count+l));
	}

	private static int isPrime(int b) {
		// TODO Auto-generated method stub
		if(b==1) {
			return 0;
		}
		
	boolean flag = false;
	for(int i=2;i*i<=b;i++) {
		if(b%i==0) {
			flag = true;
			break;
		}
	}
	if(flag==false) {
		
		return 1; 
	}
		
	
	
	return 0;

}
}