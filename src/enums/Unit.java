package enums;

public enum Unit {
    METER("Meter", true),
    KILOGRAM("Kilogram", true),
    SECOND("Second", true),
    AMPERE("Ampere", true),
    KELVIN("Kelvin", true),
    MOLE("Mole", true),
    CANDELA("Candela", true),
    NEWTON("Newton", false, 1, 1, -2, 0, 0, 0, 0),
    JOULE("Joule", false, 2, 1, -2, 0, 0, 0, 0),
    WATT("Watt", false, 2, 1, -3, 0, 0, 0, 0);
    private String name;
    private boolean isMain;
    private int[] arr;
    
    
    private Unit (String name, boolean isMain) {
        this.name = name;
        this.isMain = isMain;
    }
    
    private Unit (String name, boolean isMain, int i0, int i1, int i2, int i3, int i4, int i5, int i6) {
        this(name, isMain);
        arr = new int[]{i0,  i1,  i2,  i3,  i4,  i5, i6};
    }
    
    public String getName(){
        return this.name;
    }
    
    /**
     * This function returns unit with index
     * @param a
     * @return
     */
    private Unit getUnit(int a){
        int n = 0;
        for (Unit i:Unit.values()) {
            n++;
            if (n > a) {
                return i;
            }
        }
        return null;
    }
    
    /**
     * This function sorts units with negative or positive power
     * @return
     */
    private int[][] createArr(){
        int[] pos = new int[7];
        int[] neg = new int[7];
        int n1 = 0, p1 =0;
        for (Unit i:Unit.values()) {
            int j = 0;
            for (; j < 7; j++) {
                if (i.ordinal() == j){
                    if (this.arr[j] < 0){
                        neg[n1++] = j;
                    } else if (this.arr[j] > 0) {
                        pos[p1++] = j;
                    }
                    break;
                }
            }
            if (j == 6) break;
        }
        return new int[][]{pos, neg, {p1, n1}};
    }
    
    /**
     * This function adds units with positive power
     * @param str
     * @param pos
     * @param p1
     * @param n1
     * @return
     */
    private String addPos(String str, int[] pos, int p1, int n1){
        if (p1 == 0) str += "1 / ";
        else {
            if (this.arr[pos[0]] == 1)
                str += this.getUnit(pos[0]).name + " ";
            else {
                str += this.getUnit(pos[0]).name + " ^ " + this.arr[pos[0]] + " ";
            }
            for (int i = 1; i < p1; i++) {
                if (this.arr[pos[i]] == 1)
                    str += "* " + this.getUnit(pos[i]).name + " ";
                else {
                    str += "* " + this.getUnit(pos[i]).name + " ^ " + this.arr[pos[i]] + " ";
                }
            }
            if(n1 != 0)
                str += "/ ";
        }
        return str;
    }
    
    /**
     * This function adds units with negative power
     * @param str
     * @param neg
     * @param n1
     * @return
     */
    private String addNeg(String str, int[] neg, int n1){
        if (n1 > 0){
            if (this.arr[neg[0]] == -1)
                str += this.getUnit(neg[0]).name + " ";
            else {
                str += this.getUnit(neg[0]).name + " ^ " + -this.arr[neg[0]] + " ";
            }
            for (int i = 1; i < n1; i++) {
                if (this.arr[neg[i]] == -1)
                    str += "* " + this.getUnit(neg[i]).name + " ";
                else {
                    str += "* " + this.getUnit(neg[i]).name + " ^ " + -this.arr[neg[i]] + " ";
                }
            }
        }
        return str;
    }
    
    /**
     * This function returns formula of unit in main units
     * @return
     */
    public String getBaseUnit(){
        if (this.isMain) return this.name;
        else {
            int[][] arrTemp = createArr();
            int[] pos = arrTemp[0], neg = arrTemp[1];
            int p1 = arrTemp[2][0], n1 = arrTemp[2][1];
            String str = "";
            str = addPos(str, pos, p1, n1);
            str = addNeg(str, neg, n1);
            return str;
        }
    }
}
