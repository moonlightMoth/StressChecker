import java.util.ArrayList;

public class MainAnsVariantsPanelStack {

    public static ArrayList<MainAnsVariantsPanel> mainAnsVariantsPanelStack = new ArrayList<>();
    private static int currentIndex =-1;

    public static int getLastIndex()
    {
        return mainAnsVariantsPanelStack.size()-1;
    }
    public static int getCurrentIndex()
    {
        return currentIndex;
    }

    public static void setCurrentIndex(int currentIndex) {
        MainAnsVariantsPanelStack.currentIndex = currentIndex;
    }
}
