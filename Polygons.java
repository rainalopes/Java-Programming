import java.awt.*;
import java.applet.*;
/*
<applet code=Polygons.class width=200 height=150>
</applet>
*/
public class Polygons extends Applet {
public void paint(Graphics g)
 {
int i;
int x[]={25,5,5,45,45,25};
int y[]={25,45,65,65,45,25};
g.drawPolygon(x,y,6);
for(i=0;i<=5;i++)
{
	x[i]+=50;
	y[i]+=50;
}

g.fillPolygon(x,y,6);
}
}
