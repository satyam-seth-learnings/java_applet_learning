import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
	Font obj=new Font("Times New Roman",Font.BOLD,20);
	Font obj1=new Font("serif",Font.ITALIC,40);
	public void paint(Graphics g)
	{
		g.setFont(obj);
		g.drawString("Welcome",20,80);
		g.drawString("To",120,80);
		g.setFont(obj1);
		g.drawString("GeekyShows",160,80);
	}
}
//	<APPLET code="Myapplet.class" width="200" height="150"></APPLET>