package dardo.backbone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Patch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private User user;

	private String name;
	
	public User getUser() {
		return user;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
