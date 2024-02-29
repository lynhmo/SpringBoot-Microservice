package gtel.code.eurekaclient.model;

import gtel.code.eurekaclient.payload.TokenRequest;
import gtel.code.eurekaclient.payload.TokenRes;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "auth-service")
public interface AuthServiceClient {
    @GetMapping("/auth")
    public String home1();


    @PostMapping("/auth/authenticate")
    public TokenRes authenticate(@RequestBody TokenRequest tokenRequest); // token lấy ra từ cookie sau khi đăng nhập
}
