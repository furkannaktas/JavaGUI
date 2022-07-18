import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;


public class Main {

    public static void main(String[] args) {


        // JFrame is a GUI window to add components to

        /*
        JFrame frame = new JFrame();                                     // it creates a frame, but not visible yet
        frame.setVisible(true);                                          // this will make frame visible. But it's so small to see
        frame.setSize(500,500);                            // Not the size is visible

        frame.setTitle("Title for JavaGUI");                            // It sets a title for frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           // When we click X to close, it really closes the frame
    //  frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);     // When u click X, nothing will happen
        frame.setResizable(false);                                      // Prevent frame from being resized


        // How to change the logo of the app
        ImageIcon image = new ImageIcon("pexels-danne-457563.jpg");
        frame.setIconImage(image.getImage());                           // This will change the icon of the frame


        // How to change the background color of the frame

        frame.getContentPane().setBackground(Color.lightGray);
        // frame.getContentPane().setBackground(new Color(0,0,0));        // This is black
        // frame.getContentPane().setBackground(new Color(255,0,0));      // The first value is amount of red
        // frame.getContentPane().setBackground(new Color(0,255,0));      // The second value is amount of green
        // frame.getContentPane().setBackground(new Color(0,0,255));      // The second value is amount of blue


         */

         new MyFrame();



    }

}
