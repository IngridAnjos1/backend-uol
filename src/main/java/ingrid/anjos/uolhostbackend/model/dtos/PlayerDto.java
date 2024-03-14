package ingrid.anjos.uolhostbackend.model.dtos;

import ingrid.anjos.uolhostbackend.model.GroupType;
public record PlayerDto(
  String nome,
  String email,
  String phoneNumber,
  GroupType groupType
) {
}
