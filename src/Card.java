import java.awt.Graphics;
import java.awt.event.*;
/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable{
    private int value;
    private int suit;
    private boolean color;
    private boolean faceup;
 

    public Card(int value, int suit){
        this.value=value;
        this.suit=suit;
    }
    public int getSuit(){
        return suit;
    }
    public int getValue(){
        return value;
    }
    public void draw(Graphics g){

    }
    public void update(ActionEvent a){

    }
}
