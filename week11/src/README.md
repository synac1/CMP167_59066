# Inheritance 
Inheritance is when a child class inherits all the attributes and behaviours of the parent class
- Parent class, aka  Base class or superclass
- Child class,  aka subclass
- One child class can only extend from parent class
- The keyword for inheriting  **extends**
- In order to access to the attributes and behaviours from the parent class you use the keyword **super**

##Syntax

```
public class NameOfChildClass extends NameOfParentClass{

}
```

## Constructor
```
public NameOfChildClass(){
	super();
	...
}
```

## Accessing the toString Method of parentClass
```
super.toString();
```

Company
- 3 attributes,  constructor, setters getters, equals method, custom method
Department 
- 1 attribute
- Override parent custom method

## Week 11 Exercise
Create a parent class and a child class and override custom methods from the parent class