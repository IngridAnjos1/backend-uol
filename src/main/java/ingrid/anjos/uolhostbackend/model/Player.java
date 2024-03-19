package ingrid.anjos.uolhostbackend.model;

import ingrid.anjos.uolhostbackend.model.dtos.PlayerDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "players")
@Table(name = "players")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player{

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

  public Player(PlayerDto dto) {
    this.name = dto.name();
    this.email = dto.email();
    this.phoneNumber = dto.phoneNumber();
    this.groupType = dto.groupType();
  }
}
