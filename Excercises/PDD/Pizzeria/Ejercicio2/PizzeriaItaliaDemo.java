package Excercises.PDD.Pizzeria.Ejercicio2;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PizzeriaItaliaDemo {
        public static void main(String[] args) {
                // Crear pizzas
                IPizza vegetariana = new Vegetariana();
                IPizza hawaiana = new Hawaiana();
                IPizza americana = new Americana();

                // Crear y seleccionar tamaño de las pizzas
                IPizza personalVegetariana = new Personal(vegetariana);
                IPizza familiarHawaiana = new Familiar(hawaiana);
                IPizza grandeAmericana = new Grande(americana);

                // Seleccionar decorado para pizza vegetariana personal
                // Mostrar el estado de la pizza vegetariana personal
                System.out.println(personalVegetariana.getDescription() + ", Costo: " + personalVegetariana.getCost());

                // Seleccionar decorado para pizza hawaiana familiar
                IPizza familiarHawaianaAceituna = new Aceituna(familiarHawaiana);
                IPizza familiarHawaianaAceitunaPimiento = new Pimiento(familiarHawaianaAceituna);
                // Mostrar el estado de la pizza hawaiana familiar
                System.out.println(familiarHawaianaAceitunaPimiento.getDescription() + ", Costo: "
                                + familiarHawaianaAceitunaPimiento.getCost());

                // Seleccionar decorado para pizza americana grande
                IPizza grandeAmericanaQueso = new Queso(grandeAmericana);
                IPizza grandeAmericanaQuesoQueso = new Queso(grandeAmericanaQueso);
                IPizza grandeAmericanaQuesoQuesoAceituna = new Aceituna(grandeAmericanaQuesoQueso);
                // Mostrar el estado de la pizza americana grande
                System.out.println(grandeAmericanaQuesoQuesoAceituna.getDescription() + ", Costo: "
                                + grandeAmericanaQuesoQuesoAceituna.getCost());
        }
}