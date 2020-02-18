package com.loulysoft.onlinebookstore.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Entity
@Table(name = "tbl_book")
@Data
public class Book implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String sku;

	private String name;

	private String description;

	@Column(name = "unit_price")
	private BigDecimal unitPrice;

	@Column(name = "image_url")
	private String imageUrl;

	private boolean active;

	@Column(name = "units_in_stock")
	private int unitsInStock;

	@Column(name = "date_created")
	private Date createdOn;

	@Column(name = "last_updated")
	private Date updatedOn;

	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private BookCategory category;

	
}
