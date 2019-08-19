/** Literals
 * Practice2
 * Adam Kolodko 
 * 10/19/2017
 * */


enum Seasons {
	NORTH,
	SOUTH,
	EAST,
	WEST
}

public class Literals {
	
	
	
	public static void main(String[] arg) {
		byte myByte = 0x7f;
		short myShort = 0x7fff;
		int myInt = 7;
		System.out.println("Byte size: " + myByte);
		System.out.println("Short size: " + myShort);
		System.out.println("Int: " + Integer.toOctalString(myInt));

	}
}