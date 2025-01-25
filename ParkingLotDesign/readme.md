**Question**
- In this practice session, we will be designing a multi-level parking system. This multi-level parking system would have a single entry point and a single exit point.

**Brief working of a parking lot**

- There would a parking lot that would have mutiple floors. 
- Each floor would have parking spaces.
- There would be an entry gate that would generate a entry bill.
- There would be an exit gate that would generate an exit bill.
- The payment method would be at the exit gate.
- A vechile would come into the parking systems entry gate.
- An entry ticket would be generated and a parking spot would be assigned to the vechile.
- The vechile after leaving the parking spot would go to the exit gate, where we will generate an exit bill.
- The exit bill would have the amount to be paid.
- There would be a payment method through which the vechile owner would pay and then vechile would exit from the parking system.
- There would be a top level class (parking manager class) that would manage the various activities in the parking lot.

**Identify the objects in the System**

The next step after brefily finding out how the system is going to work. The next step is to identify the objects that would be present in the system. One more thing to note is that is that when we are thinking about the objects that would be present in the system, we should always think from the bottoms up method. That would make the thinking and designing the system really easy. Even when we are designing the system in the UML diagram , we should design from the bottoms up method, where 

- Parking Spot.
- Parking levels.
- Entry Gate.
- Exit Gate.
- Entry Bill.
- Exit Bill.
- Vechile.
- Customer.
- Parking Lot Manager.

Now, lets dive into designing this in our UML (Unified modeling Language) design.
Aggregation represents the has-a relation.