/**
 *  The picture being created in this code represents a person enjoying a night
 *  sailing on their boat.
 *
 * A version of this class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Alexander Kampf
 * @version 2020.01.30
 */
public class Picture
{
    private Square sky1;
    private Square sky2;
    private Square sky3;
    private Square boat1;
    private Square boat2;
    private Square boat3;
    private Square boat4;
    private Square boat5;
    private Square ocean1;
    private Square ocean2;
    private Square sailPole;
    private Square sail2;
    private Triangle sail1;
    private Person person;
    private Circle moon;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky1 = new Square();
        sky2 = new Square();
        sky3 = new Square();
        boat1 = new Square();
        boat2 = new Square();
        boat3 = new Square();
        boat4 = new Square();
        boat5 = new Square();
        ocean1 = new Square();
        ocean2 = new Square();
        sail2 = new Square();
        sailPole = new Square();
        sail1 = new Triangle();
        person = new Person();
        moon = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky1.moveHorizontal(-320);
            sky1.moveVertical(-180);
            sky1.changeSize(255);
            sky1.changeColor("black");
            sky1.makeVisible();
            
            sky2.changeColor("black");
            sky2.moveHorizontal(-50);
            sky2.moveVertical(-180);
            sky2.changeSize(255);
            sky2.makeVisible();
            
            ocean1.changeColor("blue");
            ocean1.moveHorizontal(-310);
            ocean1.moveVertical(40);
            ocean1.changeSize(500);
            ocean1.makeVisible();
            
            sailPole.changeColor("white");
            sailPole.changeSize(60);
            sailPole.moveHorizontal(-65);
            sailPole.moveVertical(40);
            sailPole.makeVisible();
            
            ocean2.changeColor("blue");
            ocean2.moveHorizontal(-50);
            ocean2.moveVertical(40);
            ocean2.changeSize(60);
            ocean2.makeVisible();
            
            sail1.changeColor("red");
            sail1.moveHorizontal(95);
            sail1.moveVertical(-40);
            sail1.makeVisible();
          
            person.moveHorizontal(-40);
            person.moveVertical(25);
            person.makeVisible();
             
            boat1.changeColor("white");
            boat1.changeSize(50);
            boat1.moveHorizontal(-100);
            boat1.moveVertical(100);
            boat1.makeVisible();
            
            boat2.changeColor("white");
            boat2.changeSize(50);
            boat2.moveHorizontal(-90);
            boat2.moveVertical(100);
            boat2.makeVisible();
            
            boat3.changeColor("white");
            boat3.changeSize(50);
            boat3.moveHorizontal(-65);
            boat3.moveVertical(100);
            boat3.makeVisible();
            
            boat4.changeColor("white");
            boat4.changeSize(40);
            boat4.moveHorizontal(-120);
            boat4.moveVertical(100);
            boat4.makeVisible();
            
            boat5.changeColor("white");
            boat5.changeSize(40);
            boat5.moveHorizontal(-35);
            boat5.moveVertical(100);
            boat5.makeVisible();
            
            sail2.changeColor("red");
            sail2.moveHorizontal(-65);
            sail2.moveVertical(-20);
            sail2.makeVisible();
            
            sky3.changeColor("black");
            sky3.moveHorizontal(-80);
            sky3.moveVertical(-120);
            sky3.changeSize(100);
            sky3.makeVisible();
    
            moon.changeColor("white");
            moon.moveHorizontal(100);
            moon.moveVertical(-40);
            moon.changeSize(80);
            moon.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        ocean1.changeColor("white");
        ocean2.changeColor("white");
        boat1.changeColor("black");
        boat2.changeColor("black");
        boat3.changeColor("black");
        boat4.changeColor("black");
        boat5.changeColor("black");
        sailPole.changeColor("black");
        sail1.changeColor("white");
        sail2.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        ocean1.changeColor("blue");
        ocean2.changeColor("blue");
        boat1.changeColor("white");
        boat2.changeColor("white");
        boat3.changeColor("white");
        boat4.changeColor("white");
        boat5.changeColor("white");
        sailPole.changeColor("white");
        sail1.changeColor("red");
        sail2.changeColor("red");
    }
}
