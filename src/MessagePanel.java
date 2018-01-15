import javax.swing.*;
import java.awt.*;
import java.beans.EventHandler;

public class MessagePanel extends JPanel{
    JLabel messageField;

    MessagePanel()
    {
        setSize(new Dimension(400,100));
        setBackground(Color.BLACK);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setAlignmentY(Component.TOP_ALIGNMENT);
        setLayout(new FlowLayout());
        setVisible(true);


        messageField = new JLabel("SampleText");

        messageField.setFont(new Font("Verdana", Font.BOLD, 20));
        messageField.setPreferredSize(new Dimension(350,100));
        messageField.setHorizontalAlignment(JLabel.CENTER);
        messageField.setVerticalAlignment(JLabel.CENTER);
        messageField.setForeground(Color.CYAN);

        add(messageField);

    }

    public void setText(String text)
    {
        messageField.setText(text);
    }


}
