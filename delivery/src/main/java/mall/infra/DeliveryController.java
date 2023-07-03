package mall.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import mall.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/deliveries")
@Transactional
public class DeliveryController {

    @Autowired
    DeliveryRepository deliveryRepository;

    @RequestMapping(
        value = "deliveries/{id}/deliverycomplet",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Delivery deliveryComplet(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /delivery/deliveryComplet  called #####");
        Optional<Delivery> optionalDelivery = deliveryRepository.findById(id);

        optionalDelivery.orElseThrow(() -> new Exception("No Entity Found"));
        Delivery delivery = optionalDelivery.get();
        delivery.deliveryComplet();

        deliveryRepository.save(delivery);
        return delivery;
    }

    @RequestMapping(
        value = "deliveries/{id}/deliverystart",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Delivery deliveryStart(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /delivery/deliveryStart  called #####");
        Optional<Delivery> optionalDelivery = deliveryRepository.findById(id);

        optionalDelivery.orElseThrow(() -> new Exception("No Entity Found"));
        Delivery delivery = optionalDelivery.get();
        delivery.deliveryStart();

        deliveryRepository.save(delivery);
        return delivery;
    }

    @RequestMapping(
        value = "deliveries/{id}/returndelivery",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Delivery returnDelivery(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /delivery/returnDelivery  called #####");
        Optional<Delivery> optionalDelivery = deliveryRepository.findById(id);

        optionalDelivery.orElseThrow(() -> new Exception("No Entity Found"));
        Delivery delivery = optionalDelivery.get();
        delivery.returnDelivery();

        deliveryRepository.save(delivery);
        return delivery;
    }
}
