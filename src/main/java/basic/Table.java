package basic;

public class Table {
	public static void main(String[] args) {
		int i;
		int count = 0;
		for(i=1; i<=100; i++) {
			if(i % 2 == 0) {
				if(i % 7 == 0) {
					count = count + 1;
					System.out.println("i;" + i);
					}
					
				}
					
			}
		System.out.println("count:" + count);
		}
	
	}

