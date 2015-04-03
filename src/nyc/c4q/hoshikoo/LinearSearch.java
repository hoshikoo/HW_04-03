package nyc.c4q.hoshikoo;


import java.util.ArrayList;

public class LinearSearch {


    public static int search(ArrayList <Integer> alist, int x ){

        //return the number of index when you find it in the text
        //for (new arrayList:alist){if (alist contains x){return the index}}
        // if not return -1;
        for (Integer index :alist) {
            if(alist.contains(x)){

                return alist.indexOf(x);

            }else{
                return -1;
            }

        }

        return x;
    }



    public static void main(String[] args) {

        ArrayList <Integer> alist = new ArrayList<Integer>();
        alist.add(3);
        alist.add(45);
        alist.add(1);
        alist.add(2);
        alist.add(99);
        System.out.println(alist);

        System.out.println(search(alist, 3));

    }
}
