import java.util.ArrayList;

public class DeckTester {
    public static void main(String[] args)
    {
        ArrayList<Card> unDealt= new ArrayList<Card>();
        String[] ranks= {"Jack","King","Queen","Ace","2","3","4","5","6","7","8","9","10"};
        String[] suits= {"Hearts ","Clubs ","Spades ","Diamonds "};
        int[] points={1,2,3,4,5,6,7,8,9,10};

        Deck deck= new Deck(ranks, suits, points);
        
}
