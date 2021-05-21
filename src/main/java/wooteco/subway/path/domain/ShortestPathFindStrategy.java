package wooteco.subway.path.domain;

import java.util.List;
import wooteco.subway.line.domain.Section;
import wooteco.subway.station.domain.Station;

public interface ShortestPathFindStrategy {

    List<String> findShortestPath(List<Section> sections, Station from, Station to);

    List<String> findShortestDistance(List<Section> sections, Station from, Station to);
}
