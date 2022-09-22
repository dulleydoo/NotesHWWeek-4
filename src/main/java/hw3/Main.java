package hw3;
//-Encapsulation is keeping data hidden from other users by making them private.
//-When a variable is public, it can be accessed and changed through the variable itself.
//Encapsulating it and making it private will force the user to call its setter and getter
//in order to access it.

public class Main {
    public static void main(String[] args) {

        //PUBLIC
        //we created an object called math and named it math
//        Person math = new Person("Karem");
        //we called it and it prints out math
//        System.out.println(math.name);
        //since its public we used the name variable to easily access the object and change the name
//        math.name = "Aqil";
        //Now the name of object prints out as english when it was originally math
//        System.out.println(math.name);

        //Getter and Setter
        Person math = new Person("Karem");
        //in order to call name we had to use the getName method because its private
        System.out.println(math.getName());
        //in order to change name we have to use the setName method because its private
        math.setName("Aqil");
        System.out.println(math.getName());





    }
}
