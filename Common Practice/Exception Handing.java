

public class Main
{
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		
		try {
		    j = 18 /i;
		}
		catch(ArithmeticException e){
		    System.out.println("Please check nums");
		}
		catch(NullPointerException e){
		    System.out.println("Check that string is null");
		}catch(ArrayIndexOutOfBoundsException e){
		    System.out.println("Out of range index");
		}
		c
		catch(Exception e){
		    System.out.println("Something Went Wrong..." + e);    
		}
		
		
		System.out.println(j);
		System.out.println("Executed!");
	}
}
