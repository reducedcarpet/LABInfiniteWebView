package net.firestaff.mcp.LABInfiniteWebView.dao;

import net.firestaff.mcp.LABInfiniteWebView.model.PatternModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PatternModelRepository extends CrudRepository<PatternModel, Long>{
}
