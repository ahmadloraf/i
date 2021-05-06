import java.math.BigInteger;

public class bigNumber {
    public static void main(String[] args){
        BigInteger a = new BigInteger("20000000000");
        BigInteger b = new BigInteger("40000000000");

        BigInteger c = a.add(b);
        BigInteger d = a.mod(b);
        System.out.println(c);
        System.out.println(d);

    }
    
}
