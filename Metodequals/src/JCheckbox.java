import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JCheckbox {
    JCheckBox check = new JCheckBox ( "Goes to 11" );
    check.itemStateChanged(this);


    public void itemStateChanged(ItemEvent ev) {
        String onOrOff = "off";
        if (check.isSelected ()) onOrOff = "on";
        System.out.println ( "Check box is " + onOrOff );

    }
check.setSelected(true);
check.setSelected(false);

}



