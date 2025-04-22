import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("english",20);
        map.put("hindi",24);
        map.put("maths",90);
        //how many key value pairs in map
        System.out.println(map.size() +" is size of map"); //O/P 3 is size of map

        //find marks of respective subjects
        System.out.println(map.get("english"));
      /* output 20*/

        //print map
        System.out.println(map);
        /* output {maths=90, english=20, hindi=24}*/
       //another way of printing map
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        /* output maths 90
english 20
hindi 24*/

        //putting new values in map
        map.put("science",100);


        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey() +  " " + entry.getValue());
        }
        /* output maths 90
science 100
english 20
hindi 24 */
        //add duplicate keys
        map.put("maths",100);

        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey() + " :" + entry.getValue());
        } //now you will see that value of maths key got updated
        /* output maths :100
science :100
english :20
hindi :24*/

        //no  key- not allowed
        //   map.put(,900);
        //add blank value in key
        map.put(" ",900);
        for(Map.Entry entry :map.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
//additional value in this output  --900
        /* output --900
maths--100
science--100
english--20
hindi--24 */
        //add null value in key

        map.put(null,800);
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+ "------------"+ entry.getValue());
        }
        /* output ------------900
null------------800
maths------------100
science------------100
english------------20
hindi------------24 */

        map.put(null,8006);
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+ "****"+ entry.getValue());
        }

        /* output  ****900
null****8006
maths****100
science****100
english****20
hindi****24 null value got updated when we added another null key pair value
*/

        //remove a key value pair
        map.remove("hindi");

        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+ "&& " +entry.getValue());
        }
        /*output  && 900
null&& 8006
maths&& 100
science&& 100
english&& 20 */
        //check if a particular key is present in map
        System.out.println(map.containsKey("hindi"));
//output false

        //manipulate map based on if a particular key is present
        if(map.containsKey("maths")){
            map.put("trignometry" ,900);
        }
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey() +"-----"+entry.getValue());
        }
        /*-----900
null-----8006
trignometry-----900
maths-----100
science-----100
english-----20*/
        //manipulating based on a key
        if(map.containsKey("maths")){
            map.put("maths", (map.get("maths")+ 200));
        }
for(Map.Entry entry:map.entrySet()){
    System.out.println(entry.getKey() + "" + entry.getValue());
}
/* output 900
null8006
trignometry900
maths300
science100
english20*/
        //checking if particular value is present in map
        System.out.println(map.containsValue(300)); //o/p true

        //find keys
        Iterator itr=map.keySet().iterator();
        while(itr.hasNext()){
            System.out.println( itr.next());
        }
        /*output null
trignometry
maths
science
english */
    }
}
