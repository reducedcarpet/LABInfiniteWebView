package net.firestaff.mcp.LABInfiniteWebView;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@EnableCaching
public class Application {

    /*
    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/", "/login**", "/webjars/**", "/error**")
                .permitAll()
                .anyRequest()
                .authenticated();
    } /**/

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
