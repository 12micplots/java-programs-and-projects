//left shift operator is used to shift all the bits to the left side of specified number of times
//right shift operator is used to move left operand values to the right by a specified number of times
public class ShiftOperators {
    public static void main(String[] args){
        System.out.println(5<<3);//LSO 5*2^3=40
        System.out.println(400>>7);//RSO 400/2^7=400/128=3.x becomes 3 as an int
        /*for positive values >>> is same as >>*/
        System.out.println(30>>>4);
        System.out.println(30>>4);
        //for negative values >>> changes parity(MSB) to 0
        System.out.println(-64>>4);
        System.out.println(-64>>>4);

    }
}
