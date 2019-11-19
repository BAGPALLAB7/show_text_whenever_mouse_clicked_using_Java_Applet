package applettest;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="applettest" width=100 height=100>
</applet>
*/

public class applettest extends Applet implements MouseListener,MouseMotionListener{
	int x,y;
	String str="";
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void paint(Graphics g) {
		g.drawString(str, x ,y );
	}
	public void mouseClicked(MouseEvent m) {
		str="Pallab";
		x=m.getX();
		y=m.getY();
		repaint();
	}
}