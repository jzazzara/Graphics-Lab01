// Lab04Bst.java
// The Expo Graphics Program
// This is the student, starting version, of Lab 04B.


import java.awt.*;
import java.applet.*;


public class Lab04Bst extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
		Expo.drawRectangle(g,50,50,300,300);
		Expo.drawRectangle(g,125,125,375,375);
		Expo.drawLine(g,50,50,125,125);
		Expo.drawLine(g,300,300, 375,375);
		Expo.drawLine(g,50,300, 125, 375);
		Expo.drawLine(g,300,50,375,125);

		// DRAW TARGET
		Expo.setColor(g,Expo.black); //NEW COLOR!!!
		Expo.fillCircle(g,550,175,115);
		Expo.setColor(g,Expo.white); //NEW COLOR!!!
		Expo.fillCircle(g,550,175,90);
		Expo.setColor(g,Expo.blue); //NEW COLOR!!!
		Expo.fillCircle(g,550,175,65);
		Expo.setColor(g,Expo.red); //NEW COLOR!!!
		Expo.fillCircle(g,550,175,40);
		Expo.setColor(g,Expo.yellow); //NEW COLOR!!!
		Expo.fillCircle(g,550,175,20);
		

		// DRAW TRIANGLE
		Expo.setColor(g,Expo.black); //NEW COLOR!!!
		Expo.drawLine(g,400,675,475,500); //Left
		Expo.drawLine(g,550,675,475,500); //Right
		Expo.drawLine(g,400,675,550,675); //Horizontal
		Expo.drawLine(g,400,675,510,585); //Diagnal
		Expo.drawLine(g,550,675,440,585); //Diagnal
		Expo.drawLine(g,475,500,475,675); //Vertical

		// DRAW SMILEY FACE
		Expo.drawOval(g,600,425,75,115); //Oval
		Expo.drawCircle(g,570,383,20); //Left Eye
		Expo.drawCircle(g,630,383,20); //Right Eye
		Expo.drawPoint(g,570,383); //Left Eye
		Expo.drawPoint(g,630,383); //Right Eye
		Expo.drawArc(g,570,370,25,23,270,90); //Left Eyebrow
		Expo.drawArc(g,630,370,25,23,270,90); //Right Eyebrow
		Expo.drawArc(g,600,440,60,25,90,270); //Mouth

		// DRAW JPII
		Expo.fillRectangle(g,25,600,50,650);
		Expo.fillRectangle(g,25,625,100,650);
		Expo.fillRectangle(g,75,525,100,625); //End of J
		Expo.fillRectangle(g,125,525,150,650);
		Expo.fillRectangle(g,125,525,200,550);
		Expo.fillRectangle(g,175,525,200,590);
		Expo.fillRectangle(g,125,569,200,590); //End of P
		Expo.fillRectangle(g,225,525,350,550);
		Expo.fillRectangle(g,250,525,275,650);
		Expo.fillRectangle(g,300,525,325,650);
		Expo.fillRectangle(g,225,625,350,650); //End of II
		
	}

}


