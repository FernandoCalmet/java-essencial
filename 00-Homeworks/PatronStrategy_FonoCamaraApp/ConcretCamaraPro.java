public class ConcretCamaraPro extends BaseEditar implements IFonoCamara {
    public String compartirPorSMS() {
        return "Se compartio la foto por SMS.";
    }

    public String compartirPorEmail() {
        return "Se compartio la foto por Email.";
    }

    public String compartirPorRedSocial() {
        return "Se compartio la foto por Red Social.";
    }

    public String editar() {
        return editarFoto();
    }
}