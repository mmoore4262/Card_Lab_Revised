import java.util.ArrayList;

public class Deck {
    public ArrayList<Card> unDealt;
    public ArrayList<Card> dealt;

    public Deck( String[] ranks, String[] suits, int[] points)
    {
        ArrayList<Card>unDealt= new ArrayList<Card>();
        ArrayList<Card>dealt= new ArrayList<Card>();
      /*  this.unDealt=unDealt;
        this.dealt=dealt;*/
        for (int i=0; i<51; i++)
        {

            Card sample= new Card (ranks[(int)(Math.random()*13)], suits[(int)(Math.random()*4)],points[(int)(Math.random()*10)]);
            unDealt.add(sample);
            System.out.println(unDealt.get(i).toString());
        }


    }

    public void isitfull()
    {
        for (int i=0; i< this.unDealt.size(); i++)
            System.out.println(this.unDealt.get(i));
    }
    public boolean isEmpty()
    {
        if (this.unDealt.size()!=0)
        {
            return true;
        }
        return false;

    }
    public int size()
    {
        return this.unDealt.size();
    }
    public Card deal()
    {
        if (this.unDealt.size()==0)
        {
            return null;
        }
        Card remCard= this.unDealt.get(0);
        this.dealt.add(0,remCard);
        this.unDealt.remove(0);
        return remCard;
    }

    public void shuffle()
    {
        for (int k=51; k>1; k--)
        {
            Card tempCard= this.dealt.get(0);
            this.unDealt.add(tempCard);
            this.dealt.remove(0);
        }
    }



}

