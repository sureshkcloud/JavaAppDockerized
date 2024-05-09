package com.Venu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class StartApplication {

    @Value("${MY_POD_NAME:not set}")
    private String podName;

    @Value("${MY_POD_NAMESPACE:not set}")
    private String podNamespace;

    @Value("${MY_NODE_NAME:not set}")
    private String nodeName;

    @Value("${MY_IMAGE_NAME:not set}")
    private String imageName;

    @GetMapping("/")
    public String home() {
        return "Running on Pod: " + podName + 
               "<br>Pod Namespace: " + podNamespace +
               "<br>Node Name: " + nodeName +
               "<br>Image Name: " + imageName;
        
@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "I have successfuly built a sprint boot application using Maven");
        model.addAttribute("msg", "This application is deployed on to Kubernetes using Jenkins CI/CD");
        model.addAttribute("msg2", "YaYYYY!!!!!! Congratulations");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
