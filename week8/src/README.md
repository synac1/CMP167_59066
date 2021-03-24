# CREATING YOUR OWN ADT
Type/Class : Grouping Together Attributes and Behaviors
## Attributes
- Instance/Object variables

## Behaviours 
- Instance/Object Methods

**Class** :Writen description of the attributes and behaviours of an object
Analogy: Blueprint

**Object**: Instance of a class
Analogy: An object is the physical representation of the class
You can have many objects created based on one blueprint/ Class

**Constructor**: Special method that has the same name as the class, and its purpose is to 1. Initialize the instance variables
2. Instantiate the object (once it is called)

**setters**: AKA mutators. Their only task is to modify the value of the corresponding instance variables

**getters**: AKA accesors. Their only task is to return the value of the instance variables

**equals**: Returns true if the values of the instance variables are equals otherwise returns false

**toString**: Returns a string representation of the object



### Mammalia Class Natural Science 
#### Attributes: warm blood, milk, teeth, fur/hair
#### Behaviours: They eat, they grow, Speak

```
UML 
-----------------------
|        Human         |
-----------------------
| - age  : int         |
| - name : string      |
------------------------
| + Human()            |
| + Human(age: int )   |
| +getAge(): int       |
|+setAge(age: int):void|
------------------------
```
## Exercise
- Modify the Human class:
-- Create a setter and getter for the name instance variable
-- Create a constructor that takes in age and name
