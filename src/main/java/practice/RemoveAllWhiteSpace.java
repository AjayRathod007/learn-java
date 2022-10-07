package practice;

public class RemoveAllWhiteSpace {
	public static void main(String[] args) {
		String str="  j a  va  s  ta r  ";
//		String ans="";
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)!=' ') {
//				ans+=str.charAt(i);
//			}
//		}
//		
//		System.out.println(ans);
		
		// String ans = str.replaceAll("//s", "");
		int fullLength=str.length();
		int l=fullLength/2;
		int count=0;
		String name="";
		for(int i=0;i<l;i++) {
			if(str.charAt(i)==' ' && count==0) {
				 count=0;
				//break;
			}else {
				count++;
				name=name+str.charAt(i);
				System.out.print(str.charAt(i));
			}
			
		}
		count=0;
       int temp=l;
		for(int j=fullLength-1;j>=l;j--) {
			if(str.charAt(j)==' ' && count==0) {
				 count=0;
				//break;
			}else {
				count++;
				//name=name+str.charAt(j);
				System.out.print(str.charAt(temp++));

			}
			
		}
	}

}
