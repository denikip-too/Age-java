
package howoldareyou;

import static javax.swing.JOptionPane.*;

public class HowOldAreYou {

    public static void main(String[] args) {
        String prompt= "How old are you?";
        String age=showInputDialog(prompt);
        String output= "You are " +age+ " Years old.";
        showMessageDialog( null, output);
    }

    
}
