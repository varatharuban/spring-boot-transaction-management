# Spring boot application for transaction management

**Annotations**
- @EnableTransactionManagement (org.springframework.transaction.annotation.EnableTransactionManagement)
- @Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)

**Payload**
```
{
    "passengerInfo" : {
		"name" : "Regan",
		"email" : "regan@gmail.com.sa",
		"source" : "Colombo",
		"destination" : "Singapore",
		"travelDate" : "11-11-2020",
		"pickupTime" : "04:20 AM",
		"arrivalTime" : "03:12 AM",
		"fare" : 10000.0
	},
	"paymentInfo": {
		"accountNo" : "acc2",
		"cardType" : "DEBIT"
	}
}
```
