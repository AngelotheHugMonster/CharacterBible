import java.util.Scanner;

public class Main
{
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter a file name: ");
		String name = input.next();
		System.out.println("Enter a description: ");
		String desc = input.nextLine();
		
		String path = "E:\\test\\" + name + ".txt";
	}

}
