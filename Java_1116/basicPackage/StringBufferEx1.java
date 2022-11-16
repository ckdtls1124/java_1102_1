package basicPackage;

public class StringBufferEx1 {
	
	
	public static void main(String[] args) {
		
//		revise
		StringBuffer sb1= new StringBuffer("JAVA");
		
		
//		append
		sb1.append(" project2022");
		System.out.println(sb1);
		
//		delete
		sb1.delete(0, 4);
		System.out.println(sb1);
		
//		insert
		sb1.insert(0, "2023 ");
		System.out.println(sb1);
		
//		reverse
		sb1.reverse();
		System.out.println(sb1);
		sb1.reverse();
		
		sb1.replace(0, 4, "oracle");
		System.out.println(sb1);
		
	}
	
}
