package ie.atu.labexam_warehouseservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseController {
    private final NotificationService notificationService;
    @Autowired
    public WarehouseController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
