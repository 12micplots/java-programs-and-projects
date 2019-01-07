public class Narrowing {
//    causing a variable to become narrow also known as casting or downcasting or typecasting
//    using the reference of superclass as reference of subclass
    public static void main(String[] args){
        float normalFloat = 1.63f;
        int narrowedInt = (int)normalFloat;
        System.out.println(normalFloat);
        System.out.println(narrowedInt);

        class A{
            public void message(){
                System.out.println("message from A");
            }
        }

        class B extends A{
            public void message(){
                System.out.println("message from B");
            }
        }

        A superClass = new B();
        B subClass = (B)superClass;
        subClass.message();



    }
}
