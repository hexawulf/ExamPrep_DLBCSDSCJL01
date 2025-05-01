package codeSnippets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerSortExample {
    
    public static void main(String[] args) {
        // Create a list of customers
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Smith", "John"));
        customers.add(new Customer("Jones", "Bob"));
        customers.add(new Customer("Smith", "Alice"));
        customers.add(new Customer("Brown", "Sarah"));
        
        // Print unsorted list
        System.out.println("Unsorted Customers:");
        for (Customer c : customers) {
            System.out.println(c);
        }
        
        // Sort the list using our compareTo method
        Collections.sort(customers); // internally calls compareTo method of Customer class
        
        // Print sorted list
        System.out.println("\nSorted Customers (by last name, then first name):");
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}

class Customer implements Comparable<Customer> { // non-public class. Only one public class in a file allowed.
    private String name;        // Last name
    private String firstname;   // First name
    
    public Customer(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
    }
    
    @Override
    public int compareTo(Customer c) {
        if (name.equals(c.name))
            return firstname.compareToIgnoreCase(c.firstname);
        else
            return name.compareToIgnoreCase(c.name);
    }
    
    @Override
    public String toString() {
        return name + ", " + firstname;
    }
}