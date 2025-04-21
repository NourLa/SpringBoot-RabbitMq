# SpringBoot-RabbitMq

# RabbitMQ Messaging Project

RabbitMQ is a message broker that facilitates asynchronous communication between different services and applications.  
It is a robust and reliable tool used for managing and routing messages across distributed systems.

## Prerequisites

To run this project, ensure you have the following installed:

- **JDK 17 or later**
- **Maven**
- **IDE** (such as IntelliJ IDEA, Eclipse, etc.)
- **RabbitMQ Server**

### Installing RabbitMQ

You can install RabbitMQ easily using [Chocolatey](https://community.chocolatey.org/packages/rabbitmq):

```bash
choco install rabbitmq

RabbitMQ with the management UI accessible at http://localhost:15672 (default username/password: guest/guest).

#### Send Message using RabbitMQ
The project 'producer-service' will be run in port '8080' rather than the project 'consumer-service' will be accessible using port '8081'. so to send the message, you can use 'http://localhost:8080/send?message=HelloFromRabbitMq'
you will see in the logs of your consumer-service the message 'HelloFromRabbitMq'
