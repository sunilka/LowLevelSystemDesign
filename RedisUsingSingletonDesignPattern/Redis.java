package RedisUsingSingletonDesignPattern;
import java.util.*;

public class Redis {
    public static Redis redis;
    private HashMap<Integer, Integer> hashMap;
    private Redis(){
        hashMap = new HashMap<>();
    }

    public static synchronized Redis getRedisInstance(){
        if(redis==null){
            redis = new Redis();
            return redis;
        }
        return redis;
    }

    public void put(int key, int value){
        this.hashMap.put(key,value);
    }

    public String get(int key){
        if(this.hashMap.containsKey(key)){
            return this.hashMap.get(key).toString();
        }
        else{
            return "Could not find the key in the cache";
        }
    }
}
