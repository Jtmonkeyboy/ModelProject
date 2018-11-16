package model;

public class Guitar
{
	private String name;
	private String color;
	private int strings;
	private boolean isElectric;
	private boolean isRighty;
	
	public Guitar()
	{
		this.name = "Herold";
		this.color = "Brown";
		this.strings = 6;
		this.isElectric = false;
		this.isRighty = true;
	}
	
	public Guitar(String name, String color, int strings, boolean isElectric, boolean isRighty)
	{
		this.name = name;
		this.color = color;
		this.strings = strings;
		this.isElectric = isElectric;
		this.isRighty = isRighty;
	}
	
	public String toString()
	{
		String description = "";
		if(!isElectric)
		{
			description = "This guitar's name is " + name + ".\n"
							+ "The color is " + color + ".\n"
							+ "It has " + strings + " strings.\n"
							+ "The guitar is not electric.\n";
		}
		else
		{
			description = "This guitar's name is " + name + ".\n"
							+ "The color is " + color + ".\n"
							+ "It has " + strings + " strings.\n"
							+ "The guitar is electric.\n";
		}
		if(isRighty)
		{
			description += "It is also a right handed guitar.";
		}
		else
		{
			description += "It is also a left handed guitar.";
		}
		
		return description;
	}
	
	//Start of getters.
	public String getName()
	{
		return name;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public int getStrings()
	{
		return strings;
	}
	
	public boolean getIsElectric()
	{
		return isElectric;
	}
	
	public boolean getIsRighty()
	{
		return isRighty;
	}
	//End of getters.
	
	//Start of setters.
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setStrings(int strings)
	{
		this.strings = strings;
	}
	
	public void setIsElectric(boolean isElectric)
	{
		this.isElectric = isElectric;
	}
	
	public void setIsRighty(boolean isRighty)
	{
		this.isRighty = isRighty;
	}
	//End of setters.
	
	
}
