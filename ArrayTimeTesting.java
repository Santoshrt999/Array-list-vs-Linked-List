/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Santosh Goteti This is the advancement of the previous one which I
 * showed, LinkedList vs Array List, which one is better in the operations
 * performed
 */
public class ArrayTimeTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // private Node head;
        LinkedList<String> LS = new LinkedList<>();
        ArrayList<String> Arr = new ArrayList<>();

        //  List<String> ll = new LinkedList<E>();
        // LinkedList<String> ll = new Linkedlist<>();
        // List<String> Linkedl = (List<String>) new LinkedList();
        insertion(Arr);//efficient for data
        insertion1(LS);//not efficient for data
        deletion(Arr);//not efficient for data
        deletion1(LS);//not efficient for data
        search(Arr);//efficient for data
        search1(LS);//efficient for data

    }

    public static void insertion(List<String> L) {
        long startTime = System.currentTimeMillis();//use currenttimemillis to calculate the performance
        System.out.println(startTime);
        long i = 0;
        for (long x = i; x < 956782; x++) {

            L.add("Santosh");//Efficeint to add data

        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println(endTime - startTime + " MilliSeconds for inserting in an Array");
        // System.out.println(endTime - startTime + " MilliSeconds for inserting in an Linked List");

    }

    public static void insertion1(List<String> L) {
        long startTime = System.currentTimeMillis();//use currenttimemillis to calculate the performance
        System.out.println(startTime);
        long i = 0;
        for (long x = i; x < 956782; x++) {

            L.add("Santosh");//Efficeint to add data

        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        //System.out.println(endTime - startTime + " MilliSeconds for inserting in an Array");
        System.out.println(endTime - startTime + " MilliSeconds for inserting in an Linked List");

    }

    public static void deletion(List<String> L) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);

        long i = 98567456;

        for (long x = i; x > 0; x--) {

            L.removeAll(L);//Not at all eficient for deletion, but check with Linked List

        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println(endTime - startTime + " MilliSeconds for deleting in an Array");
    }

    public static void deletion1(List<String> L) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);

        long i = 98567456;

        for (long x = i; x > 0; x--) {

            L.removeAll(L);//Not at all eficient for deletion, but check with Linked List

        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println(endTime - startTime + " MilliSeconds for deleting in a LinkedList");
    }

    public static void search(List<String> L) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);

        long i = 9999;

        for (long x = i; x < 9999; x++) {

            L.get(9990);//EFFICIENT TO USE

        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println(endTime - startTime + " MilliSeconds for searching in an Array");

    }

    public static void search1(List<String> L) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);

        long i = 9999;

        for (long x = i; x < 9999; x++) {

            L.get(9990);//EFFICIENT TO USE

        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println(endTime - startTime + " MilliSeconds for searching in an LinkedList");

    }

}
