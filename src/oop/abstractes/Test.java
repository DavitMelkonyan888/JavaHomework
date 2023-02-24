package oop.abstractes;

public interface Test {
    public default int square (int a){
        return a*a;
    }
}
