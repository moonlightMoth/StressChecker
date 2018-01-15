import java.util.ArrayList;

public class AnswerListContainer {
    ArrayList<String>  variants;
    int indOfRight;

    AnswerListContainer(ArrayList<String> variants, int indOfRight)
    {
        this.variants = variants;
        this.indOfRight = indOfRight;
    }

    AnswerListContainer()
    {
    }

    public boolean isFilled()
    {
        if(variants!=null&&indOfRight!=0)
            return true;
        else
            return false;
    }

    public void fill(ArrayList<String> variants, int indOfRight)
    {
        this.variants = variants;
        this.indOfRight = indOfRight;
    }
    public void insertAllVariants(ArrayList<String> variants)
    {
        this.variants = variants;
    }
    public void insertRightVar(int indOfRight)
    {
        this.indOfRight = indOfRight;
    }

}
