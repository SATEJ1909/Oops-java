1. What is Object Cloning in Java?
Answer:
Object cloning is the process of creating an exact copy of an object in Java. It’s done using the clone() method from the Object class. The object must implement the Cloneable interface, otherwise, a CloneNotSupportedException is thrown.

2. What is the purpose of the Cloneable interface?
Answer:
Cloneable is a marker interface (contains no methods). It signals to the JVM that the clone() method is allowed to be used on the class. If a class doesn’t implement Cloneable, calling clone() on its object will throw CloneNotSupportedException.

3. What is the difference between Shallow Cloning and Deep Cloning?
Feature	Shallow Cloning	Deep Cloning
Copy type	Copies fields as-is	Copies fields and referenced objects too
Nested objects	Same reference (shared)	New copies (independent)
Use case	When object is simple	When object contains mutable references
Example	super.clone() only	Also manually clone nested objects

4. How do you perform Deep Cloning in Java?
Answer:
You must override clone() and manually clone all referenced objects. For example:

java
Copy
Edit
public Object clone() throws CloneNotSupportedException {
    Employee cloned = (Employee) super.clone();
    cloned.address = new Address(this.address.city); // deep copy of address
    return cloned;
}
Alternatively, you can use:

Serialization & Deserialization

Apache Commons Lang SerializationUtils.clone()

5. Why does the clone() method throw CloneNotSupportedException?
Answer:
clone() throws CloneNotSupportedException because not all classes are meant to be cloneable. Java uses the Cloneable marker interface to restrict access to clone(). If a class doesn’t implement Cloneable, invoking clone() on it will throw this exception.

6. Can we clone an object without implementing the Cloneable interface?
Answer:
Technically, yes, but calling clone() will throw CloneNotSupportedException unless the class implements Cloneable. Alternatives:

Copy constructor

Custom method to copy values

Serialization

7. What are the alternatives to using clone() in Java?
Answer:

Copy constructors: Pass another object and copy fields manually.

Factory methods: Static methods returning a copy.

Serialization/Deserialization

Cloning libraries like Apache Commons

8. Is clone() a deep or shallow copy by default?
Answer:
By default, clone() performs a shallow copy. It copies primitive fields and object references, not the actual nested objects.

9. What are some disadvantages of using clone()?
Answer:

Not type-safe (returns Object)

Requires exception handling

Shallow copy by default

Inconsistent behavior across class hierarchies

Breaks encapsulation by allowing object duplication

10. How does object cloning relate to the Prototype Design Pattern?
Answer:
The Prototype Design Pattern uses object cloning to create new objects by copying a prototype. This is useful when creating a new object is expensive or complex, and a copy of an existing one suffices.