package LECTURE7;

public class CHAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		System.out.println(ch); // ch =(char)(ch);
		ch = (char)(ch+1);
		System.out.println(ch);
		System.out.println((int)(ch)); // ch = (int)(ch+1)
		
		
		// infinite loop due type casting
//		for (byte b = 0; b<128;b++) { (127+1 = -128) 
//			System.out.println(b);
//		}
//		for (byte b = 0; b<=127;b++) { (127+1 = -128)
//			System.out.println(b);
//		}
		
	}

}
