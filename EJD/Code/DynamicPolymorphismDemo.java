public class DynamicPolymorphismDemo {
    public static void main (String[] args) {
        /* Creating a super class reference variable, animal. */
        Animal animal;
        animal = new Animal(); 
        animal.speak();
	    // Creates Cat object
        Cat cat = new Cat();
        // Cat object is assigned to animal 
        animal = cat;    
        // animal calls speak method of cat.
        animal.speak();          
    }
}
