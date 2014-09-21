package com.leeqj.server.common;

import com.leeqj.server.entitys.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BaseDao extends PagingAndSortingRepository<User, Long>,JpaSpecificationExecutor<User> {

}