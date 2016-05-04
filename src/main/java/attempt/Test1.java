package attempt;

import javassist.*;

/*
   A very simple sample program

   This program overwrites sample/Test.class (the class file of this
   class itself) for adding a method g().  If the method g() is not
   defined in class Test, then this program adds a copy of
   f() to the class Test with name g().  Otherwise, this program does
   not modify sample/Test.class at all.

   To see the modified class definition, execute:

   % javap sample.Test

   after running this program.
*/
public class Test1 {
    static String testString="staticFiled";

    public int f(int i) {
        return i + 1;
    }

    public static void main(String[] args) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        String a = "localVariable in line 29";
        CtClass cc = pool.get("attempt.Test");

    }
}
