package oop.abstractes;

public abstract class AbsSup {
    public AbsSup(){
        System.out.println("This is constructor of abstract class");
    }
    public abstract void a_method();
    public void b_method(){
        System.out.println("This is a normal method of abstract class");
    }
}
