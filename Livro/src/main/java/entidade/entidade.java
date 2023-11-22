package entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Livros")
public class entidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@NotBlank
	private String nome;
	
	@NotNull
	@NotBlank
	@Size("Descrição do ")
	private String senha;
	
	@NotNull
	@NotBlank
	@Email(message= "Informe o e-mail correntemente")
	private String email;

}
