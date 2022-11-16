package carrerahilo;

import java.awt.Point;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author Ana Salas
 */
public class Liebre extends Thread {

    static JProgressBar barra;
    int velocidad;
    boolean azar = true;
    int posDormir = 0;
    JPanel x;

    public Liebre(JProgressBar barra, int vel, JPanel liebDesplaza) {
        this.barra = barra;
        this.velocidad = vel;
        this.x = liebDesplaza;
    }

    public synchronized void run() {
        Point position = new Point(-100, (int) (x.getLocation().getY()));
        x.setLocation(position);
        while (barra.getValue() < barra.getMaximum()) {
            if(azar){
                posDormir=(int)(Math.random()*15+barra.getValue()+10);
                azar=false;
            }
            if(posDormir!=barra.getValue()){
                barra.setValue(barra.getValue()+1);
                if(position.getX()<765){
                    position=new Point(barra.getValue()*8,(int)(x.getLocation().getY()));
                    x.setLocation(position);
                }
                try{
                    sleep(velocidad);
                    
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }else{
                System.out.println("La liebre se olvido de la carrera en la posicion "+barra.getValue());
                try{
                    sleep(velocidad+1000);
                }catch(InterruptedException ex){
                     ex.printStackTrace();                    
                }
            }
        }
    }
}
