// Assignment: Place the n-queens on the chessboard by taking input form the User
		//			   eg: User says row -> 1 and col -> 1 as input -> replace it with queen
		//			   a total of 4 inputs can be taken to place 4 queens in the chessboard
		//			   no queen can be placed in the same row again or same column again :)
		//			   Hint: use a do, while loop and make sure not to take more than 4 queens positions 

import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter number of Queens : ");
		byte n = scanner.nextByte();
		scanner.close();
		
		char whiteSquare = '\u25A1';
		char blackSquare = '\u25A0';
		char queen = '\u265B';
		byte k = 0;
		if(n<=4)
		{
			for(byte i=0;i<8;i++,k+=2)
			{
				for(byte j = 0;j<8;j++)
				{
					if(i%2==0)
					{
						char square = (j==k && (k/2<n))?queen:(((j+1)%2==0) ? blackSquare : whiteSquare);
						System.out.print(square);
					}
					else
					{
						char square = (j==k && (k/2<n))?queen:((j%2==0)? blackSquare:whiteSquare);
						System.out.print(square);
					}
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Warning : Invalid number of Queens");
		}

	}

}
