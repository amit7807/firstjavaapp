
public class ColorPoint extends Point {
	private String color;
	static String colors[];
	static
	{
		colors=new String[5];
		colors[0]="Saffron";
		colors[1]="Black";
	    colors[2]="Yellow";
	    colors[3]="Orange";
	    colors[4]="Blue";
	}
public ColorPoint(int x,int y,String color)
{
	super(x,y);
	int i;
	this.color=color;
	
	for(i=0;i<colors.length;i++)
	{
		if(color.equals(colors[i]))
		{
			this.color=color;
			break;
		}
	}
	if(i==colors.length)
		this.color="White";
	
	}
public void display()
{
	super.display();
	System.out.println("Color is"+color);
}
}
