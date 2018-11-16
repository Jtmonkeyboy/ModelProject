package controller;

import javax.swing.JOptionPane;

import model.Guitar;

import java.util.ArrayList;
//To make the ImageIcon array, you must give this import statement.
import javax.swing.ImageIcon;

public class Controller
{
	private Guitar myGuitar;
	private Guitar userGuitar;
	private ArrayList<Guitar> guitarList = new ArrayList<Guitar>();
	
	//Initialization of the arrays.
	private Guitar[]  guitarArray;
	private ImageIcon[] icons;
	
	public Controller()
	{
		myGuitar = new Guitar();
		userGuitar = new Guitar();
	}
	
	public void start()
	{
		buildTheLists();
		arrays();
		JOptionPane.showMessageDialog(null, myGuitar);
	}
	
	//This method is called to create the array lists.
	public void buildTheLists()
	{
		guitarList.add(myGuitar);
		guitarList.add(myGuitar);
		guitarList.add(userGuitar);
	}
	
	//This method is called to create the arrays.
	public void arrays()
	{
		icons = new ImageIcon[3];
		
		guitarArray = new Guitar[3];
	}
}
