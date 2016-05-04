# Test4Javassist


This program achieve the function that compile a .java file automatically 
and then modify and rewrite the compiled .class file and run the new .class file.
   1.compile the target .java file
   2.overwrites sample/Test1.class  for adding print statements
   to print the known field variables and local variables.
   3.run the modified Test1.class file


   To see the modified class definition, execute:

    % javac -classpath .:../../../libs/javassist.jar attempt/Test.java
    % java -classpath .:../../../libs/javassist.jar attempt/Test
    or
    % build gradle
    % java -cp build/libs/Test4Javassist-1.0.jar:libs/javassist.jar attempt.Test