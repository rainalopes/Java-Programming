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
g.drawOval(50,10,40,60);
g.fillOval(100,100,40,60);
g.drawRect(15,150,11,12);
g.fillRect(200,60,23,34);
g.drawRoundRect(250,100,50,50,10,10);
g.fillRoundRect(300,100,10,20,2,2);
}}
