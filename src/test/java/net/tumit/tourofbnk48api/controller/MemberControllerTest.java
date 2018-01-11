package net.tumit.tourofbnk48api.controller;

import net.tumit.tourofbnk48api.model.Member;
import net.tumit.tourofbnk48api.service.MemberService;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MemberControllerTest {

    private MemberController controller = new MemberController(new MemberService());

    @Test
    public void get() throws Exception {
        String slug = "cherprang";
        Member member = controller.get(slug);
        assertThat(member.getId()).isGreaterThan(0L);
        assertThat(member.getSlug()).isEqualTo("cherprang");
    }
}
