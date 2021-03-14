package com.project.bug_report.controller;

import com.project.bug_report.entity.Role;
import com.project.bug_report.model.request.CreateUserReq;
import com.project.bug_report.model.request.LoginReq;
import com.project.bug_report.service.IRoleService;
import com.project.bug_report.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import static com.project.bug_report.config.Constant.ROLE_USER;

@Controller
public class UserController {
    @Autowired private IUserService userService;
    @Autowired private IRoleService roleService;

    @GetMapping("/login")
    public String showLogin(Model model) {
        model.addAttribute("loginReq", new LoginReq());
        return "login_modal";
    }

//    @PostMapping("/api/login")
//    public ResponseEntity<?> login(@Valid @RequestBody LoginReq req, HttpServletResponse response) {
//        // Authenticate
//        Authentication authentication = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(
//                        req.getEmail(),
//                        req.getPassword()
//                )
//        );
//
//        // Gen token
////            String token = jwtTokenUtil.generateToken((CustomUserDetails) authentication.getPrincipal());
////
////            // Add token to cookie to login
////            Cookie cookie = new Cookie("JWT_TOKEN", token);
////            cookie.setMaxAge(MAX_AGE_COOKIE);
////            cookie.setPath("/");
////            response.addCookie(cookie);
//        return ResponseEntity.ok(UserMapper.toUserDto(((CustomUserDetails) authentication.getPrincipal()).getUser()));
//    }

    @GetMapping("/signup")
    public String showRegister() {
        return "register_modal";
    }

    @PostMapping("/api/register")
    public ResponseEntity<?> signupAccount(@RequestBody CreateUserReq req) {
        List<Role> roles = roleService.findRoleById(ROLE_USER);
        userService.createUser(req, roles);

        return ResponseEntity.ok("Đăng ký thành công!");
    }

}
