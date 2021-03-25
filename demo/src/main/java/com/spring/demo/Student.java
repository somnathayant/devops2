
package com.spring.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student implements Serializable{

	/**
	 * serialVersionUID = -1108865748473840163L;
	 */
	private static final long serialVersionUID = -1108865748473840163L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first")
	private String firstName;
	
	@Column(name="last")
	private String lastName;
	
	@Column(name="year")
	private String year;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;	
		
}
