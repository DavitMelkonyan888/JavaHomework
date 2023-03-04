package enums.playing_cards;

public enum Card {
    HA, H2, H3, H4, H5, H6, H7, H8, H9, H10, HV, HD, HK,
    DA, D2, D3, D4, D5, D6, D7, D8, D9, D10, DV, DD, DK,
    CA, C2, C3, C4, C5, C6, C7, C8, C9, C10, CV, CD, CK,
    SA, S2, S3, S4, S5, S6, S7, S8, S9, S10, SV, SD, SK;
    
    private Suit suit;
    private Rank rank;
    
    static{
        create();
    }
    
    /**
     * This function initializes values
     */
    private static void create(){
        for(Card i : Card.values()){
            int s, r;
            if(i.ordinal()+1 < 14) {
                r = (i.ordinal() + 1) % 14;
                s = 1;
            }
            else if(i.ordinal()+1 < 27) {
                r = (i.ordinal() + 1) % 14 + 1;
                s =2;
            }
            else if(i.ordinal()+1 < 40) {
                r = (i.ordinal() + 1) % 27 + 1;
                s = 3;
            }
            else {
                r = (i.ordinal() + 1) % 40 + 1;
                s = 4;
            }
            i.suit = Suit.getSuit(s);
            i.rank = Rank.getRank(r);
        }
    }
    
    public Suit getSuit () {
        return suit;
    }
    
    public Rank getRank () {
        return rank;
    }
    
    public static Card getCard(int a){
        int n = 1;
        for (Card i:Card.values()) {
            n++;
            if (n > a) {
                return i;
            }
        }
        return null;
    }
    
    public static Card[][] sortBySuit(Card[] a){
        Card[][] arr = new Card[4][];
        int h2 = 0, d2 = 0, c2 = 0, s2 = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].suit == Suit.HEART) h2++;
            else if(a[i].suit == Suit.DIAMOND) d2++;
            else if(a[i].suit == Suit.CLUB) c2++;
            else if(a[i].suit == Suit.SPADE) s2++;
        }
        Card[] h = new Card[h2];
        Card[] d = new Card[d2];
        Card[] c = new Card[c2];
        Card[] s = new Card[s2];
        int h1 = 0, d1 = 0, c1 = 0, s1 = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].suit == Suit.HEART) h[h1++] = a[i];
            else if(a[i].suit == Suit.DIAMOND) d[d1++] = a[i];
            else if(a[i].suit == Suit.CLUB) c[c1++] = a[i];
            else if(a[i].suit == Suit.SPADE) s[s1++] = a[i];
        }
        arr[0] = h;
        arr[1] = d;
        arr[2] = c;
        arr[3] = s;
        return arr;
    }
    
    
}
