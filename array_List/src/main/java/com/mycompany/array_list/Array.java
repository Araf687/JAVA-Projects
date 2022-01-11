
package com.mycompany.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> ageList=new ArrayList<Integer>();
        ageList.add(12);
        ageList.add(13);
        ageList.add(15);
        ageList.add(17);
        
        ageList.set(0,29);
        System.out.println(ageList.size());
        for(int i:ageList){
            System.out.println(i);
        }
        
        
   
    }
}
