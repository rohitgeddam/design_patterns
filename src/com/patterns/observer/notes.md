# Observer Pattern

- publisher + subscriber = observer pattern
    - publisher is called the subject
    - subscribers are called the observers

## defination
- The observer patterns defines a one-to-many dependency between bojects so that when one object changes state, all of its dependents are noti fied and updated automatically.

## The power of loose coupling
- when two objects are loosely coupled, they can interact, but have very little knowledge of each other.
- the observer pattern provides an object design where objects and observers are loosely coupled.

## why
- the only thing subject knows about an observer is that it implements a certain interface
- we can add new observers at any time.
- we never need to modify the subject to add new types of observers.
- we can reuse subjects or objservers independently of each other.
- changes tyo either the subject or an observer will not affect the other.