import java.awt.*;
import java.awt.geom.*;

public class bCircle
{
    private int diameter;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    /**
     * Create a new circle at default position with default color.
     * false, where we are going, there are no defaults
     */
    public bCircle(String iColor, int iDia, int xPos, int yPos)
    {
        diameter = iDia;
        xPosition = xPos;
        yPosition = yPos;
        color = iColor;
        isVisible = true;
        draw();
    }

    //Change Visibilety
    public void makeVisible(){
        isVisible = true;
        draw();
    }

    public void makeInvisible(){
        erase();
        isVisible = false;
    }
    
    //Transforms ----------------------
    public void setX(int nx){
        erase();
        xPosition = nx;
        draw();
    }

    public void setY(int ny){
        erase();
        yPosition =ny;
        draw();
    }
    
    public void moveX(int distance){
        erase();
        xPosition = xPosition+distance;
        draw();
    }

    public void MoveY(int distance){
        erase();
        yPosition =yPosition+ distance;
        draw();
    }

    public void setSize(int newDia){
        erase();
        diameter = newDia;
        draw();
    }

    public void setColor(String newColor){
        color = newColor;
        draw();
    }

    /*
     * Draw the circle with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition, 
                    diameter, diameter));
            canvas.wait(10);
        }
    }

    /*
     * Erase the circle on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
