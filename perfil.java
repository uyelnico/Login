public class perfil extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel Panel;

    public perfil() {
        setType(Type.UTILITY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 599, 247);
        Panel = new JPanel();
        Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(Panel);
        Panel.setLayout(null);

        BotonFotoPerfil();
        PanelInfo();
        BotonVolverAlInicio();
    }

    private void BotonFotoPerfil() {
        JButton FotoPerfil = new JButton("");
        FotoPerfil.setIcon(new ImageIcon(FOTO_PERFIL));
        FotoPerfil.setBounds(10, 11, 177, 162);
        Panel.add(FotoPerfil);
    }

    private void PanelInfo() {
        JPanel PanelInfo = new JPanel();
        PanelInfo.setBackground(new Color(192, 192, 192));
        PanelInfo.setBounds(197, 11, 376, 186);
        Panel.add(PanelInfo);
        PanelInfo.setLayout(null);

        JLabel MensajeCedula = Etiqueta("Cedula:", 10, 67, 86, 34);
        JLabel Cedula = Etiqueta(CEDULA_ESTABLECIDA, 10, 100, 98, 14);
        JLabel NombreDeUsuario = Etiqueta("Nombre de Usuario:", 10, 11, 192, 34);
        JLabel Nombre = Etiqueta(USUARIO_ESTABLECIDO, 10, 35, 169, 29);
        JLabel MensajeNacionalidad = Etiqueta("Nacionalidad:", 10, 110, 169, 34);
        JLabel Nacionalidad = Etiqueta(NACIONALIDAD_ESTABLECIDA, 10, 140, 98, 14);

        PanelInfo.add(MensajeCedula);
        PanelInfo.add(Cedula);
        PanelInfo.add(NombreDeUsuario);
        PanelInfo.add(Nombre);
        PanelInfo.add(MensajeNacionalidad);
        PanelInfo.add(Nacionalidad);
    }

    private JLabel Etiqueta(String texto, int x, int y, int ancho, int alto) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setFont(new Font("Tahoma", Font.PLAIN, 18));
        etiqueta.setBounds(x, y, ancho, alto);
        return etiqueta;
    }

    private void BotonVolverAlInicio() {
        JToggleButton VolverAlInicio = new JToggleButton("Volver a Inicio");
        VolverAlInicio.setBounds(32, 184, 121, 23);
        VolverAlInicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent VolverAlInicio) {
                dispose();
                menu Menu = new menu();
                Menu.setVisible(true);
            }
        });
        Panel.add(VolverAlInicio);
    }
}

/**
 * @author Nicolay Chiazzaro
 *
 */
