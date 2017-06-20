//https://blog.sterlingbusinessadvantage.com/2016/10/25/let-python-do-all-the-work-of-creating-a-github-repository/
import java.util.Scanner;

public class Bin2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binary;
		int sum=0;
		Scanner keyboard = new Scanner(System.in);
		binary = keyboard.next();
		
		char [] array = binary.toCharArray();
		int j=0;
		
		for(int i=array.length-1; i>= 0;i--)
		{
			if(array[i] == '1')
			{
				sum+= Math.pow(2, j);
			}
			j++;
		}
		
		System.out.println("The decimal value of "+ binary+ " is "+ sum);
		
		//fixing bubble sort
		
		
		 

	}

}
