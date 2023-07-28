/*
Good morning! Here's your coding interview problem for today/
This problem was recently asked by Google.
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?


System.out.println(Problem1(20));

*/

import java.util.ArrayList;
import java.util.List;

public class Main {

    static boolean Problem1(int k) {


        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(15);
        list.add(3);
        list.add(7);


        int size = list.size();

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {

                if ((list.get(j) + list.get(i)) == k) {
                    System.out.println(list.get(j) + list.get(i));
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(Problem1(20));
        System.out.println(Problem1(10));
        System.out.println(Problem1(25));
        System.out.println(Problem1(11));
    }
}