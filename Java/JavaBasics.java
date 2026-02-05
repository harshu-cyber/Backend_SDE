// DAY 1

// This is a simple Java program that prints "Hello, World!" to the console.

/* public class JavaBasics {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
} */

//variable : A variable is a container that holds data values , For example:

/* public class JavaBasics {
    public static void main(String[] args) {
        int num1 = 10; // 'num1' is a variable of type int
        int num2 = 20; // 'num2' is another variable of type int
        int sum = num1 + num2; // 'sum' stores the result of adding
        System.out.println("Sum: " + sum);
    }
} */

//data types : Data types specify the type of data that a variable can hold. For example:

/* public class JavaBasics {
    public static void main(String[] args) {
        int integerVar = 42; // Integer data type
        double doubleVar = 3.14; // Double data type
        char charVar = 'A'; // Character data type
        String stringVar = "Hello, Java!"; // String data type
        boolean boolVar = true; // Boolean data type

        System.out.println("Integer: " + integerVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Character: " + charVar);
        System.out.println("String: " + stringVar);
        System.out.println("Boolean: " + boolVar);
    }
} */


//Day-02

//Operators : Operators are special symbols that perform operations on variables and values. For example:

//Arithmetic Operators : Arithmetic operators are used to perform basic mathematical operations. For example:

/* public class JavaBasics {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        int sum = a + b; // Addition
        int difference = a - b; // Subtraction
        int product = a * b; // Multiplication
        int quotient = a / b; // Division
        int remainder = a % b; // Modulus

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
 */

//Relational Operators : Relational operators are used to compare two values. For example:
/* public class JavaBasics {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // Relational Operators
        boolean isEqual = (x == y); // Equal to
        boolean isNotEqual = (x != y); // Not equal to
        boolean isGreater = (x > y); // Greater than
        boolean isLess = (x < y); // Less than
        boolean isGreaterOrEqual = (x >= y); // Greater than or equal to
        boolean isLessOrEqual = (x <= y); // Less than or equal to

        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Greater: " + isGreater);
        System.out.println("Is Less: " + isLess);
        System.out.println("Is Greater or Equal: " + isGreaterOrEqual);
        System.out.println("Is Less or Equal: " + isLessOrEqual);
    }
} */

//Logical Operators : Logical operators are used to combine multiple boolean expressions. For example:

/* public class JavaBasics {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical Operators
        boolean andResult = a && b; // Logical AND
        boolean orResult = a || b; // Logical OR
        boolean notResult = !a; // Logical NOT

        System.out.println("AND Result: " + andResult);
        System.out.println("OR Result: " + orResult);
        System.out.println("NOT Result: " + notResult);
    }
} */

//conditional Statements : Conditional statements are used to perform different actions based on different conditions. For example:
//if-else Statement :
/* public class JavaBasics {
    public static void main(String[] args) {
        int number = 15;

        // if-else Statement
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
} */


//if-else if :
/* public class JavaBasics {
    public static void main(String[] args) {
        int score = 85;

        // if-else if Statement
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
} */

//Ternary Operator : ( ?:)  : The ternary operator is a shorthand way of writing an if-else statement. For example:
/* public class JavaBasics {
    public static void main(String[] args) {
        int age = 18;

        // Ternary Operator
        String eligibility = (age >= 18) ? "Eligible to vote." : "Not eligible to vote.";
        System.out.println(eligibility);
    }
} */

//switch Statement : The switch statement is used to select one of many code blocks to be executed. For example:
/* public class JavaBasics {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        // switch Statement
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("Day: " + dayName);
    }
} */

//Day-03
//loop: Loops are used to execute a block of code repeatedly until a certain condition is met. For example:
//for Loop :
/*  public class JavaBasics {
    public static void main(String[] args) {
        // for Loop
        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}  */


//while loop :
/*  public class JavaBasics {
    public static void main(String[] args) {
        // while Loop
        System.out.println("Numbers from 1 to 5:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}  */



//do-while loop : do while loop is similar to while loop but it executes the block of code at least once before checking the condition. For example:
 /* public class JavaBasics {
    public static void main(String[] args) {
        // do-while Loop
        System.out.println("Numbers from 1 to 5:");
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}   */


//Classes and Objects : In Java, a class is a blueprint for creating objects. An object is an instance of a class. For example:
/* public class JavaBasics {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Camry", 2020);
        myCar.displayInfo();
    }
} */


