package ejecutar;

import java.awt.EventQueue;

import paginas.logeo;

public class inicio {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                logeo frame = new logeo();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

/**
 * @author Nicolay Chiazzaro
 *
 */
