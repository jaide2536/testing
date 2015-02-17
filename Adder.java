import javax.swing.JOptionPane;
public class Adder{
	public static void main(String args[]){
		String firstNumber,secondNumber,result;
		int num1,num2;
		firstNumber = JOptionPane.showInputDialog("Enter first number:");
		secondNumber = JOptionPane.showInputDialog("Enter secon number:");
		num1 = Integer.parseInt( firstNumber );
		num2 = Integer.parseInt( secondNumber );

		result = "";
		result = "="+(num1+num2);
		JOptionPane.showMessageDialog( null, result, "Result",JOptionPane.INFORMATION_MESSAGE );
	 

	}

}
