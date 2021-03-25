package com.spring.demo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","students"})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable{

	/**serialVersionUID = -8996434083247738473L;
	 * 
	 */
	private static final long serialVersionUID = -8996434083247738473L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer add_id;
	
	@Column(name="city")
	private String city;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy="address",
            cascade =  CascadeType.ALL
            )
	
	private List<Student> students;
 
	//setter and getter
	
	public Integer getAdd_id() {
		return add_id;
	}

	public void setAdd_id(Integer add_id) {
		this.add_id = add_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	

	
	
}
