package com.vv.spring.security.securitymysqljspsample1.Repository;

import com.vv.spring.security.securitymysqljspsample1.Entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login,Integer> {
  public Login findByUsername(String userName);
}
