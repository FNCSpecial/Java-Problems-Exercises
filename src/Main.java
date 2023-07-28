// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import javax.xml.transform.Result;
import java.util.*;


class UnivalTree{
    public int val;
    public UnivalTree left;
    public UnivalTree right;

    public UnivalTree(int val, UnivalTree left, UnivalTree right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int cout_unival_subtrees(UnivalTree tree){
        int count = 0;

        if(tree.left == null && tree.right == null){
            return 1;
        }
        if(tree.left.val == tree.right.val){
            count +=1;
        }
        if(tree.left!=null){
            count += cout_unival_subtrees(tree.left);
        }
        if(tree.right!=null){
            count += cout_unival_subtrees(tree.right);
        }
        return count;
    }




    /*
      UnivalTree tree =
                new UnivalTree(0,
                        new UnivalTree(1,null,null), new UnivalTree(0,
                            new UnivalTree(1, new UnivalTree(1,null,null),
                                    new UnivalTree(1,null,null)), new UnivalTree(0,null,null)));
        System.out.println(tree.cout_unival_subtrees(tree));
     */
}



public class Main {







    static Integer evenFibonacciSum(Integer n) {

        int wynik=0;
        int fib;
        int prevprev = 0;
        int prev = 1;

        while(wynik <= n){
            fib = prevprev + prev;
            prevprev = prev;
            prev = fib;

            if(fib % 2 == 0 ){
                if(wynik + fib < n ) {
                    wynik += fib;
                }
                else {
                    break;
                }
            }

        }



        return wynik;

    }
    static int Problem2_divide( int tab[]){

       /*
       Good morning! Here's your coding interview problem for today.

This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
        */


        int size = tab.length;

        int product = 1;

            for(int i =0; i <size ; i++){
                product = product *tab[i];

            }

            for(int i=0; i<size; i++){
                tab[i] = product/tab[i];
                System.out.println(tab[i]);
            }

return 0;


            //  System.out.println(Problem2_divide(new int[]{1, 2, 3, 4, 5}));
    }
    static int Problem2( int tab[]) {

       /*
       Good morning! Here's your coding interview problem for today.

This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
        */


        int size = tab.length;
        int tabelka[] = new int[size];



        for (int i = 0; i < size; i++) {
            int wynik = 1;

            for (int j = 0; j < size ; j++) {

                if(i!=j){
           wynik = wynik*tab[j];
           tabelka[i] = wynik;
            }
            else
                continue;

            }
                System.out.println(tabelka[i]);
            }


            return 0;
        // System.out.println(Problem2(new int[]{1,2,3,4,5}));
        }
    static int Problem4(int tab[]) {

        Arrays.sort(tab);
        int size = tab.length;
        int result[] = new int[size];
        int j = 0;

        for(int i=0; i<size; i++) {
            if(tab[i] > 0){
                result[j] = tab[i];
                j++;
            }
        }

        int wynik = result[0];


        for (int i=0; i<j; i++) {
            if (wynik == result[i]) {
                wynik++;
            }
        }
        return wynik;
    }
    static Integer gcd(Integer p, Integer q) {
        int wynik = 1;
        int max = 1;
        if(p>q){
            max = p;
        }
        if(q>p){
            max = q;
        }

        for(int i=max; i>1 ; i-- ){
            if (p % i == 0 && q % i == 0){
                wynik =i;
                return wynik;

            }
        }

        if(p==q){
            wynik = p;
        }

        return wynik;
    }
    static Boolean packageRice(Integer big, Integer small, Integer goal) {

        int calosc = 5*big + small;




        if(goal % 5 == 0 && calosc >= goal) {
                return true;
            }

         if(goal % 5 != 0 && calosc >= goal && small >= 1){

             while(small >= 1 ){
                 goal --;
                 small --;

                 if(goal % 5 == 0 && calosc >= goal){

                     return true;

                 }



             }

        }

          return false;

    }
    static int Problem4_using_loops(int tab[]) {


        int size = tab.length;

        for(int i=0; i<size -1 ; i++){
            if(tab[i] > tab[i+1]){
                int temp = tab[i];
                tab[i] = tab[i+1];
                tab[i+1] = temp;
                i=-1;
            }
        }

        int result[] = new int[size];
        int j = 0;

        for(int i=0; i<size; i++) {
            if(tab[i] > 0){
                result[j] = tab[i];
                j++;
            }
        }

        int wynik = result[0];


        for (int i=0; i<j; i++) {
            if (wynik == result[i]) {
                wynik++;
            }
        }


        return wynik;

        //System.out.println(Problem4_using_loops(new int[]{3, 4, -1, 1}));
    }

    static int search(Integer n, Integer[] list) {
        int size = list.length;
        int index = -1;
        for (int i = 0 ; i < size ; i ++)
        {
            if(list[i].equals(n)){
                return i;
            }

        }
        return index;

        //System.out.println(search(1, new Integer [] {1,1,2,3,10,-3}));
    }
    static Integer maximum(Integer[] list) {
        int size = list.length;
        int max = 0;
        int pom = 0;

        for (int i = 0; i < size - 1; i++) {
            if (list[i] > list[i + 1]) {
                pom = list[i];
                list[i] = list[i + 1];
                list[i + 1] = pom;
                i = 0;
            }
        }
        max = list[size - 1];
        return max;

        //System.out.println(maximum(new Integer[]{1,9,0,3,-2}));
    }

    static List<String> Problem11 (String[] list, String prefix ){

        List<String> Result = new ArrayList<String>();



        int size = list.length;

        for (int i = 0; i< size; i++){
            if(list[i].startsWith(prefix)){
                Result.add(list[i]);
            }
        }


        return Result;

        /*
         System.out.println(Problem11(new String[]{"dog","deer","deal"},"dog"));
         */
    }


    public static void main(String[] args) {








    }
}