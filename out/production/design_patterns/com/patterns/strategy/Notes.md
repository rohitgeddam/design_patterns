## Strategy Pattern

- **Identify the aspects of your application that vary and separate them from what stay the same**
- **take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don't.**
- **Program to an interface, not an implementation.**

- use interface to implemenet behaviours. eg. FlyBehavior, QuackBehavior
- each behaviour can be a comcrete class eg. FlyWithWings which can implement the above interfaces.
- we know that fly() and quack() are the parts of the duck class that vary across ducks.
- to separate these behaviours from the duck class, we'll pull both methods out of the dcuck class and create a new set of classes to represent each behaviour.

- the key is to deligate duck's flying and quacking behaviour, instead of using quacking and flying methods defined in the duck class.

### Points
- HAS-A can be better than IS-A
    - The HAS-A relationship is an interesting one: each duck has a FlyBehaviour and a QuackBehaviour to which it delegates flying and quacking
    - when you put two classes together like this you're using composition. Instead of inheriting their behavior the ducks get their behaviour by being composed with the right behavior object.
    
#### Favour composition over inheritance
- It gives us more flexibility, not only does it let you encapsulate a family of algo into their own set of classes, but it also lets you change behaviour at runtime    


## Finally Defination
- Strategy pattern 
    - defines a family of algorithms, encapsulates each one, and make them interchangable, strategy lets the algorithm vary independently from clients that use it.
- OO principle
    - Encapsulate what varies
    - Favor composition over inheritance
    - program to interface, not implementation