package net.tumit.tourofbnk48api.service;

import net.tumit.tourofbnk48api.model.Member;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    public Member get(String slug) {
        return new Member(1L, slug);
    }
}
