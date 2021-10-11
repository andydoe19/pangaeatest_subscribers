package pangaeatestsubscribers.contollers;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import java.util.Map;
import java.util.Optional;

@Controller("/")
public class SubscriberController {

    /************************
     * ENDPOINTS
     ************************/

    @Post("test1")
    public void receiveMessageForSubscriber1(HttpRequest<Map<String, Object>> request){

        //retrieve request body
        Optional<Map<String, Object>> bodyOptional = (Optional<Map<String, Object>>) request.getBody();
        System.out.println("about to check request body");
        if (bodyOptional.isPresent()) {
            System.out.println("Message received for Subscriber1 : ");
            System.out.println(bodyOptional.get().toString());
        }
    }

    @Post("test2")
    public void receiveMessageForSubscriber2(HttpRequest<Map<String, Object>> request){

        //retrieve request body
        Optional<Map<String, Object>> bodyOptional = (Optional<Map<String, Object>>) request.getBody();
        System.out.println("about to check request body");
        if (bodyOptional.isPresent()) {
            System.out.println("Message received for Subscriber2 : ");
            System.out.println(bodyOptional.get().toString());
        }
    }

    @Post("test3")
    public void receiveMessageForSubscriber3(HttpRequest<Map<String, Object>> request){

        //retrieve request body
        Optional<Map<String, Object>> bodyOptional = (Optional<Map<String, Object>>) request.getBody();
        System.out.println("about to check request body");
        if (bodyOptional.isPresent()) {
            System.out.println("Message received for Subscriber3 : ");
            System.out.println(bodyOptional.get().toString());
        }
    }

}