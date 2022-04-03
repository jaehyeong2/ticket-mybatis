package jjfactory.ticket.controller.inquiry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InquiryController {
    @GetMapping("/inquiry")
    public String getInquiry(){
        return "QnA";
    }
}
