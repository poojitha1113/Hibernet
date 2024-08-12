import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class test {

        public static void main(String[] args){
            ArrayList<Integer> arr=new ArrayList<Integer>();
            arr.add(10);
            arr.add(2);
            arr.add(6);
            Map<Integer,Integer> map1=new HashMap();
            int sumValue=8;
            for(int i=0;i<arr.size();i++)
            {
                if(map1.containsKey(arr.get(i)))
                {
                    map1.put (arr.get(i),map1.get(arr.get(i)+1));
                }
                 else
                 {
                    map1.put (arr.get(i),1);
                 }
            }

//take unique elements from array or map keys
            int result=0;
            Map<Integer, Boolean> visited = new HashMap();
            for (Integer key: map1.keySet()) {
                if (!visited.get(key)){
                    if (map1.containsKey(sumValue-key)){
                        Integer value=map1.get(sumValue-key);
                        result+=(value*(value-1))/2;
                    }
                }
            }
}}
