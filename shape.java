import java.awt.*;
import java.applet.*;
/*
<applet code =shape.class width=200 height=150>
</applet>
*/
public class shape extends Applet
{
public void paint(Graphics g)
{
g.drawOval(10,10,50,50);
g.drawOval(10,100,40,60);
g.fillOval(50,50,40,60);
g.drawRect(15,250,11,12);
g.fillRect(50,400,23,34);
g.drawRoundRect(100,100,50,50,10,10);
g.fillRoundRect(300,100,100,200,10,10);
}}
