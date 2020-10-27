package FonoCamaraApp;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public abstract class FonoCamaraApp {

    public String tomar() {
        return "Se tomo la foto exitosamente.";
    }

    public abstract String editar();

    public String compartir(String opcion) {
        String tipo = null;
        switch (opcion.toLowerCase()) {
            case "sms":
                tipo = "Se compartio la foto por SMS.";
                break;
            case "email":
                tipo = "Se compartio la foto por Email.";
                break;
            case "redsocial":
                tipo = "Se compartio la foto por Red Social.";
                break;
        }
        return tipo;
    }

    public String guardar() {
        return "Se guardo la foto exitosamente.";
    }
}
