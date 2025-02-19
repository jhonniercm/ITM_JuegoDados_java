import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class FrmJuego extends JFrame {

    public FrmJuego (){
        setSize(500,300);
        setTitle("Juguemos a los dados");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    
        setLayout(null);

        JLabel lblDado1 = new JLabel();
        String nombreImagen= "/imagenes/1.jpg";
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreImagen));
        lblDado1.setIcon(imagen);
        
        lblDado1.setBounds(10,10,imagen.getIconWidth(),imagen.getIconHeight());
        getContentPane().add(lblDado1);

        JLabel lblDado2 = new JLabel();
        lblDado2.setIcon(imagen);
        lblDado2.setBounds(10 + imagen.getIconWidth(), 10, imagen.getIconWidth(), imagen.getIconHeight());
        getContentPane().add(lblDado2);

        JLabel lblTitulo1 = new JLabel("LANZAMIENTOS");
        lblTitulo1.setBounds(50 + 2 * imagen.getIconWidth(), 10, 100,25);
        lblTitulo1.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(lblTitulo1);

        JLabel lblTitulo2 = new JLabel("CENAS");
        lblTitulo2.setBounds(160 + 2 * imagen.getIconWidth(), 10, 100,25);
        lblTitulo2.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(lblTitulo2);

        JLabel lblLanzamientos = new JLabel();
        lblLanzamientos.setBounds(50 + 2 * imagen.getIconWidth(), 40, 100,100);
        
        lblLanzamientos.setBackground(new Color(0,0,0));
        lblLanzamientos.setForeground(new Color(51, 255, 0));
        lblLanzamientos.setFont(new Font("Tahoma",1,72));
        lblLanzamientos.setText("0");
        lblLanzamientos.setHorizontalAlignment(SwingConstants.RIGHT);
        lblLanzamientos.setOpaque(true);
        getContentPane().add(lblLanzamientos);

        JLabel lblCenas = new JLabel();
        lblCenas.setBounds(160 + 2 * imagen.getIconWidth(), 40, 100,100);
        
        lblCenas.setBackground(new Color(0,0,0));
        lblCenas.setForeground(new Color(51, 255, 0));
        lblCenas.setFont(new Font("Tahoma",1,72));
        lblCenas.setText("0");
        lblCenas.setHorizontalAlignment(SwingConstants.RIGHT);
        lblCenas.setOpaque(true);
        getContentPane().add(lblCenas);

        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setBounds(10,15 + imagen.getIconHeight(),100,25);
        getContentPane().add(btnIniciar);

        JButton btnLanzar = new JButton("Lanzar");
        btnLanzar.setBounds(10,45 + imagen.getIconHeight(),100,25);
        getContentPane().add(btnLanzar);

        

    
    
    
    
    
    
    
    
    }
}
