public class Card {
    private String rank;
    private String suit;
    private int pointValue;
    public Card( String rank, String suit, int pointValue)
    {
        this.rank=rank;
        this.suit=suit;
        this.pointValue=pointValue;
    }
    public String rankGetter()
    {
        return (this.rank);
    }
    public String suitGetter()
    {
        return (this.suit);
    }
    public int pointValueGetter()
    {
        return (this.pointValue);
    }
    public boolean equals(Card otherCard)
    {
        if (otherCard.rankGetter()==this.rankGetter())
        {
            return true;
        }
        return false;
    }
    public String toString()
    {
        return (" "+ this.rankGetter()+ " "+ this.suitGetter() + " " + this.pointValueGetter());
    }
}
