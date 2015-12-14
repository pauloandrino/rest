package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Produto implements Model {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;

	public Produto() {
	}
	
	public Produto (Builder b) {
		this.id = b.id;
		this.nome = b.nome;
	}

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {

		private Long id;
		private String nome;

		private Builder() {

		}

		public Builder id(Long id) {
			this.id = id;
			return this;

		}

		public Builder nome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public Produto build() {
			return new Produto(this);
		}

	}

}