//Abstraction : Abstraction is the process of hiding the implementation details and showing only the functionality to the user. For example:
/* public class JavaBasics {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Camry", 2020);
        myCar.startEngine(); // User only interacts with the startEngine method
    }
} */

//Encapsulation : Encapsulation is the process of wrapping data and methods into a single unit (class) and restricting access to some of the object's components. For example:
/* public class JavaBasics {
    public static void main(String[] args) {
        // Creating an object of the BankAccount class
        BankAccount myAccount = new BankAccount("John Doe", 1000);
        myAccount.deposit(500); // Accessing the deposit method
        System.out.println("Balance: " + myAccount.getBalance()); // Accessing the getBalance method
    }
}  */


//Inheritance : Inheritance is a fundamental object-oriented programming concept that allows a new class (called a subclass or child class) to inherit properties and behaviors (fields and methods) from an existing class (called a superclass or parent class). For example:
/* public class JavaBasics {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog myDog = new Dog("Buddy", 3);
        myDog.bark(); // Inherited method from the Animal class
    }
}  */


//Polymorphism : Polymorphism is the ability of an object to take on many forms. It allows a single interface to be used for a general class of actions. For example:
/* public class JavaBasics {
    public static void main(String[] args) {
        // Creating objects of the Animal class
        Animal myAnimal = new Animal("Generic Animal");
        Dog myDog = new Dog("Buddy", 3);
        Cat myCat = new Cat("Whiskers", 2);

        // Polymorphism in action
        myAnimal.makeSound(); // Output: Generic animal sound
        myDog.makeSound(); // Output: Woof!
        myCat.makeSound(); // Output: Meow!
    }
}  */


//Abstraction, Encapsulation, Inheritance, and Polymorphism are the four fundamental principles of object-oriented programming (OOP) that help in designing and organizing code in a way that promotes reusability, maintainability, and scalability. They allow developers to create modular and flexible code that can be easily extended and modified without affecting other parts of the program.


//Methods : Methods are blocks of code that perform a specific task. They are used to define the behavior of an object. For example:

//Array : An array is a data structure that can hold a fixed number of values of the same type. For example:
/* public class JavaBasics {
    public static void main(String[] args) {
        // Array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing array elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);
        System.out.println("Third element: " + numbers[2]);
        System.out.println("Fourth element: " + numbers[3]);
        System.out.println("Fifth element: " + numbers[4]);
    }
} */

//Need of Array : Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value. They provide a way to organize and manage data efficiently. For example, if you want to store the names of 5 students, you can use an array instead of declaring 5 separate string variables.
/* public class JavaBasics {
    public static void main(String[] args) {
        // Array of strings to store student names
        String[] studentNames = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Accessing array elements
        System.out.println("Student 1: " + studentNames[0]);
        System.out.println("Student 2: " + studentNames[1]);
        System.out.println("Student 3: " + studentNames[2]);
        System.out.println("Student 4: " + studentNames[3]);
        System.out.println("Student 5: " + studentNames[4]);
    }
} */


//Multidimensional Array : A multidimensional array is an array of arrays. It can hold multiple values in a tabular format. For example:
/* public class JavaBasics {
    public static void main(String[] args) {
        // 2D Array to store a matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements of the 2D array
        System.out.println("Element at (0,0): " + matrix[0][0]);
        System.out.println("Element at (1,1): " + matrix[1][1]);
        System.out.println("Element at (2,2): " + matrix[2][2]);
    }
}  */


//3D Array : A 3D array is an array of 2D arrays. It can hold multiple values in a three-dimensional format. For example:
/* public class JavaBasics {    
    public static void main(String[] args) {
        // 3D Array to store a cube of values
        int[][][] cube = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };

        // Accessing elements of the 3D array
        System.out.println("Element at (0,0,0): " + cube[0][0][0]);
        System.out.println("Element at (0,1,1): " + cube[0][1][1]);
        System.out.println("Element at (1,0,1): " + cube[1][0][1]);
        System.out.println("Element at (1,1,0): " + cube[1][1][0]);
    }
}   */


//Drawback of Array : One of the main drawbacks of arrays is that they have a fixed size. Once an array is created, its size cannot be changed. This means that if you need to add more elements than the initial size, you would need to create a new array and copy the existing elements to it, which can be inefficient in terms of time and memory. For example:


//Day-04