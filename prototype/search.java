import java.util.HashMap;

public class search{
    public static int searchHash(HashMap<String, Integer> map, String key){
        try{
            return map.get(key);
        } catch (Exception e){
            System.out.println("An Error Occuered");
            e.printStackTrace();
            return -1;
        }
    }
}