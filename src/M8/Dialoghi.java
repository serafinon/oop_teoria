package M8;

/*
*   i JDialog si possono costruire in due modi
*       1. specializzando JDialog (come per i JFrame)
*       2. automaticamente con delle classi helper (come JOptionPane)
*
 */

import javax.swing.*;

public class Dialoghi extends JFrame{

    private static final long serialersionUID = 1L;
    private JTextField io;

    public Dialoghi() {

        //esempi
        JOptionPane.showMessageDialog(this, "messaggio");

        JOptionPane.showMessageDialog(this, "messaggio", "titolo: Warning", JOptionPane.WARNING_MESSAGE);


        int ris = JOptionPane.showConfirmDialog(this, "Domanda?", "titolo", JOptionPane.YES_NO_OPTION);

        Object[] options = {"Si cazzo", "Ma no"};
        int ris1 = JOptionPane.showOptionDialog(this, "Domanda?", "titolo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);


        //selettore di un file
        JFileChooser open = new JFileChooser();
        int option = open.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            //fai cose col file
        }
    }

    public static void main(String[] args){
            Dialoghi frame = new Dialoghi();

            JOptionPane.showMessageDialog(frame, "messaggio");
    }

}
