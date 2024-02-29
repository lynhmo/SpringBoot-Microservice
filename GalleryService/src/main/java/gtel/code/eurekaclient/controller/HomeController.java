package gtel.code.eurekaclient.controller;

import gtel.code.eurekaclient.entities.Gallery;
import gtel.code.eurekaclient.model.AuthServiceClient;
import gtel.code.eurekaclient.payload.BaseResDTO;
import gtel.code.eurekaclient.payload.TokenRequest;
import gtel.code.eurekaclient.payload.TokenRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/gallery")
public class HomeController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Environment env;

    @Autowired
    private AuthServiceClient authServiceClient;


    @RequestMapping("/")
    public String home() {
        String res = authServiceClient.home1();
        return "Hello from Gallery Service running at port: " + env.getProperty("local.server.port")+ "//////// "+res;
    }

    @PostMapping ("/auth")
    public ResponseEntity<?> test(@RequestBody TokenRequest tokenRequest) {
        TokenRes check = authServiceClient.authenticate(tokenRequest);
        return ResponseEntity.ok(new BaseResDTO("success",check));
    }

    @RequestMapping("/{id}")
    public Gallery getGallery(@PathVariable final int id) {
        // create gallery object
        Gallery gallery = new Gallery();
        gallery.setId(id);
        List<Object> images = null;
        // get list of available images
        try {
            images = restTemplate.getForObject("http://image-service/images", List.class);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        gallery.setImages(images);

        return gallery;
    }

    // -------- Admin Area --------
    // This method should only be accessed by users with role of 'admin' // We'll add the logic of role based auth later  @RequestMapping("/admin")
    public String homeAdmin() {
        return "This is the admin area of Gallery service running at port: " + env.getProperty("local.server.port");
    }
}
