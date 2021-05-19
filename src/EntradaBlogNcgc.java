
/**
 * Clase para manejar las entradas de un blog.
 * @version1.0 19/05/2021
 * @author Neylin
 */
public class EntradaBlogNcgc {
	
	/**
	 * separador es el car�cter que separa entrada del
	 * nombre del autor
	 */
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;	
	
	/**
	 * Constructor de la clase <code> EntradaBlogNcgc <code>. 
	 * @param id n�mero de entrada
	 * @param autor nombre del autor
	 * @param texto texto de la entrada
	 * @throws IllegalArgumentException Exepci�n cuando n�mero entrada es negativo
	 */
	
	public EntradaBlogNcgc(int id,String autor,String texto)throws IllegalArgumentException{
		
		try {
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
			
		}catch(IllegalArgumentException e) {
			
			e.printStackTrace();
		}
		
		
	}
		
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
		
	
	/**
	 * @return Devuelve el n�mero de la entrada
	 */
		
	@SuppressWarnings("javadoc")
	public int getId(){
		return this.id;
	}
		
	/**
	 * @return Devuelve el texto completo de la entrada
	 */
		
	@SuppressWarnings("javadoc")
	public String getTexto(){
		return this.texto;
	}
		
	/**
	 * @return Devuelve el nombre del autor de la entrada en may�sculas
	 */
	
	@SuppressWarnings("javadoc")
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**
	 * @return Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
	 */
	@SuppressWarnings("javadoc")
	public String devuelveAutor(){
		return this.autor;
	}
		
	/**
	 * @param args M�todo main no contiene argumentos
	 */
	public static void main(String[] args) {
		EntradaBlogNcgc e1=new EntradaBlogNcgc(3,"ana","�ltimas noticias, est� disponible BixBy 2.0");
		System.out.println(e1);
	}

}
