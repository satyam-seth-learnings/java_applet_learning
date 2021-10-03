import java.applet.Applet;
import java.awt.Graphics;
public class Myapplet extends Applet
{
	int count=1;
	public void init()
	{
		System.out.println("init Method "+count++);
	}
	public void start()
	{
		System.out.println("start Method "+count++);
	}
	public void stop()
	{
		System.out.println("stop Method "+count++);
	}
	public void destroy()
	{
		System.out.println("destroy Method "+count++);
	}
	public void paint(Graphics g)
	{
		System.out.println("paint Method "+count++);
		g.drawString("Welcome To Geekyshows",50,20);
	}
}

//	<APPLET code ="Myapplet.class" width="200" height="150"></APPLET>