package org.vivek.MapClass;

import java.util.*;

public class map01 {
    //this map is not part of collection and doesnt implements collection interface
    //bcoz it doesnot store single Entity unlike others.
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map);
        System.out.println(map.getOrDefault("vivek", 0)); // returns default value if no value exists
        //tis is useful in case of getting the data from the object stored in map
        //eg. map.getOrDefault("SE2" , 0).getAll();
        //incase if no such oject of se2 exist calling getAll on the null object causes nullptr exception
        System.out.println(map.containsKey("two"));
        System.out.println("contains value" + map.containsValue("3"));
        System.out.println("isempty" + map.isEmpty());
        System.out.println("contsains value 3:" + map.containsValue(3));


        //using hashmaps for creating the hashmaps
        Map<Integer, List<Integer>> adj  = new HashMap<>();
        //5 - <6,7,8>
        if(adj.containsKey(5) == false){
            adj.put(5, new ArrayList<>());
            adj.get(5).add(6);
            adj.get(5).add(7);
            adj.get(5).add(8);
            System.out.println(adj);
        }


        //map is not a collection so it is not iterable to iterate over map we need to convert it into set
        Set<Map.Entry<String ,Integer>> entryset = map.entrySet();
        for(Map.Entry<String , Integer> entry : entryset){
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

        //or get all the keys in a set
        Set<String> keyset = map.keySet();
        for(String k : keyset){
            System.out.print(k + " " + map.get(k));
        }

    }
}
