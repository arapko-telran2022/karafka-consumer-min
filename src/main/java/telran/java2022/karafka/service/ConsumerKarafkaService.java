package telran.java2022.karafka.service;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import telran.java2022.karafka.dto.PulseDto;

@Service
public class ConsumerKarafkaService {
    @Bean
    Consumer<PulseDto> receiveData() {
        return data -> {
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
            Long delay = System.currentTimeMillis() - data.getTimestamp();
            System.out.println("delay: " + delay + ", id: " + data.getId() + ", pulse: " + data.getData());
        };
    }
}
