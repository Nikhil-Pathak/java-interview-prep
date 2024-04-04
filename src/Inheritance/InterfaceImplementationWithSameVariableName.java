package Inheritance;

public class InterfaceImplementationWithSameVariableName {
    public static void main(String[] args) {
        new A().print();
    }
}


interface I1{
    int a=10;
}

class A implements I1{
    public final int a=20;

    void print(){
        System.out.println(a);
    }
}
