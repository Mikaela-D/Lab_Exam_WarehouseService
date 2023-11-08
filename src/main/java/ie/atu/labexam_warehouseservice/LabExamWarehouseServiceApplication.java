package ie.atu.labexam_warehouseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabExamWarehouseServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabExamWarehouseServiceApplication.class, args);
    }

}
