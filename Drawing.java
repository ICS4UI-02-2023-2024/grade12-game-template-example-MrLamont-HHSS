import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Drawing extends JPanel{
  // Timer for the game loop
  Timer gameTimer;
  
  Keyboard keys = new Keyboard();
  Mouse mouse = new Mouse();

  
  // How fast do you want your game to run? Frames Per Second  
  final int FPS = 60;
  // What suze of screen do you want?
  final int WIDTH = 800;
  final int HEIGHT = 600;

  // Other variables for your project can go on the next lines

  
  
    


  // Initialize things BEFORE the game starts
  public void setup(){
    // are there any variables that need initialized BEFORE the game starts?
    // Do that here!
    
    
    
  }

    // Paint the game components here
    @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    // clear the screen
    g.clearRect(0, 0, WIDTH, HEIGHT);

    // You can add more drawing here
    
    
    
  }

  // Update game logic here
  public void loop() {
    // This method is called by the game loop
    // This is where your game logic goes
    
    
  }


  // YOU SHOULDN'T NEED TO MODIFY ANYTHING AFTER THIS POINT
  // Feel free to have a look to see what is happening but don't touch the code down here!
  // This is what makes the window and all of the keyboard and mouse stuff work

  // creates the game window and sets everything up to run properly
  public Drawing() {
    // Initialize the game window
    JFrame frame = new JFrame("Simple 2D Game");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(WIDTH, HEIGHT);
    frame.setVisible(true);
    frame.add(this);
   
    frame.addKeyListener(keys);
    this.addMouseListener(mouse);
    this.addMouseMotionListener(mouse);
    this.addMouseWheelListener(mouse);
    // call the setup method for parts that need initialized before the game starts
    setup();

    // Initialize game timer to run at a constant FPS
    gameTimer = new Timer(1000/FPS, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            loop();
            repaint();
        }
    });
    gameTimer.start();
  }

  


  public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
          public void run() {
              new Drawing();
          }
      });
  }
}
