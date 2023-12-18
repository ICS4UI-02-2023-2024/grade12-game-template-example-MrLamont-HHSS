import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Mario {
    private enum Movement{
        LEFT,
        RIGHT,
        STOP
    }
    
    private Movement horizontal;
    private Rectangle hitbox;


    public Mario(int x, int y, int width, int height){
        this.hitbox = new Rectangle(x, y, width, height);
        this.horizontal = Movement.STOP;
    }

    public void update(){
        if(this.horizontal == Movement.RIGHT){
            this.hitbox.x += 5;
        }else if(this.horizontal == Movement.LEFT){
            this.hitbox.x -= 5;
        }
    }

    public void moveLeft(){
        this.horizontal = Movement.LEFT;
    }

    public void moveRight(){
        this.horizontal = Movement.RIGHT;
    }

    public void stop(){
        this.horizontal = Movement.STOP;
    }

    public void draw(Graphics2D g){
        g.setColor(Color.RED);
        g.fill(this.hitbox);
    } 



    
}
