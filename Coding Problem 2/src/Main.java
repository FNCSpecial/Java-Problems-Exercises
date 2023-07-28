/*
       Good morning! Here's your coding interview problem for today.

This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
        */
public class Main {
    static int Problem2_divide( int tab[]){




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



    }

    static int Problem2( int tab[]) {



        int size = tab.length;
        int tabelka[] = new int[size];



        for (int i = 0; i < size; i++) {
            int wynik = 1;

            for (int j = 0; j < size ; j++) {

                if(i!=j){
                    wynik = wynik*tab[j];
                    tabelka[i] = wynik;
                }
            }
            System.out.println(tabelka[i]);
        }


        return 0;

    }

    public static void main(String[] args) {
        System.out.println(Problem2_divide(new int[]{1, 2, 3, 4, 5}));
        System.out.println(Problem2_divide(new int[]{3, 2, 1}));
        //without division
        System.out.println(Problem2(new int[]{1,2,3,4,5}));
        System.out.println(Problem2(new int[]{3,2,1}));
    }
}