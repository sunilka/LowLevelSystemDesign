- Singleton design pattern is a creational design pattern. 
- Singleton design pattern is used to create only object in the whole program.
- To practice the singleton design pattern, we will implement the redis cache system.
- We will also make this singleton class thread safe using the syncronized keyword in java.
- The syncronized keyword is used to prevent race conditions in the case of multiple threads.
- The redis instance should be a single instance in the whole program.
- The clients would use this interface to put/retrive elements from the cache.