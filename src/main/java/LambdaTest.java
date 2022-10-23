import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaTest {



    public static void testLambda1(){
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(5);
        num.add(9);
        num.add(25);
        num.add(3);
        num.add(12);
        num.forEach((n) -> {
            System.out.println(n);
        });
    }




    public static void testLambda2(){
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(50);
        num.add(94);
        num.add(25);
        num.add(37);
        num.add(12);
        Consumer<Integer> method= (nn) -> {
            System.out.println(nn);
        };
        num.forEach(method);
    }





    interface StringFunction{
        String run(String str);
    }
    public static void printFromated(String str, StringFunction format){
        String result = format.run(str);
        System.out.println(result);
    }
    public static void testLambda3(){
        StringFunction exc = (s) -> s + " !";
        StringFunction ask = (s) -> s + " ?";
        printFromated("Hi",exc);
        printFromated("Hello", ask);
    }


}
