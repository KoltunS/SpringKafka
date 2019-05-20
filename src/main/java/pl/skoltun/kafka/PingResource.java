package pl.skoltun.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingResource {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping(path = "/ping")
    public String ping() {
        kafkaTemplate.send("ping", "Ping "+System.currentTimeMillis());
        return "Pong!";
    }
}
