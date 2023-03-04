package enums.playing_cards;

import enums.Unit;

public enum Suit {
    HEART,
    DIAMOND,
    CLUB,
    SPADE;
    
    public static Suit getSuit(int a){
        int n = 1;
        for (Suit i:Suit.values()) {
            n++;
            if (n > a) {
                return i;
            }
        }
        return null;
    }
}
