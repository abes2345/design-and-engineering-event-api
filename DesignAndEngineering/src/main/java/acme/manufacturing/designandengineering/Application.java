package acme.manufacturing.designandengineering;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	@Autowired
	private StreamBridge streamBridge;

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}


	@Bean
	public Consumer<ProductModelApproved> acmeManufacturingScProductModelApprovedV1CadProductModelIdConsumer() {
		return data -> {
			// Add business logic here.	
			logger.info(data.toString());
		};
	}


	@Bean
	public Consumer<ProductModelModified> acmeManufacturingScProductModelModifiedV1CadProductModelIdConsumer() {
		return data -> {
			// Add business logic here.	
			logger.info(data.toString());
		};
	}


	@Bean
	public Consumer<EngineeringComplete> acmeManufacturingScProductEngineeringCompleteV1PlmProductModelIdConsumer() {
		return data -> {
			// Add business logic here.	
			logger.info(data.toString());
		};
	}


	@Bean
	public Consumer<ProductModelComplete> acmeManufacturingScProductModelCompleteV1CadProductModelIdConsumer() {
		return data -> {
			// Add business logic here.	
			logger.info(data.toString());
		};
	}


	@Bean
	public Consumer<ProductModelCreated> acmeManufacturingScProductModelCreatedV1CadProductModelIdConsumer() {
		return data -> {
			// Add business logic here.	
			logger.info(data.toString());
		};
	}

	public void sendAcmeManufacturingScProductModelApprovedV1CadProductModelId(
		ProductModelApproved payload, String productModelId
		) {
		String topic = String.format("acmeManufacturing/sc/product/model/approved/v1/cad/%s",
			productModelId);
		streamBridge.send(topic, payload);
	}
	public void sendAcmeManufacturingScProductModelModifiedV1CadProductModelId(
		ProductModelModified payload, String productModelId
		) {
		String topic = String.format("acmeManufacturing/sc/product/model/modified/v1/cad/%s",
			productModelId);
		streamBridge.send(topic, payload);
	}
	public void sendAcmeManufacturingScProductEngineeringCompleteV1PlmProductModelId(
		EngineeringComplete payload, String productModelId
		) {
		String topic = String.format("acmeManufacturing/sc/product/engineering/complete/v1/plm/%s",
			productModelId);
		streamBridge.send(topic, payload);
	}
	public void sendAcmeManufacturingScProductModelCompleteV1CadProductModelId(
		ProductModelComplete payload, String productModelId
		) {
		String topic = String.format("acmeManufacturing/sc/product/model/complete/v1/cad/%s",
			productModelId);
		streamBridge.send(topic, payload);
	}
	public void sendAcmeManufacturingScProductModelCreatedV1CadProductModelId(
		ProductModelCreated payload, String productModelId
		) {
		String topic = String.format("acmeManufacturing/sc/product/model/created/v1/cad/%s",
			productModelId);
		streamBridge.send(topic, payload);
	}
}
