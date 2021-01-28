import java.util.Scanner;
public class CustomException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		try {
			int x=sc.nextInt();
			if (x == 0) 
				throw new ZeroException();
			if (x % 2 != 0)
				throw new OddNumberException();
			System.out.println("Number is Even");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

}
}


