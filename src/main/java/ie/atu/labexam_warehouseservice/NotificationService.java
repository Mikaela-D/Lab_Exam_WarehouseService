package ie.atu.labexam_warehouseservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface NotificationService {
    @FeignClient(warehouseId = "confirmation-service", url = "http://localhost:8082")
    public interface NotificationService {
        @PostMapping("/confirm")
        String addProduct(@RequestBody WarehouseDetails warehouseDetails);
    }
}
