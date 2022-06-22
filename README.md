## README

## SpringBootKafka_Integration

### Templates Description :
* write producer and consumer in spring boot and integrate with Kafka.

### To Start the Zookeeper Server and Kafka Server

* Change directory to the directory where Apache Kafka is downloaded 
* execute the following command to start the Zookeeper Server.
```bash
bin/zookeeper-server-start.sh config/zookeeper.properties
```

### In a new terminal execute the following command to start the Kafka Server.
```bash
bin/kafka-server-start.sh config/server.properties
```
### In a new terminal execute the following command to create the topic for kafka.
```bash
bin/kafka-topics.sh --create --topic test_topic3 --bootstrap-server localhost:9092
```

### run the ApacheKafkaSpringBootApplication class for checking execution of assignments
### Requirements:
* Java 8 or more
* Java Platform (JDK) 8
* Apache Maven 3.x

### Quick start
````
mvn clean spring-boot:run
````


