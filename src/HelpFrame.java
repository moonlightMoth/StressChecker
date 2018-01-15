import javax.swing.*;
import java.awt.*;

class HelpFrame extends JFrame
{
    HelpFrame(String title)
    {
        setTitle(title);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
        setBounds(new Rectangle(600,300));
        setVisible(true);

        JLabel jLabel = new JLabel();
        jLabel.setPreferredSize(new Dimension(500, 250));
        jLabel.setBackground(Color.BLACK);
        jLabel.setText(GlobalConsts.getHelpString());
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setVerticalAlignment(JLabel.CENTER);
        jLabel.setFont(new Font("Verdana", Font.BOLD, 13));
        jLabel.setVisible(true);

        add(jLabel);


    }
}