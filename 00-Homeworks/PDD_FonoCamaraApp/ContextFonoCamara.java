/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public class ContextFonoCamara {
    public IFonoCamara camara;

    public void setStrategy(IFonoCamara camara) {
        this.camara = camara;
    }

    public String compartir(String opcion) {
        String tipo = null;
        switch (opcion.toLowerCase()) {
            case "sms":
                tipo = this.camara.compartirPorSMS();
                break;
            case "email":
                tipo = this.camara.compartirPorEmail();
                break;
            case "redsocial":
                tipo = this.camara.compartirPorRedSocial();
                break;
        }
        return tipo;
    }

    public String editar() {
        return this.camara.editar();
    }

    public String tomar() {
        return "Se tomo una foto";
    }

    public String guardar() {
        return "Se guardo la foto";
    }
}