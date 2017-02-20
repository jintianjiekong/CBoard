package org.cboard.dao;

import org.cboard.pojo.DashboardJob;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yfyuan on 2017/2/17.
 */
@Repository
public interface JobDao {
    int save(DashboardJob job);

    int update(DashboardJob job);

    List<DashboardJob> getJobList(String userId);

    int delete(Long jobId);
}