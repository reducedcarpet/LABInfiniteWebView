package net.firestaff.mcp.LABInfiniteWebView.dao;

import java.util.List;

import net.firestaff.mcp.LABInfiniteWebView.model.FullPatternView;
import org.springframework.data.repository.CrudRepository;

public interface PatternRepository extends CrudRepository<FullPatternView, Long> {

    List<FullPatternView> findByPatternName(String name);

    List<FullPatternView> findByPatternCategory(String category);

    List<FullPatternView> findByPropType(String prop);
}