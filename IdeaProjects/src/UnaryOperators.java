/*Unary operators are used to increment or decrement the values by one , to perform negation and
or to check and inverting the conditions such as true and false . Used here according to precedence*/

public class UnaryOperators {

    public static void main(String args[]){
    int myInteger = 7;
    System.out.println(myInteger++);//post increment
    System.out.println(++myInteger);//pre increment
    System.out.println(myInteger--);//post decrement
    System.out.println(--myInteger);//pre decrement
    System.out.println(+myInteger);//making an integer positive
    System.out.println(-myInteger);//making an integer negative
    int yourInteger = 6;
    int ourInteger = -13;
    boolean t = true;
    System.out.println(~yourInteger);//minus the number, starting from 0
    System.out.println(~ourInteger);//plus the number, staring from 0
    System.out.println(!t);//inverting the boolean operator
    System.out.println(!!t);//inverting the boolean two times hence ineffective
    System.out.println("end of Unary operators");
}
}
