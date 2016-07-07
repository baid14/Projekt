package pr;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Timer;


public class SokobanView extends Applet   {

	
int f=0;
int w=0;
int sizex = 14*40;
int sizey = 10*40;
static Applet applet;

SokobanModel ViewModel = SokobanModel.getInstance();
SokobanController ViewController = new SokobanController();
Timer timer = new Timer();
Image bufor;
Graphics bg;
static int stan = 1;

Image box;
Image floor;
Image face;
Image exit;
Image wall;



public int getSizeY()
{
	return sizey;
}

public int getSizeX()
{
	return sizex;
}


public static void main(String[] args) {
	
	System.out.println("tak");
	new SokobanView();
  
}


public void init()
{
	
	applet = this;
	ViewController.appletakl();
	applet.setSize(sizex,sizey);
	applet.setBackground(Color.LIGHT_GRAY);
	bufor = createImage(sizex,sizey);
	bg = bufor.getGraphics();
	timer.scheduleAtFixedRate(ViewModel, 10, 10);
	ViewModel.taketheboard();
	
	box = getImage(getDocumentBase(),"img/box.jpg");
	floor = getImage(getDocumentBase(),"img/floor.jpg");
	face = getImage(getDocumentBase(),"img/face.png");
	exit = getImage(getDocumentBase(),"img/exit.jpg");
	wall = getImage(getDocumentBase(),"img/wall.jpg");
	
	
}


public void update(Graphics g)
{
	bg.clearRect(0,0,sizex,sizey);
	paint(bg);
	g.drawImage(bufor,0,0,applet);
}
int i =2;

public void startorend()
{
	if(stan==0)
	{
		startorend SOS = new SokobanIff();
		SokobanIff SI = new SokobanIff();
		SOS.view();
		SOS.printf();
		SokobanStart SS = new SokobanStartFactory().getInstance(i);
		SS.view();
		
	}
	if(stan==2)
	{
	SokobanEndAdapter SEA = new SokobanEndAdapter();
	SEA.view();
	
	}
}

public void paint(Graphics g)
{
	switch(stan)
	{
	case 0:
	startorend();
	stan=1;
	break;
	case 1:
	drawtheboard(g);
	break;
	case 2:
	startorend();
	end(g);
	break;
	}
}
public void end(Graphics g)
{
	
}
public void drawtheboard(Graphics g)
{
	
	for(int i = 0;i<ViewModel.board.length;i++)
	{
		for(int j=0;j<ViewModel.board[0].length;j++)
		{

			switch(ViewModel.board[i][j])
			{
			case 0:
				g.drawImage(floor,40*j,40*i,this);
				f=1;
				break;
			case 1:
				g.drawImage(wall,40*j,40*i,this);
				w=1;
				break;

			}
			if(ViewModel.exit[i][j]==2)
			{
				g.drawImage(exit,40*j,40*i,this);
			}
			switch(ViewModel.board[i][j])
			{

			case 3:
				g.drawImage(box,40*j,40*i,this);
				break;
			case 4:
				if(ViewModel.ifexit()==true){
					g.drawImage(exit,40*j,40*i,this);
					g.drawImage(face,40*j,40*i,this);
					break;
				}
				else{
				g.drawImage(floor,40*j,40*i,this);
				g.drawImage(face,40*j,40*i,this);
				break;
				}
			}
		}
	}
	
}




int getf(){
	return f;
}

int getw(){
	return w;
}




}


