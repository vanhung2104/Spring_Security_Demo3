package ute.hung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ute.hung.entity.Users;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
    @Query("select u from Users u where u.username = :username")
    public Users getUserByUsername(@Param("username") String username);
    Optional<Users> findByEmail(String email);
    Optional<Users> findByUsernameOrEmail(String username, String email);
    Optional<Users> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
