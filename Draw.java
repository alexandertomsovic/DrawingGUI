/**
 * Draw Project
 * By Alex Tomsovic
 * USe the arrow keys to draw.
 * F1 = blue, F2 = red, F3 = green, and F4 brings color back to black.
*/
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class Draw extends Canvas {
    int x, y;
    Color color;
    public static void main( String[] args ) {
        JFrame draw = new JFrame("Use the arrow keys to draw!");
        draw.setSize(1020, 764);
        draw.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        draw.add( new Draw() );
        draw.setVisible(true);
    }

    public Draw() {
        enableEvents(java.awt.AWTEvent.KEY_EVENT_MASK);
        requestFocus();
        x = 500;
        y = 500;
        color = Color.black;


    }

    public void paint( Graphics g ) {
        g.setColor(color);
        g.fillOval(x, y, 15, 15);
    }

    public void update( Graphics g ) {
        paint(g);
    }


    public void processKeyEvent(KeyEvent e) {
        // this method automatically gets called when you press a key
        if ( e.getID() == KeyEvent.KEY_PRESSED ) {
            if ( e.getKeyCode() == KeyEvent.VK_UP )
                y -= 10;
            if ( e.getKeyCode() == KeyEvent.VK_DOWN )
                y += 10;
            if ( e.getKeyCode() == KeyEvent.VK_LEFT )
                x -= 10;
            if ( e.getKeyCode() == KeyEvent.VK_RIGHT )
                x += 10;
            if(e.getKeyCode()==KeyEvent.VK_F1)
                color=Color.BLUE;
            if(e.getKeyCode()==KeyEvent.VK_F2)
                color=Color.RED;
            if(e.getKeyCode()==KeyEvent.VK_F3)
                color=Color.GREEN;
            if(e.getKeyCode()==KeyEvent.VK_F4)
                color=Color.BLACK;





            repaint();
        }
    }

    public boolean isFocusable()
    {
        return true;
    }
}
