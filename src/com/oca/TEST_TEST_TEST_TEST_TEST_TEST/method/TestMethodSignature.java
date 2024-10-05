package com.oca.TEST_TEST_TEST_TEST_TEST_TEST.method;


//Java uses CALL BY VALUE machanism when calling methods
// Tất cả các them số truyền vào methodcopy nếu là BIẾN, thì chỉ làm bản copy của biến đó, không phải chính biến đó
// Nếu truyền vào kiểu nguyên thủy vào method và nếu method thay đổi giá trị thì biến gốc không bị đổi Gt do chỉ đổi trên bản coppy
// Nếu truyền vào Object, thì là 1 object coppy của object gốc, nhưng 2 object này cùng trỏ chung tới 1 vùng nhớ,
// do đó bất kỳ thay đổi ở đâu cũng làm object thay đổi t
public class TestMethodSignature {
    public static void main(String[] args) {
//        a = 1;  // not ok due to a is not static
//        doSomeThing(); // not ok due to doSomeThing is not a static method
    }

    int a = 10;
    static String name = "Quan";

    void doSomeThing(Integer intV){
        System.out.println("DO no thing");
        TestMethodSignature.name = " ";// ok
        name = " ";// ok
        show();
    }

    static void show() {
        System.out.println("Ok");
        //a = a + 1;    invalid
//        doSomeThing(); invalid

        name = "new Name";
    }

    class TestSignature {
        int getF(int g) {
            show();
            return g;
        }

        // differ signature from above method
        int getF(String g) {
            return 3;
        }

        // similarity of signature from first method, => invalid
//        float getF(int g) {
//            return 3f;
//        }

        // similarity of signature from the first method. => invalid
//        private String getF(int h) {
//
//        }


    }
}

class TestMethodParam {
    public static void main(String[] args) {
        Integer i = new Integer(200);
        Integer i1 = new Integer(200);
        String s= new String("Quan");
        changeValue(i, i1, s);

        System.out.println(i);
        System.out.println(i1);
        System.out.println(s);

        SubClass subClass = new SubClass("Quan");
    }
    public static void changeValue(Integer i, Integer i1, String s) {
        i = 100;
        i1 = new Integer(101);
        s= "quan";
    }
}
class SubClass extends TestMethodSignature{
    static {
        System.out.println("static block");
    }

    private final String name;

    SubClass(String name) {
        this.name = name;

        final int x;
        final SubClass subClass;


        x = 1;
//        x =2;
    }

    @Override
    public String toString() {
        return "SubClass{" +
                "name='" + name + '\'' +
                '}';
    }
}