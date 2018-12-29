package net.firestaff.mcp.LABInfiniteWebView.dao;

import net.firestaff.mcp.LABInfiniteWebView.model.PatternModel;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface PatternModelRepository extends CrudRepository<PatternModel, Long>{

    List<PatternModel> findAllByCategory(String category);

    @Query("SELECT DISTINCT p.category FROM PatternModel p")
    @Cacheable("categories")
    List<String> findDistinctCategory();
}
