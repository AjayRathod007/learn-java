package recursion;

public class MoveCharacter {
	public static void main(String[] args) {
		String str = "axbcxxd";
		allMoveX(str,0,0,"");
		
	}
	public static void allMoveX(String str,int idx,int count,String newString) {
		if(idx==str.length()) {
			for(int i=0;i<count;i++) {
				newString +='x';
			}
			System.out.println(newString);
			return;
		}
		char currentChar = str.charAt(idx);
		if(currentChar=='x') {
			count++;
			allMoveX(str,idx+1,count,newString);
		} else {
			newString += currentChar;
			allMoveX(str,idx+1,count,newString);
		}
	}

}
