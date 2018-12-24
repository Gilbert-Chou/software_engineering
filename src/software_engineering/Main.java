package software_engineering;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		LetterGrade lg = new LetterGrade();

		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("input grade(or Enter 'q' to exit): ");
			str = in.nextLine();
			if(str.equals("q")) break;
			try {
				System.out.println("Letter Grade is: " + lg.letterGrade(Integer.parseInt(str)) + "\n");
			}catch(Exception e) {
				System.out.println("Please enter the number!\n");
			}
		}
		
		in.close();
		System.out.println("Bye");
	}

}
