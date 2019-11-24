package com.akash;

public class Test {
    public static void main(String[] args) {
        String a = "ncdfe";
        try {
            if(a.equals("ncdfe"))
                throw new NoClassDefFoundError();
            throw new ClassNotFoundException();
        }catch (NoClassDefFoundError | ClassNotFoundException ex){
            System.out.println(" i am catching exception "+ex.getClass().getName());
        }
    }
}
