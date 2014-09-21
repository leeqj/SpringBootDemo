package com.leeqj.server.repository;

import com.leeqj.server.common.BaseDao;
import com.leeqj.server.entitys.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
@Table(name = "Users")
// 默认将类中的所有public函数纳入事务管理.
//@Transactional(readOnly = true)
public interface UserRepository extends BaseDao{//CrudRepository<User, Long>

}