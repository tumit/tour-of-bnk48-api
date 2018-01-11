package net.tumit.tourofbnk48api.controller;

import net.tumit.tourofbnk48api.model.Member;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    public Member get(String slug) {
        return new Member(1L, slug);
    }
}
