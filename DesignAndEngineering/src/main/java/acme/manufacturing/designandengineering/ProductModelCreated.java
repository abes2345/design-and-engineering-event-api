package acme.manufacturing.designandengineering;

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductModelCreated {

	public ProductModelCreated () {
	}

	public ProductModelCreated (
		String eventId, 
		String productId, 
		String createdBy, 
		java.time.OffsetDateTime creationDate, 
		String productType) {
		this.eventId = eventId;
		this.productId = productId;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.productType = productType;
	}

	private String eventId;
	private String productId;
	private String createdBy;
	private java.time.OffsetDateTime creationDate;
	private String productType;
	public String getEventId() {
		return eventId;
	}

	public ProductModelCreated setEventId(String eventId) {
		this.eventId = eventId;
		return this;
	}


	public String getProductId() {
		return productId;
	}

	public ProductModelCreated setProductId(String productId) {
		this.productId = productId;
		return this;
	}


	public String getCreatedBy() {
		return createdBy;
	}

	public ProductModelCreated setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
		return this;
	}


	public java.time.OffsetDateTime getCreationDate() {
		return creationDate;
	}

	public ProductModelCreated setCreationDate(java.time.OffsetDateTime creationDate) {
		this.creationDate = creationDate;
		return this;
	}


	public String getProductType() {
		return productType;
	}

	public ProductModelCreated setProductType(String productType) {
		this.productType = productType;
		return this;
	}

	public String toString() {
		return "ProductModelCreated ["
		+ " eventId: " + eventId
		+ " productId: " + productId
		+ " createdBy: " + createdBy
		+ " creationDate: " + creationDate
		+ " productType: " + productType
		+ " ]";
	}
}
