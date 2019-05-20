package pl.skoltun.kafka;

import org.apache.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;

public class Listener {
    private static final Logger log = Logger.getLogger(Listener.class);

    @KafkaListener(id = "pingListener", topics = "ping")
    public void listen(String ping) {
        log.info("Received: " + ping);
    }

}