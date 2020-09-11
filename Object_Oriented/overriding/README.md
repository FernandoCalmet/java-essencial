# Primordial

En el capítulo anterior, hablamos de superclases y subclases. Si una clase hereda un método de su superclase, existe la posibilidad de invalidar el método siempre que no esté marcado como final.

El beneficio de anular es: la capacidad de definir un comportamiento que es específico del tipo de subclase, lo que significa que una subclase puede implementar un método de clase padre según su requisito.

En términos de orientación a objetos, anular significa anular la funcionalidad de un método existente.

> Ejemplo

```java
class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
   public void move() {
      System.out.println("Dogs can walk and run");
   }
}

public class TestDog {

   public static void main(String args[]) {
      Animal a = new Animal();   // Animal reference and object
      Animal b = new Dog();   // Animal reference but Dog object

      a.move();   // runs the method in Animal class
      b.move();   // runs the method in Dog class
   }
}
```

Esto producirá el siguiente resultado:

> Salida

```note
Animals can move
Dogs can walk and run
```

En el ejemplo anterior, puede ver que aunque b es un tipo de Animal, ejecuta el método move en la clase Dog. La razón de esto es: En tiempo de compilación, la verificación se realiza en el tipo de referencia. Sin embargo, en el tiempo de ejecución, JVM determina el tipo de objeto y ejecuta el método que pertenece a ese objeto en particular.

Por lo tanto, en el ejemplo anterior, el programa se compilará correctamente ya que la clase Animal tiene el método move. Luego, en el tiempo de ejecución, ejecuta el método específico para ese objeto.

Considere el siguiente ejemplo:

> Ejemplo

```java
class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
   public void move() {
      System.out.println("Dogs can walk and run");
   }
   public void bark() {
      System.out.println("Dogs can bark");
   }
}

public class TestDog {

   public static void main(String args[]) {
      Animal a = new Animal();   // Animal reference and object
      Animal b = new Dog();   // Animal reference but Dog object

      a.move();   // runs the method in Animal class
      b.move();   // runs the method in Dog class
      b.bark();
   }
}
```

Esto producirá el siguiente resultado:

> Salida

```note
TestDog.java:26: error: cannot find symbol
      b.bark();
       ^
  symbol:   method bark()
  location: variable b of type Animal
1 error
```

Este programa arrojará un error de tiempo de compilación ya que el tipo de referencia de b Animal no tiene un método con el nombre de ladrido.

## Reglas para la anulación de métodos

- La lista de argumentos debe ser exactamente la misma que la del método reemplazado.

- El tipo de retorno debe ser el mismo o un subtipo del tipo de retorno declarado en el método anulado original en la superclase.

- El nivel de acceso no puede ser más restrictivo que el nivel de acceso del método anulado. Por ejemplo: si el método de superclase se declara público, el método de reemplazo en la subclase no puede ser privado ni estar protegido.

- Los métodos de instancia se pueden invalidar solo si son heredados por la subclase.

- Un método declarado final no se puede invalidar.

- Un método declarado estático no se puede anular, pero se puede volver a declarar.

- Si un método no se puede heredar, no se puede anular.

- Una subclase dentro del mismo paquete que la superclase de la instancia puede anular cualquier método de superclase que no se declare privado o final.

- Una subclase en un paquete diferente solo puede anular los métodos no finales declarados públicos o protegidos.

- Un método anulado puede generar excepciones sin marcar, independientemente de si el método anulado genera excepciones o no. Sin embargo, el método de invalidación no debe generar excepciones comprobadas que sean nuevas o más amplias que las declaradas por el método invalidado. El método invalidado puede generar menos excepciones o menos que el método invalidado.

- Los constructores no se pueden anular.

## Usando la palabra clave súper

Cuando se invoca una versión de superclase de un método anulado, se utiliza la palabra clave super.

> Ejemplo

```java
class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
   public void move() {
      super.move();   // invokes the super class method
      System.out.println("Dogs can walk and run");
   }
}

public class TestDog {

   public static void main(String args[]) {
      Animal b = new Dog();   // Animal reference but Dog object
      b.move();   // runs the method in Dog class
   }
}
```

Esto producirá el siguiente resultado:

Salida

```note
Animals can move
Dogs can walk and run
```

---

:octocat: [Check more about Java in my repository.](https://github.com/FernandoCalmet/Java)

[![ko-fi](https://www.ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/T6T41JKMI)
