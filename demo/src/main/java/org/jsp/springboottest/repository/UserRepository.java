package org.jsp.springboottest.repository;


import org.jsp.springboottest.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Integer>
{
   @Query("select u from user u where u.phone=?1 and u.password=?2")
   public User findByPhone(long phone,String password);
   
   @Query("select u from user u where u.email=?1 and u.password=?2")
   public User findByEmail(String email,String password);
}
