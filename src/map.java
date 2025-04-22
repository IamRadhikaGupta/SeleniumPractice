import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.*;

public class map {
    public static void main(String[] args) {
      Map<String,String> map1=new Hashtable<String,String>();
        Hashtable<Character,Integer> map11=new Hashtable<Character,Integer>();
      map1.put("name","radha");
      map1.put("colr","pink");
        map1.put("colr","red");
      System.out.println(map1);
      map11.put('c',9);
      map11.put('r',2);
      map11.put('r',90);

        System.out.println(map11);
      }


}
