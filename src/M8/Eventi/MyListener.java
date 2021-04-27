package M8.Eventi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ProvaEventiDelega.b){ // in realtà se solo b chiama questo listener, si può omettere l'if

        }
    }
}
