import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoMenuBar extends MenuBar {

    InfoMenuBar()
    {

        add(new FeatureMenu());
    }



    class FeatureMenu extends Menu
    {
        FeatureMenu()
        {
            setLabel("фичи/чё тут делать");
            MenuItem menuItem = new MenuItem("узнать");
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("imgay");
                    new HelpFrame("okoshko2");

                }
            });
            add(menuItem);
        }
    }
}
