# Java-000-Intro

### Requirements
- Intellij IDE: https://www.jetbrains.com/idea/
- A Pull Request of this Repository
- Clone of this repository to your Desktop
- Java JDK 8 used.

## Understanding 

Video: TODO-Add Video Link or embed Video here

Computer reads one line at a time; **from top to bottom, left to right**.

The computer is case sensitive so an uppercase **M** and an lower case **m** are totally different things.

A program entry point or starting location would be where the function named **main** is located.
```java
public static void main(String[] args) {
        
}
```
Note: Make sure to only have one main Entry point

**Comments** are not read by the computer. In short, it is notes that the programmer left for himself or others.
```java
/*
 * This is a block Comment 
 * To start, it requires /*
 * To close it, it requires */
 */
class HelloWorldApp {
    public static void main(String[] /* Block comments can be within code */ args) {
        System.out.println("Hello World!"); // Comment in code. Affects all words after //
    }
}
```

**OutPut**: There is many output streams such as the screen, some file and the **Console** where we display information for the user.

In the case of java, you can interact with the console by using ***System.out.println("Hello World!");*** function.

Try the following:
```java

System.out.println("Hello World!"); // This would print Hellow World! and then bring the cursor to the next line.
System.out.print("hey earth!");     // This would print hey earth! and then bring the cursor to the next line.

```

**Class**: More on this later, for now understand that all our code needs to be inside a class in a Object-Oriented-Programming design.

**Last Info**: 
1. All Code Must be In Functions.
2. All Functions must be in a Class.
3. The Start of your application is the main function.
4. Make the sure any paranthese are closed probably.
5. Every line of code requires a semi colon at the end to let the computer know the command is finished.

### Assignment

Make sure to add an empty line to seperate each picture.

Create a class called "Program" and add the main entry function in it.

Now, Start by printing to the Screen:
```java
Hello, world!
```

Now let's add some shapes, don't forget an empty line in between:
```java
* * * * *
 * * * * *
* * * * *
 * * * * *
* * * * *
```
```java
* * * * *
*       *
*       *
*       *
* * * * *
```
```java
* * * * *
 *     *
  *   *
   * *
    *
```
