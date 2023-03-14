package acme.manufacturing.designandengineering;

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductModelModified {

	public ProductModelModified () {
	}

	public ProductModelModified (
		String eventId, 
		String productId, 
		String[] modifiedFields) {
		this.eventId = eventId;
		this.productId = productId;
		this.modifiedFields = modifiedFields;
	}

	private String eventId;
	private String productId;
	private String[] modifiedFields;
	public String getEventId() {
		return eventId;
	}

	public ProductModelModified setEventId(String eventId) {
		this.eventId = eventId;
		return this;
	}


	public String getProductId() {
		return productId;
	}

	public ProductModelModified setProductId(String productId) {
		this.productId = productId;
		return this;
	}


	public String[] getModifiedFields() {
		return modifiedFields;
	}

	public ProductModelModified setModifiedFields(String[] modifiedFields) {
		this.modifiedFields = modifiedFields;
		return this;
	}

	public String toString() {
		return "ProductModelModified ["
		+ " eventId: " + eventId
		+ " productId: " + productId
		+ " modifiedFields: " + modifiedFields
		+ " ]";
	}
}
