import javax.swing.*;
import java.awt.*;
public class MisComponentes
{
    private static JLabel genericoLabel;
    private static JButton genericoBoton;
    private static JTextField genericoText;


    //public static JLabel fncRegresaLabel(String p_nombre,int[] p_posicion, Color p_color )
    public static JLabel fncRegresaLabel(String p_nombre,Color p_color, int[] p_posicion,int p_tamaño )
    {
        genericoLabel = new JLabel(p_nombre);
        genericoLabel.setBounds(p_posicion[0],p_posicion[1],p_posicion[2],p_posicion[3]);
        //genericoLabel.setBackground(p_color);
        Font formato = new Font("arial",Font.BOLD,p_tamaño);
        genericoLabel.setFont(formato);
        return genericoLabel;
    }

    public static JButton crearBoton(String p_nombre, int[] p_posicion, String p_comando)
    {
        genericoBoton = new JButton(p_nombre);
        genericoBoton.setBounds(p_posicion[0],p_posicion[1],p_posicion[2],p_posicion[3]);
        genericoBoton.setActionCommand(p_comando);
        return genericoBoton;
    }

    public static JTextField crearText(int[] p_posicion)
    {
        genericoText = new JTextField();
        genericoText.setBounds(p_posicion[0],p_posicion[1],p_posicion[2],p_posicion[3]);
        return genericoText;
    }
}
