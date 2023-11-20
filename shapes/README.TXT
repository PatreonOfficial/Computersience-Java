//Mach haus Schwarz Gelbes Fenster

//The classes "Triangle", "Circle", "Square" & "Canvas" are by these dudes:
/**
 * Canvas is a class to allow for simple graphical drawing on a canvas.
 * This is a modification of the general purpose Canvas, specially made for
 * the BlueJ "shapes" example. 
 *
 * @author: Bruce Quig
 * @author: Michael Kölling (mik)
 *
 * @version: 1.6 (shapes)
 */

//All the "b+{something}" are heavely edited to Improve the Usability
//& everything else is done by me
//Cobj was my first try wich didnt work....
/**
 *
 * @author: PatreonOfficial(Jörg Justus Osthoff)
 *
 * @version: alpha 1.0
 */




How to:
[] = String
{} = int

Basic setup:
The canvas is 500 x 500 starting with 0x0 in the upper left corner

create an betterObject:
bSquare [name];
[name] = new bSquare([color], (size), (posX), (posY));

bCircle [name];
[name] = new bCircle([color], (size), (posX), (posY));

bTriangle [name];
[name] = new bTriangle([color], (hight), (width), (posX), (posY));

Change betterObjects:
[name].makeVisible();
[name].makeInvisible();
[name].setX(int);      //The differance is that move is relative
[name].setY(int);      //and set absolute
[name].moveX(int);     //
[name].moveY(int);     //
[name].setColor(String);
[name].setSize(int);
[name].setHight(int); //Only bTriangle
[name].setWidth(int); //Only bTriangle
