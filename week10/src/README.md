# Object oriented programming language
- Inheritance
- Abstraction
- Encapsulation
- Polymorphism 

# *equals*: Returns true if the values of the instance variables are equals otherwise returns false

##Syntax:

```
@Override
public boolean equals(Object obj){
	if(this == obj){
		return true;
	}
	if(obj instanceof NameOfClass){
		NameOfClass other = (NameOfClass) obj;
		return ( this.attr1 == other.attr1 && this.attr2 == other.attr2) ;
	}

	return false
}
```
#UML
```________________________
|       Book            |
------------------------
| -title: String
| -ibn  : int 
| -year_published : int 
| -price: double
| -author: String
| -pages: int
-------------------------
| +Constructor 
| +setters and getters
| +toString() : String
| +equals()
|------------------------
```
# Exercise for week10 
- Create a Movie class
- That has at least 4 instance variables
- Two constructors: default and overloaded one
- all setters and getter
- The toString method
- The equals method
- Two custom methods
- A static variable to keep track of the amount of movies created