public class main {
    public static void main(String[] args){
    public static void printNumbers (int num){
    if (num==0) {
        return;
        } else {
        System.out.println(num);
        printNumbers(num - 1);
        }
    }
    }
}
