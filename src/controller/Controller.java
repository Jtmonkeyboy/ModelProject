package controller;

import javax.swing.JOptionPane;

import model.Guitar;

import java.util.ArrayList;

public class Controller
{
	private Guitar myGuitar;
	private Guitar userGuitar;
	private ArrayList<Guitar> guitarList = new ArrayList<Guitar>();
	
	public Controller()
	{
		myGuitar = new Guitar();
		userGuitar = new Guitar();
	}
	
	public void start()
	{
		buildTheLists();
		JOptionPane.showMessageDialog(null, myGuitar);
	}
	
	public void buildTheLists()
	{
		guitarList.add(myGuitar);
		guitarList.add(myGuitar);
		guitarList.add(userGuitar);
	}
}
