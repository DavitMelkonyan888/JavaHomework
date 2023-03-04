package enums.playing_cards;

public abstract class Shuffle {
    public abstract Card[] shuffling();
    public abstract Card[][] dealing(Card[] a);
    public abstract Combination checking(Card[] a);
}
