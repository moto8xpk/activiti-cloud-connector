package org.openweather.connector;

import org.activiti.cloud.common.messaging.functional.InputBinding;
import org.springframework.integration.dsl.MessageChannels;
import org.springframework.messaging.SubscribableChannel;

public interface ExampleConnectorChannels {
    String EXAMPLE_CONNECTOR_CONSUMER = "exampleConnectorConsumer";

    @InputBinding(EXAMPLE_CONNECTOR_CONSUMER)
    default SubscribableChannel exampleConnectorConsumer() {
        return MessageChannels.publishSubscribe(EXAMPLE_CONNECTOR_CONSUMER).getObject();
    }
}

