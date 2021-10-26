package Codigo;

//FONDO DE INICIO
//IMPORTANDO LIBRERIAS PARA EL FONDO 
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author Manucho
 */
public class Fondo3 extends JPanel {
    private Image imagenc = null;
    private MediaTracker tracker;
    
    public Fondo3(Component componente){
        try {
            tracker = new MediaTracker(componente);
            Toolkit hr = Toolkit.getDefaultToolkit();
            imagenc = hr.getImage(getClass().getResource("/FONDOS/teoremas_1.jpg"));
            tracker.addImage(imagenc, 1);
            tracker.waitForAll();
        } 
        catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.drawImage(imagenc,0,0,this.getSize().width, this.getSize().height,null);
    }
}
