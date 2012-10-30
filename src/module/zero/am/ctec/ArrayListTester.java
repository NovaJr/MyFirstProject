package module.zero.am.ctec;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import module.zero.am.ctec.Money;

public class ArrayListTester {

	/**
	 * @param args
	 */
	private ArrayList <Money> moneyList;
	
	public ArrayListTester()
	{
		moneyList = new ArrayList<Money>();
	}
	
	
	public void printListInfo()
	{
		//How to use a for-each loop also called an enhanced-for
		for(Money currentMoney : moneyList)
		{
			JOptionPane.showMessageDialog(null, currentMoney.getColor());
		}
	
}
	
	public void start()
	{
		//Print before adding
//		printListInfo();
		//creates some objects to the list
		Money mikeMoney = new Money();
		Money seanMoney = new Money();
		Money celestMoney = new Money();
		
		//Add Celest, then Sean, then put Mike in the middle
		moneyList.add(celestMoney);
		moneyList.add(seanMoney);
		moneyList.add(1,mikeMoney);
		//cannot add after .size() value of the list
		//print after adding
		//printListInfo();
		
		//remove by object
		moneyList.remove(mikeMoney);
		//remove by position
		moneyList.remove(0);
		//doesn't do anything because mikeMoney was already removed
		moneyList.remove(mikeMoney);
		
		//print after removing
		printListInfo();
	
	
	}

}