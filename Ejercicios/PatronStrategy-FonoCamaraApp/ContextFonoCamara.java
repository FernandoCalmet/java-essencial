public class ContextFonoCamara {
    public IFonoCamara camara;

    public void setStrategy(IFonoCamara camara){
        this.camara = camara;
    }
    public String tomar(){
        return "Se tomo una foto";
    }
    public String compartir(){
        return "Se compartio la foto";
    }
    public String editar(){
        return "Se edito la foto";
    }
    public String guardar(){
        return "Se guardo la foto";
    }
}