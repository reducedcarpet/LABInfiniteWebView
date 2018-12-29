package net.firestaff.mcp.LABInfiniteWebView.dao;

import net.firestaff.mcp.LABInfiniteWebView.model.GlobalDBModel;
import net.firestaff.mcp.LABInfiniteWebView.model.PatternModel;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface GlobalDBRepository extends CrudRepository<GlobalDBModel, Long>{

    @Cacheable("frames")
    List<GlobalDBModel> findAllByFramework(String framework);
}
