public class Overflow {
    public static void main(String[] args){
// Int is 5 therefore falls in the range of  byte i.e. -128 to 127
        int simpleInt = 5;
        byte simpleByte = (byte)simpleInt;
        System.out.println(simpleInt);
        System.out.println(simpleByte);

//Byte has a range from -128 to 127 therefore putting the value of 500 will cause it to have overflow
        int overflowInt = 500;
        byte overflowByte = (byte)overflowInt;
        System.out.println(overflowInt);
        System.out.println(overflowByte);
    }
}
