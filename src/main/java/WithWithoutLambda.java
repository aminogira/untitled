import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

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

    public static void fiveForEachLoop(){
        List<String> list=new ArrayList<>();
        list.add("amila");
        list.add("inosha");
        list.add("ganesha");
        list.add("chamila");

        list.forEach(
            (n)->System.out.println(n)
        );
    }

    public static void sixMultipleStatements(){
        Talkable tk1=(msg) -> {
            String st1 = "I like to say, ";
            String st2 = st1 + msg;
            return st2;
        };
        System.out.println(tk1.talk("time is precious"));
    }

    public static void sevenThreadInLambda(){
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread No Lambda Running");
            }
        };
        Thread t1 =new Thread(r1);
        t1.start();

        Runnable r2=()->{
            System.out.println("Lambda Thread Running");
        };

        Thread t2 =new Thread(r2);
        t2.start();
    }

    public static void eightComparatorWithLambda(){
        List<Product> list=new ArrayList<Product>();

        list.add(new Product(1,"HP Laptop",25000));
        list.add(new Product(3,"Keyboard",300));
        list.add(new Product(2,"Dell Mouse",150));

        System.out.println("Sorting on the basis of name....................");
        Collections.sort(list,(p1, p2)->{
            return p1.name.compareTo(p2.name);
        });
        for(Product p:list){
            System.out.println(p);
        }

        System.out.println("Sorting on the basis of Price ASC...................");
        Collections.sort(list,(p1, p2)->{
            int b = p1.price - p2.price;
            return b;
        });
        for(Product p:list){
            System.out.println(p);
        }

        System.out.println("Sorting on the basis of Price DSC...................");
        Collections.sort(list,(p1, p2)->{
            int b = p2.price - p1.price;
            return b;
        });
        for(Product p:list){
            System.out.println(p);
        }
        System.out.println("Sorting on the basis of id...................");
        Collections.sort(list,(p1, p2)->{
            int b = p1.id - p2.id;
            return b;
        });
        for(Product p:list){
            System.out.println(p);
        }
    }

    public static void nineFilterCollectionData(){
        List<Product> list=new ArrayList<Product>();
        list.add(new Product(1,"Samsung A5",17000));
        list.add(new Product(3,"Iphone 6S",65000));
        list.add(new Product(2,"Sony Xperia",25000));
        list.add(new Product(4,"Nokia Lumia",15000));
        list.add(new Product(5,"Redmi4 ",26000));
        list.add(new Product(6,"Lenevo Vibe",19000));

        Stream<Product> filterData = list.stream().filter(p -> p.price > 20000);
        filterData.forEach(
            product -> System.out.println(product.name + " : " + product.price)
        );
    }

}

class Product{
    int id;
    String name;
    int price;
    public Product(int id, String name, int price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            '}';
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