package ingrid.anjos.uolhostbackend.model.dtos;

import ingrid.anjos.uolhostbackend.model.GroupType;
public record PlayerDto(
  String name,
  String email,
  String phoneNumber,
  GroupType groupType
) {
}
