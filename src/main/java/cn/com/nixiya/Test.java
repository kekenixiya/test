package cn.com.nixiya;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("5",4);
        map1.put("1",5);
        map1.put("6",6);
        map1.put("0",7);
        System.out.println();

        Set<Map.Entry<String,Integer>>  eee = map1.entrySet();
        for(Map.Entry<String,Integer> ee : eee){
            System.out.print(ee);
        }

        //        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        test1.test(n);
    }

    public static void test(int n){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        int[] table = getChangeResult(n);
        for(int i=0; i<n; i++){
            map.put(table[i], i+1);

        }
        int[] res = new int[n];
        for(int j=0; j<n; j++){
            res[j] = map.get(j+1);
        }
        printRes(res);
    }

    private static void printRes(int[] res) {
        for(int result : res){
            System.out.print(result+" ");
        }
    }

    private static int[] getChangeResult(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] table = new int[n];
        int temp = 0;
        int index = 0;
        for(int i=0;i<n;i++){
            list.add(i+1);
        }
        while(list.size()>0){
            //step 1
            temp = list.get(0);
            table[index] = temp;
            index++;
            list.remove(0);
            if(list.size()==0){
                break;
            }
            //step 2
            list.add(list.get(0));
            list.remove(0);
        }
        return table;
    }

}
