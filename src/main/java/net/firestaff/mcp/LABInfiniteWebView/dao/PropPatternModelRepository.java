package net.firestaff.mcp.LABInfiniteWebView.dao;

import net.firestaff.mcp.LABInfiniteWebView.model.PropPatternModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PropPatternModelRepository extends CrudRepository<PropPatternModel, Long>{
}
