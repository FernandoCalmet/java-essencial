public class ContextFonoCamara {
    public IFonoCamara camara;

    public void setStrategy(IFonoCamara camara){
        this.camara = camara;
    }
    public String tomar(){
        return "Se tomo una foto";
    }
    public String compartir(){
        return this.camara.compartir();
    }
    public String editar(){
        return this.camara.editar();
    }
    public String guardar(){
        return "Se guardo la foto";
    }
}