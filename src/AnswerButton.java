import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnswerButton extends JButton
{
    boolean isRight;
    AnswerButton(String name, boolean isRightAnswer, OneButtonedAnswerPanel parentPanel)
    {
        isRight = isRightAnswer;
        setText(name);


        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(e.getButton() == MouseEvent.BUTTON1)
                {
                    if(isRightAnswer) {
                        setBackground(Color.GREEN);
                        if(!parentPanel.getParentPanel().getClicked())
                        {
                            GlobalVars.setRightAnswers(GlobalVars.getRightAnswers()+1);
                        }
                    }
                    else
                        setBackground(Color.RED);
                    parentPanel.getParentPanel().setNonClickable();
                    parentPanel.getParentPanel().getParentPanel().refreshStats();
                }
            }
        });
        setVisible(true);
    }


}