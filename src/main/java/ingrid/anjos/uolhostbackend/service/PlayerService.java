package ingrid.anjos.uolhostbackend.service;

import ingrid.anjos.uolhostbackend.model.Player;
import ingrid.anjos.uolhostbackend.model.dtos.PlayerDto;
import ingrid.anjos.uolhostbackend.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
  @Autowired
  private PlayerRepository repository;

  public Player createPlayer(PlayerDto dto){
    Player newPlayer = new Player(dto);
    return repository.save(newPlayer);
  }
}
