package TryCatch;

import javax.swing.JOptionPane;

public class TryCatchRunner
{

	
	public static void main(String[] args)
	{
		
		int testNumber = 15;
		double testFloatingPoint = 0.000001;
		double errorTest = 0.0;
		int otherNumber = 0;
		int[] array = new int[3];
		
		try
		{
			for(int i=0;i<4;++i)
			{
				array[i] = i;
			}
			System.out.println(array);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Oops, we went to far, better go back to 0!");
		}
		
		try
		{
			testNumber = testNumber / otherNumber;
		}
		catch(Exception currentError)
		{
			JOptionPane.showMessageDialog(null, currentError.getMessage());
			JOptionPane.showMessageDialog(null, currentError.getClass().toString());
		}
		
		try
		{
			errorTest = errorTest/-errorTest;
		}
		
		catch(ArithmeticException currentError)
		{
			JOptionPane.showMessageDialog(null, currentError.getMessage());
			JOptionPane.showMessageDialog(null, currentError.getClass().toString());
		}
		JOptionPane.showMessageDialog(null, "Funny answer: " + 1/errorTest);

	}

}
