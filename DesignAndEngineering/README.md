# Design and Engineering Event API

## Version 0.1.0

* CAD system publishes "Product Model" events when a new product or part design is created, modified or completed.
* ERP system publishes "Product Model Approved" events when a new product or part design is approved.
* CAD system subscribes to "Product Model Approved" events when a new product or part design is approved.
* PLM system subscribes to "Product Model" events to initiate and manage the product engineering process.
* PLM system publishes "Engineering completed" event when the engineering process is completed.
* MES system subscribes to "Engineering completed" event to initiate the production process.

