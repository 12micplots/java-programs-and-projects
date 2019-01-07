public class BitwiseOperators {
    public static void main(String[] args){
        //Bitwise AND and Bitwise OR (exclusive OR and inclusive OR)
        //the difference between Bitwise AND and logical AND is that logical AND does not check the second condition if the first condition is true. It only checks second condition if the first condition is true. on the other hand Bitwise AND checks both the conditions
        int a = 3;
        int b =5;
        int c =7;
        System.out.println(a<b && b<c);//true && true = true
        System.out.println(a<b & b<c);//true && true = true
        System.out.println(b<a && b++<c);//false && true = false
        System.out.println(b);//will print 5 as the second condition is not checked
        System.out.println(b<a & b++<c);//false && true = false
        System.out.println(b);// will print 6 as the second condition is checked
        System.out.println(3<5||c++<9);//logical OR (||) will check the second condition only if the first condtion is false
        System.out.println(c);//will print 7 as the second condition is not checked
        System.out.println(3<5|c++<9);//Bitwise OR (|) will check both the conditions always
        System.out.println(c);// will print 8 as both the conditions are checked
        System.out.println(3<5 ^ c++<9); // Bitwise exclusive OR

    }
}
