package day0;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="kavitha";
		String rever=" ";
		char ch;
		
		System.out.println("Orginal string:    "  + str);
		for(int i=0;i<str.length();i++)
		{
		ch=str.charAt(i);//Extract each letter
		rever = ch+rever;//adds each character infront of the existing string
		
		}
		
		System.out.println("Reverse string:    "  + rever);

	}

}
