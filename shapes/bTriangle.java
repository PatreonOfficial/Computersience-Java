import java.awt.*;

public class bTriangle
{
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    public bTriangle(String iColor,int iHight,int iWidth, int xPos, int yPos)
    {
        height = iHight;
        width = iWidth;
        xPosition = xPos;
        yPosition = yPos;
        color = iColor;
        isVisible = true;
        draw();
    }

    public void makeVisible()
    {
        isVisible = true;
        draw();
    }

    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }

    //Transforms ----------------------
    public void setX(int nx)
    {
        erase();
        xPosition = nx;
        draw();
    }

    public void setY(int ny)
    {
        erase();
        yPosition =ny;
        draw();
    }
    
    public void moveX(int distance)
    {
        erase();
        xPosition = xPosition+distance;
        draw();
    }

    public void MoveY(int distance)
    {
        erase();
        yPosition =yPosition+ distance;
        draw();
    }

    public void setColor(String newColor)
    {
        color = newColor;
        draw();
    }
 
    public void setSize(int newHeight, int newWidth)
    {
        erase();
        height = newHeight;
        width = newWidth;
        draw();
    }

    /*
     * Draw the triangle with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            int[] xpoints = { xPosition, xPosition + (width/2), xPosition - (width/2) };
            int[] ypoints = { yPosition, yPosition + height, yPosition + height };
            canvas.draw(this, color, new Polygon(xpoints, ypoints, 3));
            canvas.wait(10);
        }
    }

    /*
     * Erase the triangle on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}