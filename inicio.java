package proceso;

import java.awt.EventQueue;

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
