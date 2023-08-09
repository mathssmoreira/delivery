package services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DeliveryService {
    public String getName (){
        return "agora vai!";
    }
}
