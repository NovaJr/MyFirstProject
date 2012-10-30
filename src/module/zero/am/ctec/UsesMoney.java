package module.zero.am.ctec;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UsesMoney {

	private Money lopezMoney;
	private Money mikeMoney;
	private Scanner myScanner;

	public UsesMoney()
	{
		lopezMoney = new Money();
		mikeMoney = new Money();

		myScanner = new Scanner(System.in);
	}

	public void start()
	{
		// askGUI();
		// print();

		whileTest();
	}

	private void print()
	{
		mikeMoney.start();
		lopezMoney.start();
		System.out.println(mikeMoney.getColor());
		System.out.println(lopezMoney.getValue());
	}

	public void askQuestions()
	{
		System.out.print("What color of money do you like Mike");
		String temp = myScanner.nextLine();
		lopezMoney.setValue(temp);
		System.out.println(lopezMoney.getValue());

		System.out.print("What's your favorite color in general");
		String temp3 = myScanner.nextLine();
		lopezMoney.setValue(temp3);
		System.out.println(lopezMoney.getValue());

		System.out.print("What is your favorite value of money");
		String temp2 = myScanner.nextLine();
		mikeMoney.setColor(temp2);
		System.out.println(mikeMoney.getColor());

		System.out.print("How much money would you like");
		String temp4 = myScanner.nextLine();
		mikeMoney.setColor(temp4);
		System.out.println(mikeMoney.getColor());

		JOptionPane.showMessageDialog(null, "what kind of money do you like?");
		String answer = JOptionPane
				.showInputDialog("what kind of money do you like?");
		mikeMoney.setColor(answer);

	}

	public void askGUI()
	{

		lopezMoney.setValue(JOptionPane
				.showInputDialog("what kind of money do you like?"));
		mikeMoney.setColor(JOptionPane
				.showInputDialog("what is your favorite color"));
	}

	public void whileTest()
	{
		// declaring and initializing my loop variable for a while loop.
		boolean questionTester = false;
		int whileCounter = 5;
		
		while (whileCounter > 0)
		{
			askGUI();
		whileCounter--;
			// if I put a semicolon after while() it doesn't work
			
		}

	}

}
