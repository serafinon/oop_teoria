package M8;


/*
*   SOFTWARE DESIGN
*
*   per una grande app devo organizzare i package per
*       Graphical Interface (interfacce testuali o GUIs) , Domain Classes, e Data Access (classi per op. sui db)
*
*       ATTENZIONE: le classi del dominio NON devono riferirsi a classi dell'interfaccia grafica o dell'accesso ai dati
*                       in modo da non dover modificare le classi del dominio per future modifiche
*
 */

/*
*   come GUI vediamo Swing (non java.awt che è vecchio)
*       swing è un'estensione di awt, contiene gli stessi componenti
*
*   la GUI è formata da Containers e Components
*       uno o più Component sono attaccati da un Container.
*           i Component sono bottoni, etichette di testo, ecc.
*       un Container contiene i Component e/o altri Container
*           il Container padre di tutti è il frame (top-level container)
*           i Container possono essere JFrame (lo è il top level container) o JDialog, o JPanel, ecc.
*
*   l'unico componente che non si attacca a un panel è la MenuBar
*       si utilizza un metodo speciale per settarla.
*       è composta da una JMenuBar a cui sono attaccati i JMenu, e per ogni JMenu ho più JMenuItem
 */

import javax.swing.*;
import java.awt.*;

public class SWiiiing extends JFrame{
    /*
    *   definisco come attributi i componenti dinamici
    *        (es. i bottoni per controllare se vengono premuti, o una casella per l'inserimento del testo)
    *
    *   i componenti statici invece li definisco all'interno del costruttore
    *
    *   le interfacce grafiche si costruiscono nel costruttore della classe che estende JFrame
    */

    private static final long serialersionUID = 1L;
    private JButton b, bb;
    private JTextField io;

    public SWiiiing(){
        super("Questo è il titolo!");
        io= new JTextField("miao");
        b=new JButton("gatto!");
        bb=new JButton("cane!");

        //ora attacco i component al Container p1
        JPanel p1= new JPanel();
        p1.add(io);
        p1.add(new JLabel("è il verso del..."));
        p1.add(b);
        p1.add(bb);


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
        setContentPane(p1);

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
                new SWiiiing();
            }
        });

        //oppure semplicemente new SWiiiing();
    }
}
