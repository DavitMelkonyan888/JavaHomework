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

    static float Max(float a, float b){
        if(a>b){
            return a;
        } else { //else is not necessary
            return b;
        }
    }

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
