import javax.swing.*;
import java.awt.*;

public class MainAnsVariantsPanel extends JPanel{
    private boolean isClicked = false;
    private MainFrame parent;
    MainAnsVariantsPanel(AnswerListContainer answerListContainer, MainFrame parent)
    {
        this.parent = parent;
        setLayout(new GridLayout(3,2));
        setPreferredSize(new Dimension(400,300));
        setBackground(Color.CYAN);
        setVisible(true);

        for (int i = 0; i < answerListContainer.variants.size(); i++) {
            add(createOneButtonPanel(answerListContainer.variants.get(i), answerListContainer.indOfRight==i));
        }

    }

    private OneButtonedAnswerPanel createOneButtonPanel(String name, boolean isRight)
    {
        return new OneButtonedAnswerPanel(name, isRight, this);
    }

    public void setNonClickable()
    {
        isClicked = true;
    }

    public boolean getClicked() {
        return isClicked;
    }


    public MainFrame getParentPanel() {
        return parent;
    }
}
