package net.firestaff.mcp.LABInfiniteWebView.dao;

import net.firestaff.mcp.LABInfiniteWebView.model.GlobalDBModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface GlobalDBRepository extends CrudRepository<GlobalDBModel, Long>{
}
