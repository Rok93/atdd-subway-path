package wooteco.subway.path.domain;

import java.util.List;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.springframework.stereotype.Component;
import wooteco.subway.line.domain.Section;
import wooteco.subway.station.domain.Station;

@Component
public class DijkstraFindStrategy implements ShortestPathFindStrategy{

    private final DijkstraFindStrategy dijkstraFindStrategy;

    public DijkstraFindStrategy(DijkstraFindStrategy dijkstraFindStrategy) {
        this.dijkstraFindStrategy = dijkstraFindStrategy;
    }

    @Override
    public List<String> findShortestPath(List<Section> sections, Station from, Station to) {
        return null;
    }

    @Override
    public List<String> findShortestDistance(List<Section> sections, Station from, Station to) {
        return null;
    }

    private DijkstraShortestPath dijkstraShortestPath(List<Section> sections) {
        //todo: 아뿔사, Lines, Sections 둘다 필요한 것 같음 🤔 ㅈ됌..
    }
}
