package utils;

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