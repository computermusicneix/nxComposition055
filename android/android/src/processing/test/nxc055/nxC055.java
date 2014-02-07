package processing.test.nxc055;

import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class nxC055 extends PApplet {

// nxComposition055_web
// Miquel Parera Jaques 
// January.2014
// License: CC-BY-SA

float posA = random(1,10);
float mulA = random(1.0f,2.0f);
float startA = random(0,PI);
float endA = random(PI, PI*2);

float posB = random(1,10);
float mulB = random(1.0f,2.0f);
float startB = random(0,PI);
float endB = random(PI, PI*2);

int population = PApplet.parseInt(random(1,200));

public void setup() {
 
  frameRate(12);
}

public void draw() {
  background(255);
  smooth();
  int i = 0;
  while (i < population) {
    i = i + 1;
    strokeWeight(random(1,3));
    noFill();
    stroke(0,0,0,random(0,255));
    strokeCap(SQUARE);
    //triangle(rad*mulA, (radius * sin(rad))*mulB, (radius * cos(rad))*mulC, (radius * cos(rad))*mulD, (radius * sin(rad))*mulE, rad*mulF);
    arc(i+random(1,720),450/posA, 720*mulA, 720*mulA, startA, endA);
    arc(i+random(1,720),450/posB, 720*mulB, 720*mulB, startB, endB);
  }  
  if (mousePressed) {
     posA = random(1,10);
     mulA = random(1.0f,2.0f);
     startA = random(0,PI);
     endA = random(PI, PI*2);
     posB = random(1,10);
     mulB = random(1.0f,2.0f);
     startB = random(0,PI);
     endB = random(PI, PI*2);
     population = PApplet.parseInt(random(1,200));
  }
}


  public int sketchWidth() { return 620; }
  public int sketchHeight() { return 877; }
}
