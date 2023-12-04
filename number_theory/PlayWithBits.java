
public class PlayWithBits {
    void printf(Object object)
    {
        System.out.print(object);
    }
    void printBinary(int num)
    {
        // right shifting
        for(int i = 10; i >= 0; --i)
        {
            printf((num >> i) & 1);
        }
    }

    boolean isIthBitSet(int val, int i)
    {
        // left shifting
        // is 1st bit set
        // 5 = 101
       //      010
       // &    000
       // if 0 then not else yes
       // 1 << i
       // 1 << 0 = 1
       // 1 << 1 = 10
       // 1 << 2 = 100
        if((val & (1<<i)) != 0)
        {
           printf("Set bit");
           return  true;
        }
        else 
        {
            printf("Not set bit");   
            return  true;
        }
       
    }
    int makeIthBitSet(int num, int i)
    {
        // 5 - 101
        //      10
        //     111
        return (num | (1 << i));
    }
    int makeIthBitUnset(int num, int i)
    {
        // make ith bit unset
        // ~num = telda of num = invert of num
        int x = (~(1<<i)); // firstly set then invert
        return (num & x);
    }
    int toggleBit(int num, int i)
    {
        // 
        return (a ^ (1 << i));
    }
    public static void main(String[] args)
    {
        // 1 0 0 0 1
        //MSB      LSB
    }
}
