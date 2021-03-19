# Decorator pattern

- Inheritance is not the best way to reuse code
    - when we inherit bu subclassing that behaviour is set statically at compile time.
    - try to extend behaviour using composition, for dynamic changes at runtime.
- You should not need to touch the code which is already written by someone to extend the system
- Code should be closed for changes but open for extension.


## Design Principle
- Classes should be open for extension but closed for modification.


## problem with inheritance
- we get class explosion, rigid designs, or we add functionality to base class that isn't appropriate for some of the subclass

# Decorators
- think of decorators as wrappers
- decorate type must mirror the object it is decorating. ( same type )
- the decorator adds its own behaviour either before and/or after delegating to the object it decorates to do the rest of the job.
- decorators implement the same interface or abstract class as the component they are going to decorate.
- the concrete decorator has an instance variable for the thing it decorate ( the component the decorator wraps )

- decorator pattern provides alternative to subclassing for extending behaviour.
- decorator patterns involves a set of decorator classes that are used to wrap concrete components.

## Formal Defination
- The decorator pattern attaches additional responsibilities to an object dynamically,  Decorators provide a flexible alternative to subclassing for extending functionality.


## Real world Java decorator pattern
### Used heavily in java I/O