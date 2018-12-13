import java.util.ArrayList;

public class DeckTester {
    public static void main(String[] args) {
        ArrayList<Card> unDealt = new ArrayList<Card>();
        ArrayList<Card> p1 = new ArrayList<Card>();
        ArrayList<Card> p2 = new ArrayList<Card>();

        String[] ranks = {"Jack", "King", "Queen", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] suits = {"Hearts ", "Clubs ", "Spades ", "Diamonds "};
        int[] points = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Deck deck = new Deck(ranks, suits, points);


        for (int i = 0; i < 51; i++) {
            System.out.println(deck.unDealt.get(i).toString());
        }

        for (int i = 0; i < 51; i++) {
            System.out.println(p1.get(i).toString());
        }

        for (int i = 0; i < 51; i++) {
            System.out.println(p2.get(i).toString());
        }



        System.out.println();
       // deck.unDealt.isitfull();
        // p1.isitfull();
        // p2.isitfull();

        System.out.println();
        System.out.println(deck.unDealt.isEmpty());
        System.out.println(p1.isEmpty());
        System.out.println(p2.isEmpty());

        System.out.println();
        System.out.println(deck.unDealt.size());
        System.out.println(p1.size());
        System.out.println(p2.size());

        System.out.println();
        for (int i=0; i<51; i++)
        {
            System.out.println(deck.deal());
        }


        System.out.println();
        deck.shuffle();

    }
}

