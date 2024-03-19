package ingrid.anjos.uolhostbackend.service;

import ingrid.anjos.uolhostbackend.infra.CodinameHandler;
import ingrid.anjos.uolhostbackend.model.GroupType;
import ingrid.anjos.uolhostbackend.model.Player;
import ingrid.anjos.uolhostbackend.model.dtos.PlayerDto;
import ingrid.anjos.uolhostbackend.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PlayerService {
  @Autowired
  private PlayerRepository repository;

  @Autowired
  private CodinameHandler handler;

  public Player createPlayer(PlayerDto dto) {
    Player newPlayer = new Player(dto);
    String codiname = getCodiname(dto.groupType());
    newPlayer.setCodiname(codiname);
    return repository.save(newPlayer);
  }

  private String getCodiname(GroupType groupType){
    return handler.findCodiname(groupType);
  }

  public List<Player> getAllPlayers() {
    return repository.findAll();
  }
}


