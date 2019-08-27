package basic;

import java.util.ArrayList;

public class Exam1 {


    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(70);
        arrayList.add(90);
        arrayList.add(60);
        arrayList.add(85);

        System.out.println(arrayList);

        for (int i = 5; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("john");
        stringArrayList.add("koko");
        stringArrayList.add("kim");
        stringArrayList.add("kylie");
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));


        }

    }
}