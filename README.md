# HackerRank Java Practice 
This README contains the Java problems practiced on HackerRank, along with the core logic and important points to remember.

## 1. Java Stdin and Stdout I
### 1. Logic Explanation
Take three integer inputs using `Scanner` and print each value on a separate line.
### 2. Important Notes / Tricks
* Use `Scanner` to take input.
* `nextInt()` is used for integer input.
* `System.out.println()` prints each value on a new line.
## 2. Java Stdin and Stdout II
### 1. Logic Explanation
Read three different types of input: an integer, a double, and a String. Then print them in the required order.
`nextInt()` → integer
`nextDouble()` → decimal number
`nextLine()` → String
After reading the double, an extra `nextLine()` is required to consume the leftover newline before reading the actual String.
### 2. Important Notes / Tricks
* After `nextInt()` or `nextDouble()`, remember the newline issue with `nextLine()`.
## 3. Java If-Else
### 1. Logic Explanation
Check whether the given number is odd or even and then decide whether it is **Weird** or **Not Weird**.
Rules:
* Odd → Weird
* Even and between 2–5 → Not Weird
* Even and between 6–20 → Weird
* Even and greater than 20 → Not Weird
### 2. Important Notes / Tricks
* `N % 2 != 0` → odd.
* `N % 2 == 0` → even.
* Use `&&` when multiple conditions must be true.
## 4. Java Output Formatting
### 1. Logic Explanation
Read a String and an integer three times and print them in a properly formatted table.
The String is left-aligned and the integer is displayed using three digits.
### 2. Important Notes / Tricks
* `printf()` is used for formatted output.
* `%-15s` → String with width 15 and left alignment.
* `%03d` → integer displayed with 3 digits.
* Example: `7` becomes `007`.
## 5. Java Loops I
### 1. Logic Explanation
Read an integer `N` and print its multiplication table from 1 to 10. The loop starts from `1` and continues until `10`.
### 2. Important Notes / Tricks
* Basic pattern:
`for(initialization; condition; increment)`
## 6. Java Loops II
### 1. Logic Explanation
Generate a mathematical series using `a`, `b`, and `n`.
The series starts with `a`.
At every step, a power of 2 multiplied by `b` is added to the previous value.
The powers are:
`1, 2, 4, 8, 16...`
For example:
`a + b`
`a + b + 2b`
`a + b + 2b + 4b`
and so on.
### 2. Important Notes / Tricks
* Use a nested loop:
  * Outer loop → number of test cases.
  * Inner loop → generate the series.
* Keep a variable for the current result.
* Start the power value as `1`.
* Double it after every iteration using `p *= 2`.
## 7. Java Datatypes
### 1. Logic Explanation
Check whether a given number can fit into Java's integer data types:
* `byte`
* `short`
* `int`
* `long`
Compare the input number with the minimum and maximum range of each datatype.
### 2. Important Notes / Tricks
Useful Java constants:
* `Byte.MIN_VALUE`
* `Byte.MAX_VALUE`
* `Short.MIN_VALUE` etc...
## 8. Java End-of-file
### 1. Logic Explanation
Read input lines until there is no more input.
A counter keeps track of the line number. Each line is printed together with its corresponding line number.
### 2. Important Notes / Tricks
* `hasNext()` checks whether more input exists.
Basic idea:
`while(input exists) → read line → print line number`
## 9. Java Static Initializer Block
### 1. Logic Explanation
Take the values of `B` and `H` inside a static initializer block.
Before calculating the area, check whether both values are positive. If both are positive:
`area = B × H`
If either value is zero or negative, set the flag to `false` and print the required exception message.
### 2. Important Notes / Tricks
* A `static` block executes automatically when the class is loaded.
* It executes **before `main()`**.
## 10. Java Hello World
### 1. Logic Explanation
Print two messages:
`Hello, World.`
`Hello, Java.`
### 2. Important Notes / Tricks
* Every Java program starts execution from `main()`.
