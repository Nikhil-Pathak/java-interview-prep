package Inheritance;

import java.io.UncheckedIOException;

public class InheritanceException {
    public static void main(String[] args) {
        try{
            demoMethod();
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        foobar();
    }

    public static void demoMethod(){

    }

    public static void foobar() throws NullPointerException{

    }
}


class A {

    public Number abc() throws ArithmeticException{
        return 0;
    }
}

class B extends A {
    @Override
    public Number abc() throws UncheckedIOException {
        return 0;
    }
}

class C extends B{
    @Override
    public Integer abc() throws ArithmeticException{
        return 0;
    }
}