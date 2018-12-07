package itcast_day17;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args){
        function();
    }
    public static void function(){
        BigInteger b = new BigInteger("88988838848478384748389299");
        BigInteger b1 = new BigInteger("7837849328290129933020");
        BigInteger bigAdd = b.add(b1);
        BigInteger bigmiuns = b.subtract(b1);//大数减法

        System.out.println(bigmiuns);
    }
}
