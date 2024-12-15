package com.synergisticit.domain;

import java.util.List;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Embeddable
public class Address {
	@NotEmpty
	private String addressLine1;
	
	@NotEmpty
	private String addressLine2;
	
	@NotEmpty
	private String city;
	
	private String state;
	
	@NotEmpty
	private String country;
	
	@NotEmpty
	private String zipcode;
	
	@NotEmpty
	private String phoneNumber;
}
