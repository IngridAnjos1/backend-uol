package ingrid.anjos.uolhostbackend.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ingrid.anjos.uolhostbackend.model.GroupType;
import ingrid.anjos.uolhostbackend.service.CodinameService;




@Component
public class CodinameHandler {
  @Autowired
  private CodinameService service;

  public String findCodiname(GroupType groupType) {
    if(groupType == GroupType.AVANGERS){
      String firstMatch = service.getAvangersCodinameList().stream().findFirst().orElseThrow();
      this.service.getAvangersCodinameList().remove(firstMatch);
      return firstMatch;
    }
    String firstMatch = service.getJusticeLeagueList().stream().findFirst().orElseThrow();
    this.service.getJusticeLeagueList().remove(firstMatch);
    return firstMatch;
  }


}
