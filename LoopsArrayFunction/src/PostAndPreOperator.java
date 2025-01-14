
public class PostAndPreOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello");
		
		int i =100;
//		i=i+1;
		i++;
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
		
		int j=500 + i++;
		System.out.println(j);
		System.out.println(i);
		
		j =100;
		System.out.println(++j);
		j--;
		--j;
		
	}
}
