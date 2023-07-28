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