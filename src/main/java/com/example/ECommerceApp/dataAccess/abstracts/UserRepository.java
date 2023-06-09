package com.example.ECommerceApp.dataAccess.abstracts;


import com.example.ECommerceApp.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User getById(int id);

	User findByUserName(String userName);

//	@Query("from User where eMail=:eMail")
//	User findByEMail(String eMail);
}
