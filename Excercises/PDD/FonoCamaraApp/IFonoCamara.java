package FonoCamaraApp;

/**
 *
 * @author Fernando Calmet
 * @email fercalmet@gmail.com
 * @homepage https://github.com/FernandoCalmet
 */
public interface IFonoCamara {
    public String compartirPorSMS();

    public String compartirPorEmail();

    public String compartirPorRedSocial();

    public String editar();
}