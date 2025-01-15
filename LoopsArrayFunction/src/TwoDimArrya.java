
public class TwoDimArrya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[][] = new String[2][3];
		
		// new row 1
		
		str[0][0]="Anand";
		str[0][1] = "25";
		str[0][2] = "gmail";
		
		// row2
		str[1][0] = "state";
		str[1][1] = "country";
		str[1][2] = "region";
		
		System.out.println(str.length);
		System.out.println(str[0].length);
		
		for(int rNum=0; rNum <str.length; rNum++) {
			//System.out.println("Rows Number is : "+ rNum);
			
			for(int cNum = 0; cNum < str[rNum].length; cNum++) {
				String data = str[rNum][cNum];
				System.out.println(data);
			}
			
			
		}
				
	}

}
