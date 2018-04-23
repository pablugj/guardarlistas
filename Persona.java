public class Persona
{
    private int id;
    private String nombre;

    public Persona(int p_id,String p_nombre)
    {
        id = p_id;
        nombre = p_nombre;
    }

    public int getId()
    {
        return id;
    }

    public String getNombre()
    {
        return nombre;
    }
}
