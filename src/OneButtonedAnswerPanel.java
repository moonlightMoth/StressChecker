import javax.swing.*;
import java.awt.*;

public class OneButtonedAnswerPanel extends JPanel
{
    private MainAnsVariantsPanel parentPanel;
    OneButtonedAnswerPanel(String name, boolean isRight, MainAnsVariantsPanel parentPanel)
    {
        this.parentPanel = parentPanel;
        setBackground(Color.CYAN);
        setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        FlowLayout flowLayout = new FlowLayout();
        setLayout(flowLayout);
        JCheckBox jCheckBox = new JCheckBox();
        jCheckBox.setContentAreaFilled(true);
        add(new JCheckBox());

        AnswerButton answerButton = new AnswerButton(name, isRight, this);
        add(answerButton);
    }


    public MainAnsVariantsPanel getParentPanel() {
        return parentPanel;
    }
}