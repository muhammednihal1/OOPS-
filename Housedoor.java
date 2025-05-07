import java.awt.*;
import java.awt.event.*;

public class Housedoor extends Frame implements MouseListener {
Color br = new Color(0, 0, 255);
public Housedoor() {
addMouseListener(this);
addWindowListener(new MyWindowAdapter());
}
public void mouseClicked(MouseEvent e) {
br = new Color(255, 0, 0);
repaint();
}
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
public void mousePressed(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
public void paint(Graphics g) {
g.setColor(Color.green);
int[] x = {100, 160, 220};
int[] y = {150, 80, 150};
g.fillPolygon(x, y, 3);
g.setColor(Color.yellow);
g.fillRect(100, 150, 120, 100);
g.setColor(br);
g.fillRect(145, 190, 30, 60);
}
public static void main(String[] args) {
Housedoor appwin = new Housedoor();
appwin.setSize(new Dimension(500, 500));
appwin.setTitle("Housedoor");
appwin.setVisible(true);
}
}

class MyWindowAdapter extends WindowAdapter {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
}

