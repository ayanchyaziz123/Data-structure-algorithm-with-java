
// Insertion: You are given two 32 bits numbers, n and m, and two bit positions
// i and j. write a method to insert m into n such that m starts at bit j and ends with at bit i.
// you can asssume that the bits j through i have enough space to fit all of m. that is, if
// m=10011, you can assume that there are at least 5 bits between j and i. you would not, for example 
// have j=3 and i = 2, because m could not full fit between bit 3 and bit 2;
public class Prob5_1 {

    void printBinart(int n){
        // 3 = 11
        // 
        for(int i = 10; i >= 0; --i){
            System.out.print((n >> i) & 1);
        }
        System.out.println();
    }
    int insertion(int n, int m, int i, int j){
        if(i > j || i < 0 || j >= 32) return 0;
        int allOnes = ~0;
        System.out.println(allOnes);
        return 0;
    }
    public static void main(String[] args){
        Prob5_1 prob5_1 = new Prob5_1();
        System.out.println("Hello world..!");
        
        prob5_1.printBinart(3);
        
    }
}
