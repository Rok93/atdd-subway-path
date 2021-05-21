package wooteco.subway.path.ui;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wooteco.subway.path.dto.PathResponse;
import wooteco.subway.station.application.StationService;
import wooteco.subway.station.domain.Station;

@RestController
public class PathController {

    private final StationService stationService;

    public PathController(StationService stationService) {
        this.stationService = stationService;
    }

    // TODO: 경로조회 기능 구현하기 (~ing)
    @GetMapping("/paths")
    public ResponseEntity<PathResponse> findShortestPath(@RequestParam("source") Long sourceId,
        @RequestParam("target") Long targetId) {
        Station sourceStation = stationService.findStationById(sourceId);
        Station targetStation = stationService.findStationById(sourceId);

        return ResponseEntity.ok(null);
    }
}
