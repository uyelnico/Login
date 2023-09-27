package paginas;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import static info.datos.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel Panel;

    public menu() {
        setAlwaysOnTop(true);
        setType(Type.UTILITY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 806, 300);
        Panel = new JPanel();
        Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(Panel);
        Panel.setLayout(null);

        EtiquetaBienvenida();
        BotonVerPerfil();
    }

    private void EtiquetaBienvenida() {
        JLabel lblNewLabel = new JLabel("Bienvenido " + USUARIO_ESTABLECIDO);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel.setBounds(276, 11, 217, 35);
        Panel.add(lblNewLabel);
    }

    private void BotonVerPerfil() {
        JButton VerPerfil = new JButton("Ver Perfil");
        VerPerfil.setVerticalAlignment(SwingConstants.TOP);
        VerPerfil.setBounds(10, 227, 89, 23);
        VerPerfil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent VerPerfil) {
                dispose();
                perfil Perfil = new perfil();
                Perfil.setVisible(true);
            }
        });
        Panel.add(VerPerfil);
    }
}

/**
 * @author Nicolay Chiazzaro
 *
 */
