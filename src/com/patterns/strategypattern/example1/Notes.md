## Strategy Pattern

- **Identify the aspects of your application that vary and separate them from what stay the same**
- **take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don't.**
- **Program to an interface, not an implementation.**

- use interface to implemenet behaviours. eg. FlyBehavior, QuackBehavior
- each behaviour can be a comcrete class eg. FlyWithWings which can implement the above interfaces.
- we know that fly() and quack() are the parts of the duck class that vary across ducks.
- to separate these behaviours from the duck class, we'll pull both methods out of the dcuck class and create a new set of classes to represent each behaviour.

- the key is to deligate duck's flying and quacking behaviour, instead of using quacking and flying methods defined in the duck class.