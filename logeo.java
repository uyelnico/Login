package proceso;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static proceso.datos.*;

public class logeo extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel Panel;
    private JPasswordField Contraseña;

    public logeo() {
        Ventana();
        Panel();
        Componentes();
    }

    private void Ventana() {
        setAlwaysOnTop(true);
        setForeground(Color.LIGHT_GRAY);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        setBackground(Color.LIGHT_GRAY);
        setType(Type.UTILITY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 420, 326);
    }

    private void Panel() {
        Panel = new JPanel();
        Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(Panel);
        Panel.setLayout(null);
    }

    private void Componentes() {
 
    	    JLabel Logearse = new JLabel("Inicia Sesion");
    	    Logearse.setFont(new Font("Sylfaen", Font.PLAIN, 20));
    	    Logearse.setHorizontalTextPosition(SwingConstants.CENTER);
    	    Logearse.setHorizontalAlignment(SwingConstants.CENTER);
    	    Logearse.setSize(new Dimension(6, 12));
    	    Logearse.setBounds(117, 11, 157, 38);
    	    Panel.add(Logearse);

    	    JPanel panelDatos = new JPanel();
    	    panelDatos.setBackground(Color.LIGHT_GRAY);
    	    panelDatos.setBounds(10, 60, 384, 118);
    	    Panel.add(panelDatos);
    	    panelDatos.setLayout(null);

    	    JLabel MensajeUsuario = new JLabel("Usuario\r\n");
    	    MensajeUsuario.setHorizontalTextPosition(SwingConstants.CENTER);
    	    MensajeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
    	    MensajeUsuario.setFont(new Font("Sylfaen", Font.PLAIN, 15));
    	    MensajeUsuario.setBounds(162, 11, 47, 26);
    	    panelDatos.add(MensajeUsuario);

    	    JLabel MensajeContraseña = new JLabel("Contraseña");
    	    MensajeContraseña.setHorizontalTextPosition(SwingConstants.CENTER);
    	    MensajeContraseña.setHorizontalAlignment(SwingConstants.CENTER);
    	    MensajeContraseña.setFont(new Font("Sylfaen", Font.PLAIN, 15));
    	    MensajeContraseña.setBounds(142, 55, 87, 21);
    	    panelDatos.add(MensajeContraseña);

    	    Contraseña = new JPasswordField();
    	    Contraseña.setBounds(142, 70, 87, 20);
    	    panelDatos.add(Contraseña);

    	    JFormattedTextField Usuario = new JFormattedTextField();
    	    Usuario.setBounds(142, 30, 87, 20);
    	    panelDatos.add(Usuario);

    	    JLabel MensajeVerificador = new JLabel("");
    	    MensajeVerificador.setFont(new Font("Tahoma", Font.PLAIN, 10));
    	    MensajeVerificador.setName("");
    	    MensajeVerificador.setForeground(new Color(255, 0, 0));
    	    MensajeVerificador.setBounds(59, 101, 259, 14);
    	    panelDatos.add(MensajeVerificador);

    	    JLabel MensajeVerificadorUsuario = new JLabel("");
    	    MensajeVerificadorUsuario.setFont(new Font("Tahoma", Font.PLAIN, 10));
    	    MensajeVerificadorUsuario.setName("");
    	    MensajeVerificadorUsuario.setForeground(Color.RED);
    	    MensajeVerificadorUsuario.setBounds(10, 30, 253, 14);
    	    panelDatos.add(MensajeVerificadorUsuario);

    	    JLabel MensajeVerificadorContraseña = new JLabel("");
    	    MensajeVerificadorContraseña.setFont(new Font("Tahoma", Font.PLAIN, 10));
    	    MensajeVerificadorContraseña.setName("");
    	    MensajeVerificadorContraseña.setForeground(Color.RED);
    	    MensajeVerificadorContraseña.setBounds(4, 70, 259, 14);
    	    panelDatos.add(MensajeVerificadorContraseña);
    	
        JButton Entrar = new JButton("Entrar");
        Entrar.setSelected(true);
        Entrar.setBorder(new CompoundBorder());
        Entrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Entrar) {
                char[] clave = Contraseña.getPassword();
                String claveFinal = new String(clave);
                String nombreUsuario = Usuario.getText();

                if (nombreUsuario.isEmpty() || claveFinal.isEmpty()) {
                    MensajeVerificador.setText("Por favor, ingrese nombre de usuario y contraseña.");
                } else {
                    MensajeVerificador.setText("");
                }

                if (!nombreUsuario.equals(USUARIO_ESTABLECIDO)) {
                    MensajeVerificadorUsuario.setText("El Nombre es Incorrecto");
                } else {
                    MensajeVerificadorUsuario.setText("");
                }

                if (!claveFinal.equals(CONTRASEÑA_ESTABLECIDA)) {
                    MensajeVerificadorContraseña.setText("La Contraseña es Incorrecta");
                } else {
                    MensajeVerificadorContraseña.setText("");
                }

                if (nombreUsuario.equals(USUARIO_ESTABLECIDO) && claveFinal.equals(CONTRASEÑA_ESTABLECIDA)) {
                    dispose();
                    menu Menu = new menu();
                    Menu.setVisible(true);
                }
            }
        });
        Entrar.setBounds(150, 201, 100, 31);
        Panel.add(Entrar);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    logeo Logeo = new logeo();
                    Logeo.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

/**
 * @author Nicolay Chiazzaro
 *
 */
