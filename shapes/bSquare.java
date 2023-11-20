//This does the same as the Square Class just better because it is absolute and not relative
//and more versitile #didTheOneLinerB***
import java.awt.*;


public class bSquare
{
    private int size;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    public bSquare(String icolor, int isize, int iposx, int iposy){
        size = isize;
        xPosition = iposx;
        yPosition = iposy;
        color = icolor;
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

    public void setSize(int newSize){
        erase();
        size = newSize;
        draw();
    }

    public void setColor(String newColor){
        color = newColor;
        draw();
    }
    
    // Draw the square with current specifications on screen.
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                    new Rectangle(xPosition, yPosition, size, size));
            canvas.wait(10);
        }
    }

    /*
     * Erase the square on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
