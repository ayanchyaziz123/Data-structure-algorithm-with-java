import java.util.Arrays;
import java.util.Comparator;


public class MapTwoPointer{
    class Node implements Comparable<Node>{
        private int ind;
        private int val;
        Node(int ind, int val){
            this.ind = ind;
            this.val = val;
        }
        int getVal(){
            return this.val;
        }
        int getInd(){
            return this.ind;
        }
        @Override
        public int compareTo(Node node){
            return this.val - node.val;
        }
}
    int[] mapTwoPonter(int[] arr, int len, int target){
        Node[] store = new Node[len];
        for(int i = 0; i < len; i++){
            store[i] = new Node(i, arr[i]);
        }
        Arrays.sort(store);
        int left = 0;
        int right = len - 1;
        while(left<right){
            int sum = store[left].getVal() + store[right].getVal();
            if(sum == target){
                return new int[]{store[left].getInd(), store[right].getInd()};
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{0};
    }
    public static void main(String[] args){
        MapTwoPointer mapTwoPointer = new MapTwoPointer();
        int[] arr = new int[]{4, 6, 2, 3, 7};
        int[] ans = mapTwoPointer.mapTwoPonter(arr, arr.length, 7);
        for(int x: ans){
            System.out.print(x + " ");
        }

    }
}
