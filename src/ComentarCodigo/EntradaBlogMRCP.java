package ComentarCodigo;
/**
 *
 * @author MIRIAN CABRERA PARRA
 * @version 2.1
 * @since 2023-02-20
 */

public class EntradaBlogMRCP {


    /**
     * separador es el ccarácter que separa ENTRADA DE del
     * nombre del autor
     */
    public static char separador=':';
    private int id;
    private String texto;
    private String autor;


    /**
     * Constructor de la clase.
     * @param id
     * @param autor
     * @param texto
     * @throws IllegalArgumentException
     */
    public EntradaBlogMRCP(int id,String autor,String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
    }

    @Override
    /**
     *
     */
    public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
    }


    /**
     *
     * @return id
     */
    public int getId(){
        return this.id;
    }

    /**
     *
     * @return texto
     */
    public String getTexto(){
        return this.texto;
    }


    /**
     *
     * @return autor de la entra en mayusculas
     */
    public String getAutor(){
        return this.autor.toUpperCase();
    }

    /**
     * Ya no se usa. Mejor ver getAutor
     * @return autor
     */
    /**
     *
     * @return autor
     */
    public String devuelveAutor(){
        return this.autor;
    }


    /**
     * No tiene porqué tener argumentos.
     * @param args
     */
    public static void main(String[] args) {

        EntradaBlogMRCP e1=new EntradaBlogMRCP (3,"ana","Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }

}
