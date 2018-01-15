import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class MainFrame extends JFrame {
    private MainAnsVariantsPanel ansPanel;
    private MessagePanel messagePanel;
    private StringsManager stringsManager;

    MainFrame(String title)
    {
        setMenuBar(new InfoMenuBar());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle(title);
        setBounds(0,0,450,400);
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        stringsManager = new StringsManager(GlobalVars.getWords());
        setVisible(true);

        messagePanel = new MessagePanel();

        add(messagePanel);

        addNewPanel();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if(e.getButton()==3)
                {
                    addNewPanel();
                    refreshStats();
                }
            }
        });


        addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(e.getUnitsToScroll()>0)
                {
                    showPreviousMainAnsVariantsPanel();
                    refreshStats();
                }
                if(e.getUnitsToScroll()<0)
                {
                    showNextMainAnsVariantsPanel();
                    refreshStats();
                }
            }
        });

    }

    private MainAnsVariantsPanel initMainAnswerVariantsPanel()
    {
        return new MainAnsVariantsPanel(stringsManager.getAnswerOptions(),this);
    }

    private void addNewPanel()
    {
        try {
            ansPanel.setVisible(false);
        }catch(NullPointerException e) {}
        ansPanel = initMainAnswerVariantsPanel();
        MainAnsVariantsPanelStack.mainAnsVariantsPanelStack.add(ansPanel);
        MainAnsVariantsPanelStack.setCurrentIndex(MainAnsVariantsPanelStack.getCurrentIndex()+1);
        add(ansPanel);
        GlobalVars.setQuestionsAsked(GlobalVars.getQuestionsAsked()+1);
    }

    private void showPreviousMainAnsVariantsPanel()
    {
        if(MainAnsVariantsPanelStack.getCurrentIndex()>0)
        {
            ansPanel.setVisible(false);
            ansPanel = MainAnsVariantsPanelStack.mainAnsVariantsPanelStack.get(MainAnsVariantsPanelStack.getCurrentIndex()-1);
            ansPanel.setVisible(true);
            MainAnsVariantsPanelStack.setCurrentIndex(MainAnsVariantsPanelStack.getCurrentIndex()-1);
        }
    }

    private void showNextMainAnsVariantsPanel()
    {
        if(MainAnsVariantsPanelStack.getCurrentIndex()<MainAnsVariantsPanelStack.getLastIndex())
        {
            ansPanel.setVisible(false);
            ansPanel = MainAnsVariantsPanelStack.mainAnsVariantsPanelStack.get(MainAnsVariantsPanelStack.getCurrentIndex()+1);
            ansPanel.setVisible(true);
            MainAnsVariantsPanelStack.setCurrentIndex(MainAnsVariantsPanelStack.getCurrentIndex()+1);
        }
    }

    public void refreshStats()
    {
        messagePanel.setText(GlobalVars.getRightAnswers() + "/" + GlobalVars.getQuestionsAsked());
    }


}
