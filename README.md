# Basic-Delivery-App-Kafka-Demo

To run this app, latest version of kafka should be installed as well as zookeeper.

In terminal first run this command "zookeeper-server-start.sh {path to folder}/kafka/config/zookeeper.properties".

After this in another terminal run this command "kafka-server-start.sh {path to folder}/config/server.properties"

Keep both processess running in terminals and then run both microservices and then hit the post endpoint to see 100 updated locations in enduser app and the logs in deliveryboy app.
