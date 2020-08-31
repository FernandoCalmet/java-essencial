# Numbers Class

Normally, when we work with Numbers, we use primitive data types such as byte, int, long, double, etc.

Example:

```java
int i = 5000;
float gpa = 13.65;
double mask = 0xaf;
```

However, in development, we come across situations where we need to use objects instead of primitive data types. In order to achieve this, Java provides wrapper classes.

All the wrapper classes (Integer, Long, Byte, Double, Float, Short) are subclasses of the abstract class Number.

![Number Classes](NumbersClass/number_classes.jpg)

The object of the wrapper class contains or wraps its respective primitive data type. Converting primitive data types into object is called boxing, and this is taken care by the compiler. Therefore, while using a wrapper class you just need to pass the value of the primitive data type to the constructor of the Wrapper class.

And the Wrapper object will be converted back to a primitive data type, and this process is called unboxing. The Number class is part of the java.lang package.

Following is an example of boxing and unboxing −

Example:

```java
public class Test {

   public static void main(String args[]) {
      Integer x = 5; // boxes int to an Integer object
      x =  x + 10;   // unboxes the Integer to a int
      System.out.println(x);
   }
}
```

This will produce the following result −

Output:

```bash
15
```

When x is assigned an integer value, the compiler boxes the integer because x is integer object. Later, x is unboxed so that they can be added as an integer.

## Number Methods

Following is the list of the instance methods that all the subclasses of the Number class implements −

Sr.No. | Method | Description
------ | ------ | ------
1 | xxxValue() | Converts the value of this Number object to the xxx data type and returns it.
2 | compareTo() | Compares this Number object to the argument.
3 | equals() | Determines whether this number object is equal to the argument.
4 | valueOf() | Returns an Integer object holding the value of the specified primitive.
5 | toString() | Returns a String object representing the value of a specified int or Integer.
6 | parseInt() | This method is used to get the primitive data type of a certain String.
7 | abs() | Returns the absolute value of the argument.
8 | ceil() | Returns the smallest integer that is greater than or equal to the argument. Returned as a double.
9 | floor() | Returns the largest integer that is less than or equal to the argument. Returned as a double.
10 | rint() | Returns the integer that is closest in value to the argument. Returned as a double.
11 | round() | Returns the closest long or int, as indicated by the method's return type to the argument.
12 | min() | Returns the smaller of the two arguments.
13 | max() | Returns the larger of the two arguments.
14 | exp() | Returns the base of the natural logarithms, e, to the power of the argument.
15 | log() | Returns the natural logarithm of the argument.
16 | pow() | Returns the value of the first argument raised to the power of the second argument.
17 | sqrt() | Returns the square root of the argument.
18 | sin() | Returns the sine of the specified double value.
19 | cos() | Returns the cosine of the specified double value.
20 | tan() | Returns the tangent of the specified double value.
21 | asin() | Returns the arcsine of the specified double value.
22 | acos() | Returns the arccosine of the specified double value.
23 | atan() |Returns the arctangent of the specified double value.
24 | atan2() | Converts rectangular coordinates (x, y) to polar coordinate (r, theta) and returns theta.
25 | toDegrees() | Converts the argument to degrees.
26 | toRadians() | Converts the argument to radians.
27 | random() | Returns a random number.

### xxxValue`()` Method

**Description**
The method converts the value of the Number Object that invokes the method to the primitive data type that is returned from the method.

**Syntax**
Here is a separate method for each primitive data type

```java
byte byteValue()
short shortValue()
int intValue()
long longValue()
float floatValue()
double doubleValue()
```

**Parameters**
Here is the detail of parameters −

All these are default methods and accepts no parameter.
Return Value
This method returns the primitive data type that is given in the signature.

Example:

```java
public class Test {
   public static void main(String args[]) {
      Integer x = 5;
      // Returns byte primitive data type
      System.out.println( x.byteValue() );
      // Returns double primitive data type
      System.out.println(x.doubleValue());
      // Returns long primitive data type
      System.out.println( x.longValue() );
   }
}
```

This will produce the following result −

Output:

```bash
5
5.0
5
```

### compareTo`()` Method

**Description**
The method compares the Number object that invoked the method to the argument. It is possible to compare Byte, Long, Integer, etc.

However, two different types cannot be compared, both the argument and the Number object invoking the method should be of the same type.

**Syntax**
public int compareTo( NumberSubClass referenceName )
Parameters
Here is the detail of parameters −

referenceName − This could be a Byte, Double, Integer, Float, Long, or Short.

**Return Value**
If the Integer is equal to the argument then 0 is returned.
If the Integer is less than the argument then -1 is returned.
If the Integer is greater than the argument then 1 is returned.

Example

