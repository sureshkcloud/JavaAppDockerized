package com.Venu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
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
    public String home(Model model) {
        model.addAttribute("title", "I have successfully built a Spring Boot application using Maven");
        model.addAttribute("msg", "This application is deployed onto Kubernetes using Jenkins CI/CD");
        model.addAttribute("msg2", "Yay!!! Congratulations");
        model.addAttribute("k8sInfo", "Running on Pod: " + podName + 
                                        "<br>Pod Namespace: " + podNamespace +
                                        "<br>Node Name: " + nodeName +
                                        "<br>Image Name: " + imageName);
        return "index"; // Assumes that there is a template named 'index' in the template directory
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
