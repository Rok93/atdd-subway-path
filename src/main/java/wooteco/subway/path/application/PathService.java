package wooteco.subway.path.application;

import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.springframework.stereotype.Service;
import wooteco.subway.line.dao.LineDao;
import wooteco.subway.line.dao.SectionDao;

@Service
public class PathService {

    private final LineDao lineDao;
    private final DijkstraShortestPath

    public PathService(SectionDao sectionDao) {
        this.sectionDao = sectionDao;
    }


}
