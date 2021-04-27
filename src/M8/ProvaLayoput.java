package M8;
/*
 *   LAYOUT:
 *
 *   è necessario avere un layout dinamico per avere un'app multi-platform
 *
 *   in swing c'è un layout manager che modifica lo stile e la posizione dei diversi pannelli
 *   ci sono diversi layoutmanager che impostano politiche diverse (FlowLayout, BorderLayout)
 *
 *       FlowLayout è quella di default, mette i componenti a capo, allineando a destra, sx o al centro
 *           FlowLayout f = new FlowLayout();
 *           FlowLayout f = new FlowLayout(int align);  //align = {FlowLayout.LEFT, FlowLayout.RIGHT, FlowLayout.CENTER}
 *           FlowLayout f = new FlowLayout(int align, int horizGapPixels, int vertGapPixels);
 *
 *       BorderLayout è diviso in 5 diverse aree (3 parti in verticale, di cui quella centrale è divisa in 3 parti in orizzontale)
 *           BordelLayout b = new BorderLayout();
 *           BordelLayout b = new BorderLayout(int horizGapPixels, int vertGapPixels);
 *       quando si costruisce il JPanel bisogna specificare in che area del BorderLayout inserirlo
 *               JPanel p = new JPanel( new BorderLayout() );
 *               p.add( BorderLayout.PAGE.PAGE_START, new JButton() );
 *               p.add( BorderLayout.PAGE.PAGE_END, new JButton() );
 *
 *       GridLayout ti fa definire in quante righe e colonne dividere il layout
 *           GridLayout g = (int nrows, int ncols);
 *           GridLayout g = (int nrows, int ncols, int horizGapPixels, int vertGapPixels);
 *
 *       GridBagLayout ti fa specificare tabelle più complesse (es.cambiare il numero di colonne per ogni riga)
 *       con dei constraints
 *           JPanel p = new JPanel(new GridBagLayout() );
 *           GridBagConstraints c = new GridBagConstraints();
 *           p.add(new JButton() , c );
 *
 *       CardLayout è un layout variabile, dinamico
 *           JPanel p = new JPanel(new CardLayout() );
 *           p.add("Panel1", new JPanel() );
 *           p.add("Panel2", new JPanel() );
 *           //successivamente sceglierò se visualizzare Panel1 o Panel2
 *
 */

import javax.swing.*;
import java.awt.*;

public class ProvaLayoput extends JFrame {

    private static final long serialersionUID = 1L;
    private JButton b, bb;
    private JTextField io;

    public ProvaLayoput(){

        super("Questo è il titolo!");
        io= new JTextField("miao");
        b=new JButton("gatto!");
        bb=new JButton("cane!");

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

        //chiedo alla coda degli eventi dell'ambiente grafico di invocare il metodo run() di un oggetto Runnable
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ProvaLayoput frame = new ProvaLayoput();
            }
        });
    }

}
