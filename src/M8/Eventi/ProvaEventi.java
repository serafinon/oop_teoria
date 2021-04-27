package M8.Eventi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
*   gli eventi sono oggetti
*
*   gli eventi possono essere MouseEvent, KeyEvent, ActionEvent, WindowEvent, ecc.
*
*   per verificare gli eventi, uso dei Listeners, che sono classi che implementano interfacce per il meccanismo di callback
*       (es. implements MouseListener o KeyListener o ActionListener)
*   per verificare eventi di interazione con componenti del frame (ActionEvents) devo
*       component.addActionListener(Object) che ha per parametro un'istanza di una classe listener che implementa ActionListener
*
*   quando un evento si verifica, il theread degli eventi invoca i Listeners passando l'evento come parametro
*       listener.actionPerformed(evento)
*
*   il listener può essere la stessa classe frame o un'altra classe fatta ad hoc (delega)
*   all'interno della classe frame-listener potrei definire l'azione dentro il metodo addActionListener del component
*       component.addActionListener(new ActionListener(){
*           @Override
*           public void actionPerformed(ActionEvent e){
*               //do qualcosa
*           }
*       });
*
 */


//uso la stessa classe JFrame come listener
public class ProvaEventi extends JFrame implements ActionListener{

    private static final long serialersionUID = 1L;
    private JButton b, bb;
    private JTextField io;

    public ProvaEventi(){
        super("Questo è il titolo!");

        io= new JTextField("miao");

        b=new JButton("gatto!");
        b.addActionListener( this); //il listener è la finestra stessa

        bb=new JButton("cane!");
        bb.addActionListener( this);


        //creo diversi panel con diversi layout
        JPanel p1= new JPanel(new FlowLayout(FlowLayout.CENTER));
        p1.add(io);
        p1.add(new JLabel("è il verso del..."));

        JPanel p2 = new JPanel(new GridLayout(1,2));
        p2.add(b);
        p2.add(bb);

        JPanel p3 = new JPanel(new BorderLayout());
        p3.add(BorderLayout.CENTER, p1);
        p3.add(BorderLayout.SOUTH, p2);


        //creo il menu
        JMenuItem openFile = new JMenuItem("Open");
        JMenuItem closeFile= new JMenuItem("Close");

        JMenu file = new JMenu("File");
        file.add(openFile);
        file.add(closeFile);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(file);
        setJMenuBar(menuBar);


        //ora setto p1 come pannello principale del frame
        setContentPane(p3);

        //imposto cosa fare quando si preme la "X" della GUI
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setSize(350,150);
        setVisible(true);
    }

    public static void main(String[] args){
        new ProvaEventi();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //this fa da listener per entrambi gli eventi (entrambi i pulsanti)
        if(e.getSource() == b){
            String text = io.getText();
            if(text.equals("miao"))
                JOptionPane.showMessageDialog(this, "Si! Il gatto fa miao");
            else
                JOptionPane.showMessageDialog(this, "Ma NOOO! non fa \""+text+"\" il gatto");
        }

        if(e.getSource() == bb){
            String text = io.getText();
            if(text.equals("bau"))
                JOptionPane.showMessageDialog(this, "Si! Il cane fa bau");
            else
                JOptionPane.showMessageDialog(this, "Ma NOOO! non fa "+text+" il cane");
        }

    }
}
