import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTablePractice {
    public static void main(String[] args) {
        Hashtable<String,Integer> table=new Hashtable();
        table.put("maths",90);
        table.put("science",100);
        table.put("physice",200);

        //Retrieve values from table
        System.out.println(table.get("maths")); //o/p- 90

        // table size
        System.out.println(table.size());//3

        //print table
        System.out.println(table);/* */
        /*{science=100, maths=90, physice=200} */

        //another way of printing table
        for(Map.Entry entry:table.entrySet()){
            System.out.println(entry.getKey()+ "--------" + entry.getValue());
        }
        /*science--------100
maths--------90
physice--------200 */

        //blank value in key
        table.put(" ",90);
        System.out.println(table);
        /* { =90, science=100, maths=90, physice=200}
         */

        //no  key- not allowed
     //   table.put(,900);

        //null value in key
      //  table.put(null,80);
       // System.out.println(table);
       /* output Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
	at java.base/java.util.Hashtable.put(Hashtable.java:482)
	at HashTablePractice.main(HashTablePractice.java:39)*/

        //null value in value

      //  table.put("trignometry",null);
       /* Exception in thread "main" java.lang.NullPointerException
        at java.base/java.util.Hashtable.put(Hashtable.java:477)
        at HashTablePractice.main(HashTablePractice.java:47)*/

        for(Map.Entry entry:table.entrySet()){
            System.out.println(entry.getKey()+"------"+entry.getValue());
        }
        /* output- ------90
science------100
maths------90
physice------200*/

        //remove key value pair
        table.remove("maths");
        for(Map.Entry entry:table.entrySet()){
            System.out.println(entry);
        }
        /* =90
science=100
physice=200 */
        table.remove(" ",90);

        //print all the keys of table
        System.out.println(table.keySet());
//[science, physice]

        //table.keySet gives a set

      //  Iterator itr=Iterator.tab

Iterator itr=table.keySet().iterator();
while(itr.hasNext()){
    System.out.println(itr.next());
}

//verify if table contains particular key
        System.out.println(table.containsKey("maths")); //false

        //manipulate map
        if(table.containsKey("science")){
            table.put("science",table.get("science")+1);
        }

        for(Map.Entry entry:table.entrySet()){
            System.out.println(entry.getKey()+ "------"+ entry.getValue());
        }


/* science------101
physice------200*/

    }

}
