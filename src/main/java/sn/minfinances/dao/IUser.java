package sn.minfinances.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sn.minfinances.entities.User;

@Repository
public interface IUser extends JpaRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.email = ?1 ")
    public User getUserByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.email = :email ")
    public User getUserByEmail2(@Param(value = "email") String email);
}

