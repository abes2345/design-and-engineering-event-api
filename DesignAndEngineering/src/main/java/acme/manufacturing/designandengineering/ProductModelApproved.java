package acme.manufacturing.designandengineering;

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductModelApproved {

	public ProductModelApproved () {
	}

	public ProductModelApproved (
		String eventId, 
		Boolean designApproved, 
		String designFileUrl, 
		String productName, 
		String productType, 
		String designerName) {
		this.eventId = eventId;
		this.designApproved = designApproved;
		this.designFileUrl = designFileUrl;
		this.productName = productName;
		this.productType = productType;
		this.designerName = designerName;
	}

	private String eventId;
	private Boolean designApproved;
	private String designFileUrl;
	private String productName;
	private String productType;
	private String designerName;
	public String getEventId() {
		return eventId;
	}

	public ProductModelApproved setEventId(String eventId) {
		this.eventId = eventId;
		return this;
	}


	public Boolean getDesignApproved() {
		return designApproved;
	}

	public ProductModelApproved setDesignApproved(Boolean designApproved) {
		this.designApproved = designApproved;
		return this;
	}


	public String getDesignFileUrl() {
		return designFileUrl;
	}

	public ProductModelApproved setDesignFileUrl(String designFileUrl) {
		this.designFileUrl = designFileUrl;
		return this;
	}


	public String getProductName() {
		return productName;
	}

	public ProductModelApproved setProductName(String productName) {
		this.productName = productName;
		return this;
	}


	public String getProductType() {
		return productType;
	}

	public ProductModelApproved setProductType(String productType) {
		this.productType = productType;
		return this;
	}


	public String getDesignerName() {
		return designerName;
	}

	public ProductModelApproved setDesignerName(String designerName) {
		this.designerName = designerName;
		return this;
	}

	public String toString() {
		return "ProductModelApproved ["
		+ " eventId: " + eventId
		+ " designApproved: " + designApproved
		+ " designFileUrl: " + designFileUrl
		+ " productName: " + productName
		+ " productType: " + productType
		+ " designerName: " + designerName
		+ " ]";
	}
}
