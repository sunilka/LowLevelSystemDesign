- In this practice session we are going to design BookMyShow.
- First let us look at the break working of the system.
- BookMyShow is an application that users would use to book for movies, shows etc.. For this example let us consider that bookmyshow application is used for movie ticket booking only.
- The application would list down all the shows that are available. But to show this we would take in the city or location, based on the city or location we would show in the shows that are available.
- The user would select the moive that he wants to making a book for in a particular theater and screen.
- We he chooses a movie in a particular theater and screen then we would be showing him the seats that are available in the screen.
- The user would choose a seat/s that he wants to book (if available) and the moves to the payement.
- Once the payment is complete the user would receive a bill. 
- This would end the user booking journey.
- One this that is important to consider here is that multiple people can be looking to book the same seat and the our system should handle this concurrency issue properly.

Let us look at the application that we are designing from the application stand point. And identify the object that would be present in the system. For any LLD question we would start thinking using the bottom up approach. The objects that would be present in the system is as follows:

1) Seat.
- The seat would have the availability status. We can have an Enum to represen the availability status.
- We can associate the cost of the seat in the seat class itself.

2) SEAT_STATUS enum
- Will be used to represent the status of the seat as booked, available.

3) Screen.
- Screen would be the holding the seats. 

4) Show.
- Show would have information about the movie that it is going to play.
- Show would have the information about the screen in which it is going to be played.
- Show would have the information about the show start time.

4) Movie.
- Class that would hold the informatino about the movie.

5) Theater.
- Theater would hold in the information about the screens it has.
- Theater would have the information about its location etc..

6) User.
- Class that would hold the information about the registered users.

7) Payment.
- Payment class would hold in the methods that are needed to do the payment processing.

We may add in more classes to this list going forward but lets formulate this objects with the attributes and the methods that they will be having using the UML diagram. Now lets switch over to the UML diagram.