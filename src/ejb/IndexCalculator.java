/** Index Calculator
 * 
 * Creada por Luis Manuel Martin Guerra
 * luimargu@uoc.edu
 */

package ejb;

import java.util.Collection;
import java.util.Iterator;

import jpa.*;


public class IndexCalculator {

	private int id;
	private int aux;
	private int valor;

	public IndexCalculator() {
		
		this.aux=0;
	}
	/** Funcionamiento 
	 * 
	 * @param Collection de una entidad JPA
	 * @return el id del último elemento de la lista, de esta manera podemos calcular
	 * cuál será la siguiente posición
	 */
	
	public int getLabelIndex(Collection<LabelJPA> list) {
		
		if(list.isEmpty()) {
			id=0;
		}
		else {
			for(Iterator <LabelJPA> iter = list.iterator(); iter.hasNext();) {
				LabelJPA test = (LabelJPA) iter.next();
				valor=test.getLabelId();
				if(valor>=aux) {
					aux=valor;
					id=aux;
				}
			aux=aux+1;
			}
		}id=id+1;
		return id;
	}
}