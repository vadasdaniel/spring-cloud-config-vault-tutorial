package blog.cloudnatives.messageservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageServiceController {

    @Value("${message.subject}")
    private String subject;

    @Value("${message.text}")
    private String text;

    @GetMapping("/{id}")
    public Message getMessage(@PathVariable("id") int id) {
        return new Message(id, subject, text);
    }

}
