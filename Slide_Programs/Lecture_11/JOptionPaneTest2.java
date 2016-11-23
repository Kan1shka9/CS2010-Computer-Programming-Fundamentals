package CS2010.Lecture_11;

// http://www.leepoint.net/GUI/containers/20dialogs/10joptionpane-2.html

import javax.swing.JOptionPane;

public class JOptionPaneTest2 {
    public static void main(String[] args) {
        //... Text to put on the buttons.
        String[] choices = {"Democratic", "Republican", "None of your business", "Quit"};
        
        //... Variables to keep track of the counts.
        int democraticCount = 0;
        int republicanCount = 0;
        int noAnswerCount   = 0;
        
        //... "Infinite" loop, terminated by call to System.exit(0)
        while (true) {
            int response = JOptionPane.showOptionDialog(
                               null                       // Center in window.
                             , "How did you vote?"        // Message
                             , "Party Poll"               // Title in titlebar
                             , JOptionPane.YES_NO_OPTION  // Option type
                             , JOptionPane.PLAIN_MESSAGE  // messageType
                             , null                       // Icon (none)
                             , choices                    // Button text as above.
                             , "None of your business"    // Default button's label
                           );
            
            //... Use a switch statement to check which button was clicked.
            switch (response) {
                case 0: 
                    democraticCount++;
                    break;
                case 1:
                    republicanCount++;
                    break;
                case 2:
                    noAnswerCount++;
                    break;
                case 3:
                case -1:
                    //... Both the quit button (3) and the close box(-1) handled here.
                    System.exit(0);     // It would be better to exit loop, but...
                default:
                    //... If we get here, something is wrong.  Defensive programming.
                    JOptionPane.showMessageDialog(null, "Unexpected response " + response);
            }
            
            //... Display the accumulated results so far.
            JOptionPane.showMessageDialog(null, "Response = " + response
                                              + "\nDem = " + democraticCount
                                              + "\nRep = " + republicanCount
                                              + "\nOther = " + noAnswerCount);
        } 
    }
}