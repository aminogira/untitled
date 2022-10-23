public class WithWithoutLambda {

    public static void oneWithoutLambda(){
        int width = 10;
        Drowable d=new Drowable() {
            @Override
            public void draw() {
                System.out.println("Drawing Without Lambda " + width);
            }
        };
        d.draw();
    }

    public static void oneWithLambda(){
        int width = 10;
        Drowable d=()->{
            System.out.println("Drawing with Lambda " + width);
        };
    }

    public static void twoNoParamLambda(){
        Sayable s=() -> {
            return "No Param Lambda";
        };
        System.out.println(s.say());
    }

    public static void threeOneParamLambda(){
        Talkable t1=(name) -> {
            return "Hello " + name;
        };
        System.out.println(t1.talk("Ino"));

        Talkable t2 = name -> {
            return "Hi " + name;
        };
        System.out.println(t2.talk("Inosha"));
    }


    public static void fourTwoParamLambda(){
        System.out.println("==================== BASIC");
        Addable ad1=(a,b) -> (a+b);
        System.out.println(ad1.add(3,2));
        System.out.println("==================== WITH DATA TYPE");
        Addable ad2=(int a, int b) -> (a+b);
        System.out.println(ad2.add(12,23));
        System.out.println("==================== WITH RETURN");
        Addable ad3=(int a, int b) -> {
            return a+b;
        };
        System.out.println(ad3.add(321,234));
    }
}

interface Addable{
    int add(int a, int b);
}


interface Talkable{
    public String talk(String name);
}
interface Sayable{
    public String say();
}

interface Drowable{
    public void draw();
}