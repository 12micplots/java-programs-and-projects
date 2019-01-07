
public class Widening {

    public static void main (String[] args){

//        to do widening the output should be of more places or wide or the other way to do widening is to take reference from subclass to parent class
//        also known as upcasting
        class A{
            public void message(){
                System.out.println("message from A");
            }
        }

        class B extends A
        {
            public void message(){
                System.out.println("message from B");
            }
        }
//  reference of subclass is widened to reference of superclass
        B subClass = new B();
        A superClass = subClass;
        superClass.message();


        int firstInt = 50;
        float firstFloat = firstInt;
        System.out.println(firstInt);
        System.out.println(firstFloat);

    }
}
