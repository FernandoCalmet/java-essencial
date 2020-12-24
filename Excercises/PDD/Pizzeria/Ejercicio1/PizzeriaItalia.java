package Excercises.PDD.Pizzeria.Ejercicio1;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PizzeriaItalia {
        public static void main(String[] args) {
                Pizza vegetariana = new PizzaVegetariana("Personal");
                Pizza hawaiana = new PizzaHawaiana("Familiar");
                Pizza americana = new PizzaAmericana("Grande");

                // Pizza vegetariana sin decorado
                System.out.println(vegetariana.getDescripcion() + ", Costo: " + vegetariana.getCosto());
                // Pizza hawaiana con decorado
                Pizza hawaianaAceituna = new ComplementoAceituna(hawaiana);
                Pizza hawaianaAceitunaPimiento = new ComplementoPimiento(hawaianaAceituna);
                System.out.println(hawaianaAceitunaPimiento.getDescripcion() + ", Costo: "
                                + hawaianaAceitunaPimiento.getCosto());
                // Pizza americana con decorado
                Pizza americanaQueso = new ComplementoQueso(americana);
                Pizza americanaQuesoQueso = new ComplementoQueso(americanaQueso);
                Pizza americanaQuesoQuesoAceituna = new ComplementoAceituna(americanaQuesoQueso);
                System.out.println(americanaQuesoQuesoAceituna.getDescripcion() + ", Costo: "
                                + americanaQuesoQuesoAceituna.getCosto());
        }
}