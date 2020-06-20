import java.util.LinkedList;

class loopItems {
    public static void main(String[] args){
        LinkedList<String> colores = new LinkedList<String>();
        colores.add(0, "Rojo");
        colores.add(1, "Amarillo");
        colores.add(2, "Verde");
        colores.add(3, "Azul");
        colores.add(4, "Morado");

        /* FOR LOOP */
        for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }

        /* FOR-EACH LOOP */
        for (String i : colores) {
            System.out.println(i);
        }
    }
}