```java
public class Test {
   public static void main(String args[]) {
      Integer x = 5;
      System.out.println(x.compareTo(3));
      System.out.println(x.compareTo(5));
      System.out.println(x.compareTo(8));
   }
}
```

This will produce the following result −

Output:

```bash
1
0
-1
```

### equals() Method

**Description**
The method determines whether the Number object that invokes the method is equal to the object that is passed as an argument.

Syntax

```java
public boolean equals(Object o)
```

**Parameters**
Here is the detail of parameters −

- Any object.

**Return Value**
The method returns True if the argument is not null and is an object of the same type and with the same numeric value. There are some extra requirements for Double and Float objects that are described in the Java API documentation.

Example

```java
public class Test {
   public static void main(String args[]) {
      Integer x = 5;
      Integer y = 10;
      Integer z =5;
      Short a = 5;
      System.out.println(x.equals(y));
      System.out.println(x.equals(z));
      System.out.println(x.equals(a));
   }
}
```

This will produce the following result −

Output

```java
false
true
false
```

### valueOf() Method

**Description**
The valueOf method returns the relevant Number Object holding the value of the argument passed. The argument can be a primitive data type, String, etc.

This method is a static method. The method can take two arguments, where one is a String and the other is a radix.

**Syntax**
Following are all the variants of this method −

```java
static Integer valueOf(int i)
static Integer valueOf(String s)
static Integer valueOf(String s, int radix)
```

**Parameters**
Here is the detail of parameters −

- **i** − An int for which Integer representation would be returned.

- **s** − A String for which Integer representation would be returned.

- **radix** − This would be used to decide the value of returned Integer based on the passed String.

Return Value:

- **valueOf(int i)** − This returns an Integer object holding the value of the specified primitive.

- **valueOf(String s)** − This returns an Integer object holding the value of the specified string representation.

- **valueOf(String s, int radix)** − This returns an Integer object holding the integer value of the specified string representation, parsed with the value of radix.

Example

```java
public class Test {
   public static void main(String args[]) {
      Integer x =Integer.valueOf(9);
      Double c = Double.valueOf(5);
      Float a = Float.valueOf("80");
      Integer b = Integer.valueOf("444",16);
      System.out.println(x);
      System.out.println(c);
      System.out.println(a);
      System.out.println(b);
   }
}
```

This will produce the following result −

Output

```bash
9
5.0
80.0
1092
```

### toString() Method

**Description**
The method is used to get a String object representing the value of the Number Object.

If the method takes a primitive data type as an argument, then the String object representing the primitive data type value is returned.

If the method takes two arguments, then a String representation of the first argument in the radix specified by the second argument will be returned.

**Syntax**
Following are all the variants of this method −

```java
String toString()
static String toString(int i)
```

**Parameters**
Here is the detail of parameters −

- **i** − An int for which string representation would be returned.

Return Value:

- **toString()** − This returns a String object representing the value of this Integer.

- **toString(int i)** − This returns a String object representing the specified integer.

Example

```java
public class Test {
   public static void main(String args[]) {
      Integer x = 5;
      System.out.println(x.toString());  
      System.out.println(Integer.toString(12));
   }
}
```

This will produce the following result −

Output

```bash
5
12
```

### parseInt() Method

**Description**
This method is used to get the primitive data type of a certain String. parseXxx() is a static method and can have one argument or two.

**Syntax**
Following are all the variants of this method −

```java
static int parseInt(String s)
static int parseInt(String s, int radix)
```

**Parameters**
Here is the detail of parameters −

- **s** − This is a string representation of decimal.

- **radix** − This would be used to convert String s into integer.

**Return Value**
``

- **parseInt(String s)** − This returns an integer (decimal only).

- **parseInt(int i)** − This returns an integer, given a string representation of decimal, binary, octal, or hexadecimal (radix equals 10, 2, 8, or 16 respectively) numbers as input.

Example

```java
public class Test {

   public static void main(String args[]) {
      int x =Integer.parseInt("9");
      double c = Double.parseDouble("5");
      int b = Integer.parseInt("444",16);

      System.out.println(x);
      System.out.println(c);
      System.out.println(b);
   }
}
```

This will produce the following result −

Output

```bash
9
5.0
1092
```

### abs() Method

...

### ceil() Method

...

### floor() Method

...

### rint() Method

...

### round() Method

...

### min() Method

...

### max() Method

...

### exp() Method

...

### log() Method

...

### pow() Method

...

### sqrt() Method

...

### sin() Method

...

### cos() Method

...

### tan() Method

...

### asin() Method

...

### acos() Method

...

### atan() Method

...

### atan2() Method

...

### toDegree() Method

...

### toRadians() Method

...

### random() Method

...

:octocat: [Check more about Java in my repository.](https://github.com/FernandoCalmet/Java)

[![ko-fi](https://www.ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/T6T41JKMI)
