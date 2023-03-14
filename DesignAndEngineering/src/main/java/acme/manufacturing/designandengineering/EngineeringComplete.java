package acme.manufacturing.designandengineering;

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class EngineeringComplete {

	public EngineeringComplete () {
	}

	public EngineeringComplete (
		String eventId, 
		String productId, 
		java.time.OffsetDateTime completionDate, 
		String completedBy) {
		this.eventId = eventId;
		this.productId = productId;
		this.completionDate = completionDate;
		this.completedBy = completedBy;
	}

	private String eventId;
	private String productId;
	private java.time.OffsetDateTime completionDate;
	private String completedBy;
	public String getEventId() {
		return eventId;
	}

	public EngineeringComplete setEventId(String eventId) {
		this.eventId = eventId;
		return this;
	}


	public String getProductId() {
		return productId;
	}

	public EngineeringComplete setProductId(String productId) {
		this.productId = productId;
		return this;
	}


	public java.time.OffsetDateTime getCompletionDate() {
		return completionDate;
	}

	public EngineeringComplete setCompletionDate(java.time.OffsetDateTime completionDate) {
		this.completionDate = completionDate;
		return this;
	}


	public String getCompletedBy() {
		return completedBy;
	}

	public EngineeringComplete setCompletedBy(String completedBy) {
		this.completedBy = completedBy;
		return this;
	}

	public String toString() {
		return "EngineeringComplete ["
		+ " eventId: " + eventId
		+ " productId: " + productId
		+ " completionDate: " + completionDate
		+ " completedBy: " + completedBy
		+ " ]";
	}
}
