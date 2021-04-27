package M8.Eventi;

import javax.swing.*;

/*
* se la classe listener non coincide con il frame,
*   devo istanziare un oggetto listener
 */

public class ProvaEventiDelega extends JFrame {
    MyListener listener=new MyListener();
    static JButton b ;

    public ProvaEventiDelega(){
        b = new JButton();
        b.addActionListener(listener);
    }
}
