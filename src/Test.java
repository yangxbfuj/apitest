import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String... args) throws UnsupportedEncodingException {
        // round 是4舍去5入
        System.out.println("Math.round(11.5) is " + Math.round(11.5));
        System.out.println("Math.round(-11.5) is " + Math.round(-11.5));
        // floor 向下取整
        System.out.println("Math.floor(11.5) is " + Math.floor(11.5));
        System.out.println("Math.floor(-11.5) is " + Math.floor(-11.5));
        // ceil 向下取整
        System.out.println("Math.ceil(11.5) is " + Math.ceil(11.5));
        System.out.println("Math.ceil(-11.5) is " + Math.ceil(-11.5));

        // 字符数组的输出格式
        char[] a = {'a', 'b', 'c'};
        System.out.println(a);

        // 字符串列表的输出格式
        List<String> ls = new ArrayList();
        ls.add("a");
        ls.add("b");
        ls.add("c");
        System.out.println(ls);

        // 字符列表的输出格式
        List<Character> lc = new ArrayList();
        lc.add('a');
        lc.add('b');
        lc.add('c');
        System.out.println(lc);

        // 取模运算的符号和小数点
        System.out.println("100 % 3 is " + (100 % 3));
        System.out.println("100 % 3.0 is " + (100 % 3.0));

        System.out.println("100 % -3 is " + (100 % -3));
        System.out.println("100 % -3.0 is " + (100 % -3.0));

        System.out.println("-100 % -3 is " + (-100 % -3));
        System.out.println("-100 % -3.0 is " + (-100 % -3.0));

        System.out.println("-100 % 3 is " + (-100 % 3));
        System.out.println("-100 % 3.0 is " + (-100 % 3.0));


        Random random = new Random();
        boolean isE = true;
        for (int i = 0; i < 1000; i++) {
            int v = random.nextInt();
            if (v == 0)
                v += 1;
            if (10000 % v != 10000 % (-v) && 10000 % v >= 0) {
                isE = false;
                break;
            }
            if (-10000 % v != -10000 % (-v) && 10000 % v <= 0) {
                isE = false;
                break;
            }
        }
        System.out.println(" x % y answer is " + isE);
        // Unicode 只是表示了符号的二进制代码，并没有说怎么存储
        // 而 utf-8 等表示了如何存储 unicode 的二进制代码
        System.out.println("中国abc".getBytes("Unicode").length);
        System.out.println("中国abc".getBytes("UTF-8").length);

    }
}

class Parent {

    String name = "Jack";

    private Parent(){
        this.name = "Rose";
    }

    public String getName() {
        return name;
    }

}

//error

//class Child extends Parent {
//
//}
