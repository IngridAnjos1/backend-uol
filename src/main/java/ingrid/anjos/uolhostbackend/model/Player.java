package ingrid.anjos.uolhostbackend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "players")
@Table(name = "players")
@Getter
@Setter
public class Player {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @NotBlank
  private String name;
  @Email
  @NotBlank
  private String email;
  private String phoneNumber;
  private String codiname;
  private GroupType groupType;

}
