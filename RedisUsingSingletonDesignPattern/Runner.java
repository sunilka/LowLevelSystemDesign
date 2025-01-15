package RedisUsingSingletonDesignPattern;


public class Runner {
    public static void main(String args[]){
        Redis redis = Redis.getRedisInstance();
        redis.put(1, 10);
        System.out.println(redis.get(1));
        System.out.println(redis.get(20));
    }
}
