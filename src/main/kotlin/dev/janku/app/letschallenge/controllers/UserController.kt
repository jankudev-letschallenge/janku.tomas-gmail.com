package dev.janku.app.letschallenge.controllers

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class UserController {

    @GetMapping("/user")
    fun root(@AuthenticationPrincipal user: OAuth2User): OAuth2User {
        return user;
    }
}
