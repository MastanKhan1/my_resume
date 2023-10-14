package in.portfolio.portfolio_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.portfolio.portfolio_project.entity.User;


@Repository
public interface MyRepository extends JpaRepository<User, Integer> {

}
