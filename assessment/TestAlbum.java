package assessment;

import javax.swing.JOptionPane;
import java.awt.*;
public class TestAlbum {

    TextArea textarea = new TextArea();
    Font font = new Font("monospaced");

    Song[] trackNo1 = new Song[0];
    Song[] trackNo2 = new Song("Living on a Prayer","Bon Jovi","Rock",184,1985);
    Song[] trackNo3 = new Song("Blue Suede Shoes","Elvis Presley","Pop",156,1963);
    Song[] trackNo4 = new Song("Someone Like you","Adele","Pop",184,2013);
    Song[] trackNo5 = new Song("House Of Fun","Madness","Pop",178,178);

    Album album = new Album("Now that's what i call music",Song[].tracks,);

    JOptionPane.showInputDialog("Input" ,"Which track number",JOptionPane.INFORMATION_DIALOG);


    JOptionPane.showMessageDialog(null,getTrackNumber,"Playing Track",JOptionPane.INFORMATION_MESSAGE);

    getShuffle(tracknumber);

}
