package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sky;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        window = new Square();
        window.changeColor("magenta");
        window.moveHorizontal(-200);
        window.moveVertical(-50);
        window.changeSize(800);
        window.makeVisible();

        window = new Square();
        window.changeColor("green");
        window.moveHorizontal(-80);
        window.moveVertical(80);
        window.changeSize(800);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(20, 180);
        roof.moveHorizontal(200);
        roof.moveVertical(100);
        roof.makeVisible();
        
        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(20, 180);
        roof.moveHorizontal(150);
        roof.moveVertical(100);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(150);
        sun.moveVertical(80);
        sun.changeSize(300);
        sun.makeVisible();

        wall = new Square();
        wall.moveVertical(80);
        wall.moveHorizontal(-50);
        wall.changeSize(100);
        wall.changeColor("black");
        wall.makeVisible();

        wall = new Square();
        wall.moveVertical(80);
        wall.moveHorizontal(30);
        wall.changeSize(100);
        wall.changeColor("black");
        wall.makeVisible();

/* The windows warm with light */
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(-20);
        window.moveVertical(100);
        window.makeVisible();


        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(80);
        window.moveVertical(100);
        window.makeVisible();


/*  The red door */
        window = new Square();
        window.changeColor("red");
        window.moveHorizontal(30);
        window.moveVertical(140);
        window.makeVisible();

        window = new Square();
        window.changeColor("red");
        window.moveHorizontal(30);
        window.moveVertical(150);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("red");
        roof.changeSize(80, 180);
        roof.moveHorizontal(50);
        roof.moveVertical(35);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("red");
        sun.moveHorizontal(180);
        sun.moveVertical(-30);
        sun.changeSize(40);
        sun.makeVisible();


    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
