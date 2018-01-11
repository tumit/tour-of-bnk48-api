package net.tumit.tourofbnk48api;

import net.tumit.tourofbnk48api.controller.MemberController;
import net.tumit.tourofbnk48api.model.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TourOfBnk48ApiApplicationTests {

    @Autowired
    private MemberController memberController;

    @Test
    public void contextLoads() {
        // arrange
        String slug = "cherprang";
        // act
        Member member = memberController.get(slug);
        // assert
        assertThat(member.getId()).isGreaterThan(0L);
        assertThat(member.getSlug()).isEqualTo("cherprang");
    }
}
