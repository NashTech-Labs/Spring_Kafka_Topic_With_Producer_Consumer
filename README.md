## SpringBootKafka_Integration
"creating new repo"

## README
To Clone the git repository
```bash
git clone https://github.com/Shashikant-15/SpringBootKafka_Integration.git
```


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

### KAFKA-Assignments is:
* write producer and consumer in spring boot and integrate with Kafka.

### run the ApacheKafkaSpringBootApplication class for checking execution of assignments

#### you can open the file "output.png & postman.png to see the approriate Input and Output for springBootKafka Integration

