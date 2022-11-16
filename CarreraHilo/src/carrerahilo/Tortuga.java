package carrerahilo;

import java.awt.Point;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author Ana Salas
 */
public class Tortuga extends Thread {

    static JProgressBar barra;
    int velocidad;
    JPanel x;

    public Tortuga(JProgressBar barra, int vel, JPanel tortuDesplaza) {
        this.barra = barra;
        this.velocidad = vel;
        this.x = tortuDesplaza;
    }

    public synchronized void run() {
        Point position = new Point(-100, (int) (x.getLocation().getY()));
        x.setLocation(position);
        while (barra.getValue() < barra.getMaximum()) {
            barra.setValue(barra.getValue() + 1);
            if (position.getX() < 765) {
                position = new Point(barra.getValue() * 8, (int) (x.getLocation().getY()));
                x.setLocation(position);
            }
            try {
                sleep(velocidad);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            ganador();
        }
    }

    static void ganador() {
        if (barra.getValue() == barra.getMaximum()) {
            JOptionPane.showMessageDialog(null, "La tortuga ganó",
                    "Ganador", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
