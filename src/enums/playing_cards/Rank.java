package enums.playing_cards;

import enums.Unit;

public enum Rank {
    A,
    _2,
    _3,
    _4,
    _5,
    _6,
    _7,
    _8,
    _9,
    _10,
    V,
    D,
    K;
    
    public static Rank getRank(int a){
        int n = 1;
        for (Rank i:Rank.values()) {
            n++;
            if (n > a) {
                return i;
            }
        }
        return null;
    }
}
