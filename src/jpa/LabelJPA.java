package jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="topoffers.label")
public class LabelJPA implements Serializable{

	private static final long serialVersionUID = 155049527890942705L;
	
	@Id
	@Column(name="label_id")
	private int labelId;
	
	@Column(name="text")
	private String text;
	
	@Column(name="description")
	private String description;

	public LabelJPA() {
		super();
	}
	
	public LabelJPA(int id, String text, String description) {
		this.labelId=id;
		this.text=text;
		this.description=description;
	}

	public int getLabelId() {
		return labelId;
	}

	public void setLabelId(int labelId) {
		this.labelId = labelId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
