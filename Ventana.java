import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

import java.util.ArrayList;
import java.util.List;

public class Ventana extends JFrame implements ActionListener
{
    //Atributos
    JPanel panelA; //Atributo
    JTextField txt_id,txt_nombre;
    JLabel labelA;
    JButton btn_guardar;

    List<Persona> ejemploLista = new ArrayList<Persona>();
    int[] valores = new int[4];
    int tamañoestandar = 12;

    public Ventana()
    {
        setVentana();
        iniciarComponentes();
    }

    private void setVentana()
    {
        this.setSize(600,400);
        this.setTitle("Mi primer ventana");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.pink);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        //this.setJMenuBar(barra);
    }

    private void colocarPaneles()
    {
        panelA = new JPanel();
        panelA.setBackground(Color.white);
        panelA.setBounds(0,0,600,400);
        panelA.setLayout(null);
        this.getContentPane().add(panelA);
    }

    private void crearComponentes()
    {
        valores[0] = 5; //posicion x
        valores[1] = 5; //posicion y
        valores[2] = 150; //ancho
        valores[3] = 20; //alto

        labelA = MisComponentes.fncRegresaLabel("Nuevo Usuario",Color.blue,valores,15);
        panelA.add(labelA);

        valores[1] = valores[1] + valores[3] + 20; // posicion y

        panelA.add(MisComponentes.fncRegresaLabel("Número de Id",Color.blue,valores,tamañoestandar));
        valores[1] = valores[1] + valores[3] + 5; // posicion y

        txt_id = MisComponentes.crearText(valores);
        panelA.add(txt_id);
        valores[1] = valores[1] + valores[3] + 5; // posicion y

        panelA.add(MisComponentes.fncRegresaLabel("Nombre",Color.blue,valores,tamañoestandar));
        valores[1] = valores[1] + valores[3] + 5; // posicion y

        txt_nombre = MisComponentes.crearText(valores);
        panelA.add(txt_nombre);

        valores[1] = valores[1] + valores[3] + 5; // posicion y
        btn_guardar = MisComponentes.crearBoton("Guardar",valores,"Guarda");
        panelA.add(btn_guardar);
        btn_guardar.addActionListener(this);
    }


    private void iniciarComponentes()
    {
        colocarPaneles();
        crearComponentes();
    }

    public void guardarDatos()
    {
        int id = Integer.parseInt(txt_id.getText());
        String nombre = txt_nombre.getText();
        int contador = ejemploLista.size();
        ejemploLista.add(new Persona(id,nombre));
        int contadorNuevo = ejemploLista.size();

        if (contadorNuevo > contador)
        {
            JOptionPane.showMessageDialog(null, "Datos Guardados");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Algo estuvo mal,te corto los mano");
        }
    }

    @Override
    public void actionPerformed(ActionEvent ev)
    {
        String comando = ev.getActionCommand();
        if (comando.equals("Guarda"))
        {
            guardarDatos();
        }
    }
}