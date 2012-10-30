package Proj.first.am;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ProgrammingClass {

	private ArrayList<Classmate> FriendsList;
	private ArrayList<String> QuestionsList;

	public ProgrammingClass()
	{
		FriendsList = new ArrayList<Classmate>();
		QuestionsList = (new ArrayList<String>());
	}

	private void addClassmatesToList()
	{
		FriendsList.add(new Classmate("Mike"));
		FriendsList.add(new Classmate("Chase"));
		FriendsList.add(new Classmate("Celest"));
		FriendsList.add(new Classmate("Chadwick"));
		FriendsList.add(new Classmate("Cameron"));

	}

	private void addQuestionToList()
	{
		QuestionsList.add("What School you go to");
		QuestionsList.add("What is your favorite kind of duck");
		QuestionsList.add("How many siblings do you have");
		QuestionsList.add("How old are you");
		QuestionsList.add("Whats your favorite animal");
	}

	private void askQuestionsGUI()
	{
		for (Classmate currentClassmate : FriendsList)
		{
			currentClassmate.setQuestion1(JOptionPane.showInputDialog(QuestionsList.get(0)));
			currentClassmate.setQuestion2(JOptionPane.showInputDialog(QuestionsList.get(1)));
			currentClassmate.setQuestion3(JOptionPane.showInputDialog(QuestionsList.get(2)));
			currentClassmate.setQuestion4(JOptionPane.showInputDialog(QuestionsList.get(3)));
			currentClassmate.setQuestion5(JOptionPane.showInputDialog(QuestionsList.get(4)));
		}

	}

	private void printListInfo()
	{
		for (Classmate currentClassmate : FriendsList)
		{
			JOptionPane.showMessageDialog(null, currentClassmate.getQuestion1(), QuestionsList.get(0), JOptionPane.OK_OPTION);
			JOptionPane.showMessageDialog(null, currentClassmate.getQuestion2(), QuestionsList.get(1), JOptionPane.OK_OPTION);
			JOptionPane.showMessageDialog(null, currentClassmate.getQuestion3(), QuestionsList.get(2), JOptionPane.OK_OPTION);
			JOptionPane.showMessageDialog(null, currentClassmate.getQuestion4(), QuestionsList.get(3), JOptionPane.OK_OPTION);
			JOptionPane.showMessageDialog(null, currentClassmate.getQuestion5(), QuestionsList.get(4), JOptionPane.OK_OPTION);

		}
	}

	public void start()
	{
		addClassmatesToList();
		addQuestionToList();
		askQuestionsGUI();
		printListInfo();
	}

}
