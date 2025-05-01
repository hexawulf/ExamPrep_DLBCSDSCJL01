package codeSnippets;

// A simple Person class that supports cloning
public class Person implements Cloneable {
// Instance variables
    private String name;
    private int age;

// Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

// Getters and setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

// Override the clone method
    @Override
    public Person clone() {
        try {
// Call the clone method from the Object class// and cast the result to Person
            Person clonedPerson = (Person) super.clone();
            return clonedPerson;
        } catch (CloneNotSupportedException e) {
// This should never happen if we implement Cloneable
            System.out.println("Could not clone the Person object.");
            return null;
        }
    }

// For easy printing of Person objects
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

// Example usage
    public static void main(String[] args) {
// Create an original person
        Person original = new Person("John", 25);

// Clone the person
        Person clone = original.clone();

// Print both objects
        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);

// Verify they are different objects but with the same values
        System.out.println("Same object? " + (original == clone));
        System.out.println("Same name? " + (original.getName().equals(clone.getName())));
        System.out.println("Same age? " + (original.getAge() == clone.getAge()));
    }
}
