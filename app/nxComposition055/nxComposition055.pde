// nxComposition055
// Miquel Parera Jaques 
// January.2014
// License: CC-BY-SA

int d = day();    
int m = month();  
int y = year();
int h = hour();
int minut = minute();
int s = second();

float numFrames = 12;

int width = 1440/2; // replace on web
int height = 900/2; // replace on web

float posA = random(1,10);
float mulA = random(1.0,2.0);
float startA = random(0,PI);
float endA = random(PI, PI*2);

float posB = random(1,10);
float mulB = random(1.0,2.0);
float startB = random(0,PI);
float endB = random(PI, PI*2);

int population = int(random(1,200));

void setup() {
  size(width,height);
  frameRate(12);
}

void draw() {
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
    arc(i+random(1,width),height/posA, width*mulA, width*mulA, startA, endA);
    arc(i+random(1,width),height/posB, width*mulB, width*mulB, startB, endB);
  }  
  if (mousePressed) {
     posA = random(1,10);
     mulA = random(1.0,2.0);
     startA = random(0,PI);
     endA = random(PI, PI*2);
     posB = random(1,10);
     mulB = random(1.0,2.0);
     startB = random(0,PI);
     endB = random(PI, PI*2);
     population = int(random(1,200));
  }
//  if (frameCount <= numFrames) {
//  saveFrame("nxComposition054-"+y+"-"+m+"-"+d+"_"+h+"-"+minut+"-"+s+"-##.jpg");  
//  }
}

