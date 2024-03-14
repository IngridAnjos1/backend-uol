package ingrid.anjos.uolhostbackend.controller;


import ingrid.anjos.uolhostbackend.model.Player;
import ingrid.anjos.uolhostbackend.model.dtos.PlayerDto;
import ingrid.anjos.uolhostbackend.service.PlayerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayerController {

  @Autowired
  private PlayerService service;

  public ResponseEntity<Player> createPlayer(@RequestBody @Valid PlayerDto dto) {
    Player newPlayer = service.createPlayer(dto);
    return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);
  }
}

