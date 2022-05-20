package org.vipcube.spring.function.lambda.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Customer implements Serializable {
	@Id
	@GeneratedValue( generator = "UUID" )
	private Long id;

	private String name;
	private int customerIdentifier;
	private String email;
	private String contactPerson;
}
