import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 6;
        ArrayList<Integer> innerList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(isPr(n)){
            innerList.add(n);
            innerList.add(1);
            list.add(innerList);
            System.out.println(list);
        }
        int cnt = 0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                while(n%i == 0){
                    n/= i;

                }
                cnt ++ ;
                innerList = new ArrayList<>();
                innerList.add(i);
                innerList.add(cnt);
                System.out.println(innerList);
                list.add(innerList);
            }
        }
        System.out.println(list);
        System.out.println("Hello world!");
    }
    public static boolean isPr(int i){
        for(int j=2;j<i;j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}