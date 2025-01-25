- SOLID principles are used to write code in such a manner that the code is extensible , maintainbale and scaleable.
- The abbrevation of the SOLID principles is as follows:

1) S -> Single responsibilty for change.
2) O -> Open/Closed principle.
3) L -> Liskov's Substitution principle.
4) I -> Interface Segregation principle.
5) D -> Dependency Inversion principle.

**Explanation for the above**

1) S -> Single responsibility principle:

- The single responsibility principle states that a class should have a single reasons for change.
- An example here would be is a baker, a baker should be reposible only for baking and should not be responsible for maintaining the inventory.

class BreadBaker(){
    public void bake(){
        System.out.println("Baker is baking")
    }
}

2) O -> Open/Closed principle:

- Open closed principle states that a class should be open for extension but closed for modification.
- It means that you should be able to extend the base class without modifying it.

class Vechile(){
    public void vechileMethod(){
        System.out.println("Inside the Base class Vechile method");
    }
}

class Car extends Vechile(){
    public void vechileMethod(){
        System.out.println("Inside the child class of the car");
    }
}

3) L -> Liskov's Substitution principle:

- The liskov's substitution priciple says that if A is base class and B is a child class of A, then we should be able to replace the object of B with the object of A and the system should not break with this replacement.
- Classic example for this is the Rectangle class would be the parent class and the child class would be the square class. A square is a rectangle with equal height and width.

class Vechile(){
    public void vechileMethod(){
        System.out.println("Inside the Base class Vechile method");
    }
}

class Car extends Vechile(){
    public void vechileMethod(){
        System.out.println("Inside the child class of the car");
    }
}

4) I -> Interface Segregation Principle:

- Interface segregation principle says that no child class should be forced to implement any method that it would not use/ require.
- Consider that we have a  menu card. We can an interface Menu that has the methods to get the menu list for veg items and another method to get the menu list of non veg items. 
- And then we have a class that is VegMenu class that implements this interface, then this class would not have anything to do with the get menu list for non veg items.

5) D -> Dependency Inversion principle:

- Dependency Inversion principle states that we can high level objects should depend on abstartions and not concrete implemetations.    