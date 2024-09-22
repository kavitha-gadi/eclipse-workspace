package day0;

public class StringBiulderReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i love india";
		
		StringBuilder strb1= new StringBuilder();
		
		strb1.append(str);
		
		strb1.reverse();
		System.out.println("Reverse string   :" + strb1);

	}

}
