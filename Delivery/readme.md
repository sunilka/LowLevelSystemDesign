Problem Statement:

Imagine a delivery executive called Aman standing idle in Koramangala somewhere when suddenly his
phone rings and notifies that he’s just been assigned a batch of 2 orders meant to be delivered in the
shortest possible timeframe.
All the circles in the figure above represent geo-locations :
● C1 : Consumer 1
● C2 : Consumer 2
● R1 : Restaurant C1 has ordered from. Average time it takes to prepare a meal is pt1
R2 : Restaurant C2 has ordered from. Average time it takes to prepare a meal is pt2
Since there are multiple ways to go about delivering these orders, your task is to help Aman figure out
the best way to finish the batch in the shortest possible time.
For the sake of simplicity, you can assume that Aman, R1 and R2 were informed about these orders at
the exact same time and all of them confirm on doing it immediately. Also, for travel time between
any two geo-locations, you can use the haversine formula with an average speed of 20km/hr (
basically ignore actual road distance or confirmation delays everywhere although the real world is
hardly that simple ;))

Low Level Design Components:

First we design the low level components of the system. The components that we have identified in the system are:

1) Customer class
This would have the attributes that would belong to the customers.

2) Customer manager class:
This would be a class that would be used for managing the customers. This class would include methods to get customers information from the pool of customers that have registered, method to get information about a particular customer etc..

3) Delivery partner class:
This would have the attributes that would belong to the delivery partners.

4) Delivery partner manager class:
This would be a class that would be used for managing the delivery partners. This class would include methods to get delivery partners 
information from the pool of delivery partner that have registered, method to get information about a particular delivery partner etc..

5) Delivery strategy interface:
This would be an interface that would be implemented by the concerte class for the various delivery strategies.

6) Greedy delivery strategy class:
This is a concrete class that would hold the greedy algorithm to solve the problem.

7) Delivery context class:
This would be the context holder class for the vairous strategies that we might implement for the delivery system.

8) Location class:
This would be a class that would hold the location information like the latitude and the logitude.

9) Order class:
This class would hold information releated to the orders that were places.

10) Order Manager class:
This would be a class that would be used for managing the orders. This class would include methods to register an order, get orders information
using the order ID etc..

11) Restaurant class:
This would be a class that would hold the restaurant infromation.

12) Restaurant manager class:
This would be a class that would be used for managing the pool of resturants and would have method to register a resturant, get restaurant information based on the restaurant ID etc..

13) Delivery Optimizer class:
The delivery optimizer class would be the top most class which would hold the main runner as well.


Design pattern used for implementation:


1) Singleton Design Pattern

- Purpose: 
The Singleton Design Pattern ensures that a class has only one instance and provides a global point of access to that instance. This is particularly useful for managing shared resources where multiple instances could lead to inconsistency or unnecessary overhead.

- Implementation:
We have applied the Singleton Pattern to the following classes:
    1) CustomerManager
    2) DeliveryPartnerManager
    3) OrderManager
    4) RestaurantManager

- Reason:
These classes manage global state or resources that should be accessed consistently throughout the system. For example, the CustomerManager keeps track of all customers, and we only need a single instance to handle this data across the entire system. Similarly, for managing the pool of delivery partners, orders, and restaurants, a single instance ensures that all interactions with these resources are centralized and synchronized.

- Implementation Details:
Each of these manager classes will have a static instance that is created lazily (only when first accessed).
The constructor of the manager classes is made private to prevent external instantiation, enforcing the singleton nature.

Benefits:

1) Consistency: Only one instance is responsible for managing each resource, ensuring that all components work with a single, consistent state.
2) Efficiency: Reduces the overhead of creating multiple instances of these managers, making resource management more efficient.
3) Global Access: Provides a global point of access for managing these resources without the need to pass instances explicitly.

2) Strategy Design pattern:

- Purpose: 
The Strategy Design Pattern allows you to define a family of algorithms, encapsulate each one, and make them interchangeable. This enables the algorithm to be selected at runtime, allowing the system to be flexible and adaptable to changing requirements.

- Implementation:
We have used the Strategy Pattern to implement various delivery optimization strategies. The core idea is to encapsulate different delivery algorithms and let the system choose the appropriate strategy based on the context.
Specifically, the GreedyDeliveryStrategy is one example of a strategy used to assign delivery partners to orders based on the nearest available partner. Other strategies, such as OptimalRoutingStrategy or RandomizedDeliveryStrategy, could be added in the future without modifying the existing code.

- Structure:

1) DeliveryStrategy Interface: 
Defines a common interface for all strategies, ensuring that they can be used interchangeably in the system.

2) GreedyDeliveryStrategy: 
A concrete implementation of the DeliveryStrategy interface that uses a greedy algorithm to optimize the assignment of orders to delivery partners.

3) DeliveryContext: The context class that interacts with the strategy. It allows the delivery optimization algorithm to be chosen at runtime and delegates the task to the selected strategy.

- Benefits:
1) Flexibility: New strategies can be easily introduced without modifying existing code. For example, switching from a greedy algorithm to a more advanced machine learning-based strategy can be done by implementing a new strategy and updating the context.
2) Extensibility: The system can adapt to different types of delivery scenarios. As business requirements change, new strategies can be created and plugged into the system seamlessly.
3) Separation of Concerns: The DeliveryContext handles the orchestration, while each strategy focuses on a specific algorithm, allowing the system to follow the open/closed principle (i.e., open for extension, closed for modification).

Advantages of This Design:

- Modular and Scalable: The system can easily handle different delivery strategies by implementing new classes that conform to the DeliveryStrategy interface.
- Separation of Concerns: Each component is focused on a specific responsibility (e.g., managing customers, orders, delivery partners).
- Flexibility: The DeliveryContext allows the dynamic switching of delivery strategies at runtime without changing the rest of the system.

This design is well-structured for future extensibility, allowing you to introduce new delivery strategies, handle more complex business logic, and add more features as the system evolves.

Future Improvements (Could not implement due to time constraints :)):

1) Add more strategies like TSP (Travelling salesman Problem) to find the best route.
2) Add loggers in the code.
3) Improved error handling.
4) Automated tests.

