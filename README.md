### IMPORTANTE

Hola! Lo que va el proyecto de **Login** es que, compartiré como hice un programa para Iniciar sesión con el código **Java**. Aviso que el código tanto como el proyecto se van a ir avanzando con el tiempo, lo mismo, que encontrar formas mas optimizables e efectivas a la hora de crear un código. Espero que con el programa que estoy creando te sea de ayuda, cualquier duda/pregunta que tengas podes hacerlo en mi Instagram **@uy.elnico**

![image](https://github.com/uyelnico/Login/assets/145890121/f5fe4947-89d2-40a1-8ff9-93c85962355a)

## Inicio de Sesión

![image](https://github.com/uyelnico/Login/assets/145890121/0cb90b0c-fd64-4848-8116-d4c83686a7cb)
![image](https://github.com/uyelnico/Login/assets/145890121/47bed11f-5ae8-4b4d-a6ae-144e989bb894)

## Guía para Descargar WindowsBuilder

# ¿Qué es WindowsBuilder?

WindowsBuilder es una herramienta de desarrollo de GUI para **Java** que simplificaba la creación de interfaces de usuario visualmente en el entorno Eclipse.

# Proceso para Descargarlo

`Help > Eclipse Marketplace > Find: "WindowsBuilder" > Install > Finish`

![image](https://github.com/uyelnico/Login/assets/145890121/08dd4836-410b-4e45-b14a-df6de8934fce)
![image](https://github.com/uyelnico/Login/assets/145890121/d6b36784-95d9-43ff-ab33-a058a9ece1b3)
![image](https://github.com/uyelnico/Login/assets/145890121/29b30bec-b2bf-4103-ad56-71329f9719c4)
![image](https://github.com/uyelnico/Login/assets/145890121/21fce782-7b75-498c-ad48-a331239db5ff)
![image](https://github.com/uyelnico/Login/assets/145890121/955e27ab-f4b2-4db5-9f27-c38b46475b65)

## Package

```Java
package proceso;
```

## Import

```java
import java.awt.EventQueue; // Es una clase que proporciona un mecanismo para encolar eventos y ejecutar tareas en el hilo de despacho de eventos (Event Dispatch Thread, EDT) de Java Swing. El EDT es responsable de manejar eventos de interfaz de usuario en aplicaciones gráficas. Importar esta clase permite trabajar con eventos y tareas de manera segura en el contexto de una aplicación gráfica.
import javax.swing.*; // Es un paquete que contiene clases y componentes para construir interfaces gráficas de usuario (GUI) en Java. Importar javax.swing.* permite acceder a todas las clases y componentes de Swing, lo que facilita la creación de interfaces gráficas en una aplicación.
import javax.swing.border.CompoundBorder; // Es una clase que representa un borde compuesto que puede combinar varios bordes simples en un solo borde para decorar componentes Swing. Importar esta clase permite utilizar bordes compuestos en elementos de la interfaz gráfica para mejorar su apariencia.
import javax.swing.border.EmptyBorder; // Es una clase que representa un borde vacío sin ningún espacio o decoración. Se utiliza para establecer márgenes en componentes Swing. Importar esta clase permite definir márgenes vacíos en los componentes.

import java.awt.*; //  Es un paquete que proporciona clases y componentes básicos para crear interfaces gráficas de usuario en Java. Incluye clases para trabajar con gráficos, eventos y ventanas. Importar java.awt.* permite acceder a estas clases y componentes
import java.awt.event.ActionEvent; // Es una clase que representa un evento de acción, como un clic de botón, en una interfaz gráfica de usuario. Importar esta clase permite manejar eventos de acción generados por componentes de la interfaz.
import java.awt.event.ActionListener; // Es una interfaz que se utiliza para escuchar eventos de acción generados por componentes gráficos, como botones. Importar esta interfaz permite implementar oyentes de eventos de acción para responder a interacciones del usuario.

import static proceso.datos.*; // Esta línea importa elementos estáticos (métodos o campos estáticos) del paquete o clase llamada proceso.datos. El uso de static significa que no es necesario crear una instancia de la clase proceso.datos para acceder a estos elementos, se pueden utilizar directamente. El contenido específico de esta importación depende de lo que esté definido en el paquete o clase proceso.datos.
```

## datos.java

Dfine una clase llamada "datos" que contiene constantes estáticas utilizadas para establecer valores predeterminados.

```java
public class datos {

	public static final String USUARIO_ESTABLECIDO = "Nicolay";
	public static final String CONTRASEÑA_ESTABLECIDA = "contraseña123";
	
	public static final String CEDULA_ESTABLECIDA = "XXXXXXXX";
	public static final String NACIONALIDAD_ESTABLECIDA = "Uruguaya"; 
	
	public static final String FOTO_PERFIL = "";
}
```
## inicio.java

Iniciar la aplicación y mostrar una ventana de inicio de sesión. Cualquier error que ocurra durante este proceso se registra en la consola para su posterior análisis. Este patrón es común en aplicaciones **Swing**, donde se debe garantizar que las operaciones de interfaz de usuario se realicen en el hilo de despacho de eventos.

```java
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
```
## logeo.java

una ventana de inicio de sesión con validación de usuario y contraseña. Cuando el usuario presiona el botón "Entrar" con datos válidos, la ventana de inicio de sesión se cierra y se abre una ventana de menú.

```
La clase logeo extiende JFrame, lo que la convierte en una ventana de la interfaz gráfica.
En el constructor de logeo, se inicializan la ventana (Ventana()), el panel (Panel()), y los componentes de la interfaz (Componentes()).
El método Ventana() configura propiedades de la ventana, como su tamaño y comportamiento de cierre.
El método Panel() crea un panel principal para la ventana y lo configura para usar un diseño nulo (null layout).
El método Componentes() crea componentes de interfaz gráfica, incluyendo etiquetas, campos de texto, un campo de contraseña y un botón de entrada.
El botón "Entrar" tiene un oyente de acción que valida el nombre de usuario y la contraseña ingresados. Si los datos son correctos, la ventana de inicio de sesión se cierra y se abre una nueva ventana de menú.
La clase main contiene el punto de entrada de la aplicación, que crea una instancia de la clase logeo y la hace visible en la pantalla.
```

```java
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
```

## menu.java

Una ventana de menú que muestra un mensaje de bienvenida con el nombre de usuario y un botón para ver el perfil. Cuando se presiona el botón, se abre una ventana de perfil.

```
La clase menu extiende JFrame, lo que la convierte en una ventana de la interfaz gráfica.
En el constructor de menu, se inicializan propiedades de la ventana, como su tamaño, comportamiento de cierre y se crea un panel.
El método EtiquetaBienvenida() crea una etiqueta que muestra un mensaje de bienvenida, incluyendo el nombre de usuario almacenado en la constante USUARIO_ESTABLECIDO.
El método BotonVerPerfil() crea un botón llamado "Ver Perfil" que, cuando se presiona, cierra la ventana actual (dispose()) y abre una nueva ventana de perfil (perfil) que muestra el perfil del usuario.
```

```java
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
```

## perfil.java

Una ventana de perfil que muestra información del usuario, incluyendo una foto de perfil, cédula, nombre de usuario y nacionalidad. También proporciona un botón para volver a la ventana de menú principal.

```
La clase perfil extiende JFrame, lo que la convierte en una ventana de la interfaz gráfica.
En el constructor de perfil, se inicializan propiedades de la ventana, como su tamaño, comportamiento de cierre y se crea un panel.
El método BotonFotoPerfil() crea un botón que muestra una foto de perfil, que se asume que está representada por un icono cargado desde la constante FOTO_PERFIL.
El método PanelInfo() crea un panel que muestra información de perfil, incluyendo cédula, nombre de usuario y nacionalidad. Estos datos se obtienen de las constantes CEDULA_ESTABLECIDA, USUARIO_ESTABLECIDO y NACIONALIDAD_ESTABLECIDA.
El método Etiqueta() es una función auxiliar que crea etiquetas con texto, posición, ancho y alto específicos.
El método BotonVolverAlInicio() crea un botón que permite al usuario volver a la ventana de menú (menu) y cierra la ventana de perfil.
```

```java
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
```

`Author: Nicolay_Chiazzaro`
