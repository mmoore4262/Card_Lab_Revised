import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> unDealt;
    private ArrayList<Card> dealt;

    public Deck( String[] ranks, String[] suits, int[] points)
    {
        for (int i=0; i<5; i++)
        {

            Card sample= new Card (ranks[(int)(Math.random()*13)], suits[(int)(Math.random()*4)],points[(int)(Math.random()*10)]);
            unDealt.add(sample);
            System.out.println(unDealt.get(i).toString());
        }

        this.unDealt=unDealt;
    }

    public void isitfull()
    {
        for (int i=0; i< this.unDealt.size(); i++)
            System.out.println(this.unDealt.get(i));
    }
    private boolean isEmpty()
    {
        return false;
    }
}
