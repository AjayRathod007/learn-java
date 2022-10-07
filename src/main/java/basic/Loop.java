package basic;

public class Loop {
	
	public static void main(String[] args) {
		int a = 5;
		int i;
		for( i = 1; i <= 10; i++) {
			System.out.println("a*i;" + (a*i));
			System.out.println(a+"*"+i+";" + (a*i));
			System.out.printf("%d*%d: %d\n" ,a,i, (a*i));
		}
		
	} 

}
