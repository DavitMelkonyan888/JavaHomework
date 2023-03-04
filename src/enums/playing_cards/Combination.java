package enums.playing_cards;

public enum Combination {
    ROYAL_FLUSH{
        /**
         * @param a
         * @return
         */
        @Override
        protected boolean is (Card[] a) {
            return false;
        }
    }, STRAIGHT_FLUSH{
        /**
         * @param a
         * @return
         */
        @Override
        protected boolean is (Card[] a) {
            return false;
        }
    }, FOUR_CARDS{
        /**
         * @param a
         * @return
         */
        @Override
        protected boolean is (Card[] a) {
            return false;
        }
    }, FULL_HOUSE{
        /**
         * @param a
         * @return
         */
        @Override
        protected boolean is (Card[] a) {
            return false;
        }
    }, FLUSH{
        /**
         * @param a
         * @return
         */
        @Override
        protected boolean is (Card[] a) {
            Card[][] arr = Card.sortBySuit(a);
            for (int i = 0; i < 4; i++) {
                if (arr[i].length >= 5) return true;
            }
            return false;
        }
    }, STRAIGHT{
        /**
         * @param a
         * @return
         */
        @Override
        protected boolean is (Card[] a) {
            return false;
        }
    }, THREE_CARDS{
        /**
         * @param a
         * @return
         */
        @Override
        protected boolean is (Card[] a) {
            return false;
        }
    }, TWO_PAIR{
        /**
         * @param a
         * @return
         */
        @Override
        protected boolean is (Card[] a) {
            return false;
        }
    }, PAIR{
        /**
         * @param a
         * @return
         */
        @Override
        protected boolean is (Card[] a) {
            return false;
        }
    };
    
    /**
     * This function returns the highest combination or null if there is not any combinations
     * @param a cards
     * @return
     */
    public static Combination get(Card[] a){
        if (ROYAL_FLUSH.is(a))
            return ROYAL_FLUSH;
        else if (STRAIGHT_FLUSH.is(a))
            return STRAIGHT_FLUSH;
        else if (FOUR_CARDS.is(a))
            return FOUR_CARDS;
        else if (FULL_HOUSE.is(a))
            return FULL_HOUSE;
        else if (FLUSH.is(a))
            return FLUSH;
        else if (STRAIGHT.is(a))
            return STRAIGHT;
        else if (THREE_CARDS.is(a))
            return THREE_CARDS;
        else if (TWO_PAIR.is(a))
            return TWO_PAIR;
        else if (PAIR.is(a))
            return PAIR;
        else return null;
    }
    
    protected abstract boolean is(Card[] a);
    
}
