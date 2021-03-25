package com.spring.demo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



/*public interface StudentRepository extends CrudRepository<Student, Long> {

}*/

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>,Serializable {
		
	
	/*@Query("SELECT t.title FROM Todo t where t.id = :id") 
    String findTitleById(@Param("id") Long id);
   */
		@Query("SELECT st.year FROM Student st where st.id <= :id")
		public Iterable<Student>getStudentsLessThanOrEqualParam(@Param("id") Long id);
}