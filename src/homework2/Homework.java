package homework2;

public class Homework {

    static int fun1(int a, int b){
        return 0;
    }

    static void fun2(){

    }

    static void fun3(boolean a){
        System.out.println("Hello World");
    }

    static char fun4(char a){
        return a;
    }

    /**
     * This function returns max value from 2 arguments
     * @param a float number
     * @param b float number
     * @return the max value from 2 arguments
     */
    static float Max(float a, float b){
        if(a>b){
            return a;
        } else { //else is not necessary
            return b;
        }
    }

    /**
     * This function returns sum of numbers starting from 0 to argument a
     * @param a some integer
     * @return the sum
     */
    static int SumUntil0(int a){
        if(a>0){
            return a + SumUntil0(a - 1);
        } else if(a < 0){
            return a + SumUntil0(a + 1);
        } else {
            return 0;
        }
    }
}
