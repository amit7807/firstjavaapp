
public class Point {
	private int x;
	private int y;

	public Point()
	{
		
	}
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void setPoint()
	{
		
		x=20;
		y=20;
	}
	public void display()
	{
		System.out.println("["+x+","+y+"]");
	}
}
