import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JLIST {
    String[] listEntries = {"alpha", "beta", "gamma", "delta",
            "epsilon", "zeta", "eta", "theta "};
    list = new JList(listEntries);


    JList(listEntries);

    JScrollPane scroller = new JScrollPane ( list );
    scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    panel.add(scroller);

    list.setVisibleRowCount(4);
    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    list.addListSelectionListener(this);

    public void valueChanged(ListSelectionEvent lse)
    if(!lse.getValueIsAdjusting())

    {
        String selection = (String) list.getSelectedValue ();
        System.out.println (selection);
    }
}





