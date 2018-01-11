package net.tumit.tourofbnk48api.controller;

import lombok.RequiredArgsConstructor;
import net.tumit.tourofbnk48api.model.Member;
import net.tumit.tourofbnk48api.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MemberController {

    private final MemberService memberService;

    public Member get(String slug) {
        return memberService.get(slug);
    }
}
