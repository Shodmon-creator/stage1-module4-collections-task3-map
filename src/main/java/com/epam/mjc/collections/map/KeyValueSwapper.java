package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String,Integer> swappedMap=new HashMap<>();
        Map<String,Integer> valueCounts=new HashMap<>();
        for (Map.Entry<Integer,String>entry:sourceMap.entrySet()){
            String value= entry.getValue();
            Integer key=entry.getKey();

            if (valueCounts.containsKey(value)){
                int existingKey=valueCounts.get(value);
                if (existingKey<key){
                    continue;
                }else {
                    swappedMap.remove(value);
                }
            }
            swappedMap.put(value,key);
            valueCounts.put(value,key);

        }


        return swappedMap;
    }
}
