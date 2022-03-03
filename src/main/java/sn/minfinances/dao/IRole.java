package sn.minfinances.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.minfinances.entities.Role;

@Repository
public interface IRole  extends JpaRepository<Role, Integer> {
}
