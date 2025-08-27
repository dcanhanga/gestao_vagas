package com.conecta.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
public class CandidateEntity {
  private UUID id;
  private String name; 
  @NotBlank(message="O campo username é obrigatório")
  @Pattern(regexp = "\\S+", message = "O Campo username não deve conter espaço em branco")
  private String username;
  @NotBlank(message="O campo email é obrigatório")
  @Email(message = "Email inválido")
  private String email;
  @NotBlank(message="O campo password é obrigatório")
  @Length(min = 8, max = 100, message = "O campo password deve ter entre 8 e 100 caracteres")
  private String password;
  @Length(max = 300, message = "A descrição deve ter no máximo 300 caracteres")
  private String description;
  
  
}
