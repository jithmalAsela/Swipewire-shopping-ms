package com.spring.repository;

import com.spring.model.Authorities;
import com.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AuthoritiesRepository extends JpaRepository<Authorities, Long> {
    Authorities findByUser(User user);

}
