# Character Class

Normally, when we work with characters, we use primitive data types char.

Example

```java
char ch = 'a';

// Unicode for uppercase Greek omega character
char uniChar = '\u039A';

// an array of chars
char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };
```

However in development, we come across situations where we need to use objects instead of primitive data types. In order to achieve this, Java provides wrapper class Character for primitive data type char.

The Character class offers a number of useful class (i.e., static) methods for manipulating characters. You can create a Character object with the Character constructor −

```java
Character ch = new Character('a');
```

The Java compiler will also create a Character object for you under some circumstances. For example, if you pass a primitive char into a method that expects an object, the compiler automatically converts the char to a Character for you. This feature is called autoboxing or unboxing, if the conversion goes the other way.

Example

```java
// Here following primitive char 'a'
// is boxed into the Character object ch
Character ch = 'a';

// Here primitive 'x' is boxed for method test,
// return is unboxed to char 'c'
char c = test('x');
```

## Escape Sequences

A character preceded by a backslash (\) is an escape sequence and has a special meaning to the compiler.

The newline character (\n) has been used frequently in this tutorial in System.out.println() statements to advance to the next line after the string is printed.

Following table shows the Java escape sequences −

Escape Sequence | Description
--- | ---
\t | Inserts a tab in the text at this point.
\b |Inserts a backspace in the text at this point.
\n |Inserts a newline in the text at this point.
\r |Inserts a carriage return in the text at this point.
\f |Inserts a form feed in the text at this point.
`\'` |Inserts a single quote character in the text at this point.
`\"` |Inserts a double quote character in the text at this point.
`\\` |Inserts a backslash character in the text at this point.

When an escape sequence is encountered in a print statement, the compiler interprets it accordingly.

Example
If you want to put quotes within quotes, you must use the escape sequence, \", on the interior quotes −

```java
public class Test {

   public static void main(String args[]) {
      System.out.println("She said \"Hello!\" to me.");
   }
}
```

This will produce the following result −

Output

```bash
She said "Hello!" to me.
```

## Character Methods

Following is the list of the important instance methods that all the subclasses of the Character class implement −

`Sr.No.` | Method & Description
--- | ---
1 | **isLetter()** Determines whether the specified char value is a letter.
2 | **isDigit()** Determines whether the specified char value is a digit.
3 | **isWhitespace()** Determines whether the specified char value is white space.
4 | **isUpperCase()** Determines whether the specified char value is uppercase.
5 | **isLowerCase()** Determines whether the specified char value is lowercase.
6 | **toUpperCase()** Returns the uppercase form of the specified char value.
7 | **toLowerCase()** Returns the lowercase form of the specified char value.
8 | **toString()** Returns a String object representing the specified character value that is, a one-character string.

For a complete list of methods, please refer to the java.lang.Character API specification.

### isLetter() Method

**Description**
The method determines whether the specified char value is a letter.

**Syntax** :

```java
boolean isLetter(char ch)
```

**Parameters**
Here is the detail of parameters −

- **ch** − Primitive character type.

**Return Value**
This method returns true if the passed character is really a character.

Example

```java
public class Test {
   public static void main(String args[]) {
      System.out.println(Character.isLetter('c'));
      System.out.println(Character.isLetter('5'));
   }
}
```

This will produce the following result −

Output

```java
true
false
```

### isDigit() Method

**Description**
The method determines whether the specified char value is a digit.

**Syntax** :

```java
boolean isDigit(char ch)
```

**Parameters**
Here is the detail of parameters −

- **ch** − Primitive character type.

**Return Value**
This method returns true, if the passed character is really a digit.

Example

```java
public class Test {
   public static void main(String args[]) {
      System.out.println(Character.isDigit('c'));
      System.out.println(Character.isDigit('5'));
   }
}
```

This will produce the following result −

Output

```java
false
true
```

### isWhitespace() Method

**Description**
The method determines whether the specified char value is a white space, which includes space, tab, or new line.

**Syntax** :

```java
boolean isWhitespace(char ch)
```

**Parameters**
Here is the detail of parameters −

- **ch** − Primitive character type.

**Return Value**
This method returns true, if the passed character is really a white space.

Example

```java
public class Test {
   public static void main(String args[]) {
      System.out.println(Character.isWhitespace('c'));
      System.out.println(Character.isWhitespace(' '));
      System.out.println(Character.isWhitespace('\n'));
      System.out.println(Character.isWhitespace('\t'));
   }
}
```

This will produce the following result −

Output

```java
false
true
true
true
```

### isUpperCase() Method

**Description**
This method determines whether the specified char value is uppercase.

**Syntax** :

```java
boolean isUpperCase(char ch)
```

**Parameters**
Here is the detail of parameters −

- **ch** − Primitive character type.

**Return Value**
This method returns true, if the passed character is really an uppercase.

Example

```java
public class Test {
   public static void main(String args[]) {
      System.out.println(Character.isUpperCase('c'));
      System.out.println(Character.isUpperCase('C'));
      System.out.println(Character.isUpperCase('\n'));
      System.out.println(Character.isUpperCase('\t'));
   }
}
```

This will produce the following result −

Output

```java
false
true
false
false
```

### isLowerCase() Method

**Description**
The method determines whether the specified char value is lowercase.

**Syntax** :

```java
boolean isLowerCase(char ch)
```

**Parameters**
Here is the detail of parameters −

- **ch** − Primitive character type.

**Return Value**
This method returns true, if the passed character is really in lowercase.

Example

```java
public class Test {
   public static void main(String args[]) {
      System.out.println(Character.isLowerCase('c'));
      System.out.println(Character.isLowerCase('C'));
      System.out.println(Character.isLowerCase('\n'));
      System.out.println(Character.isLowerCase('\t'));
   }
}
```

This will produce the following result −

Output

```java
true
false
false
false
```

### toUpperCase() Method

**Description**
The method returns the uppercase form of the specified char value.

**Syntax** :

```java
char toUpperCase(char ch)
```

**Parameters**
Here is the detail of parameters −

- **ch** − Primitive character type.

**Return Value**
This method returns the uppercase form of the specified char value.

Example

```java
public class Test {
   public static void main(String args[]) {
      System.out.println(Character.toUpperCase('c'));
      System.out.println(Character.toUpperCase('C'));
   }
}
```

This will produce the following result −

Output

```java
C
C
```

### toLowerCase() Method

**Description**
The method returns the lowercase form of the specified char value.

**Syntax** :

```java
char toLowerCase(char ch)
```

**Parameters**
Here is the detail of parameters −

- **ch** − Primitive character type.

**Return Value**
This method returns the lowercase form of the specified char value.

Example

```java
public class Test {
   public static void main(String args[]) {
      System.out.println(Character.toLowerCase('c'));
      System.out.println(Character.toLowerCase('C'));
   }
}
```

This will produce the following result −

Output

```java
c
c
```

### toString() Method

**Description**
This method returns a String object representing the specified character value, that is, a one-character string.

**Syntax** :

```java
String toString(char ch)
```

**Parameters**
Here is the detail of parameters −

- **ch** − Primitive character type.

**Return Value**
This method returns String object.

Example

```java
public class Test {
   public static void main(String args[]) {
      System.out.println(Character.toString('c'));
      System.out.println(Character.toString('C'));
   }
}
```

This will produce the following result −

Output

```java
c
C
```

---

:octocat: [Check more about Java in my repository.](https://github.com/FernandoCalmet/Java)

[![ko-fi](https://www.ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/T6T41JKMI)
