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
public class JavaBasics {
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
}