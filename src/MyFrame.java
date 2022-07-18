import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;


public class MyFrame extends JFrame {

    MyFrame(){
        this.setVisible(true);                                          // this will make this visible. But it's so small to see
        this.setSize(500,500);                            // Not the size is visible

        this.setTitle("Title for JavaGUI");                            // It sets a title for this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           // When we click X to close, it really closes the this
        //  this.setDefaultCloseOperation(Jthis.DO_NOTHING_ON_CLOSE);     // When u click X, nothing will happen
        this.setResizable(false);                                      // Prevent this from being resized


        // How to change the logo of the app
        ImageIcon image = new ImageIcon("pexels-danne-457563.jpg");
        this.setIconImage(image.getImage());                           // This will change the icon of the this


        // How to change the background color of the this

        this.getContentPane().setBackground(Color.lightGray);
        // this.getContentPane().setBackground(new Color(0,0,0));        // This is black
        // this.getContentPane().setBackground(new Color(255,0,0));      // The first value is amount of red
        // this.getContentPane().setBackground(new Color(0,255,0));      // The second value is amount of green
        // this.getContentPane().setBackground(new Color(0,0,255));      // The second value is amount of blue






    }

}
