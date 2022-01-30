package zangzangs.slf4jlogbacktraining.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import zangzangs.slf4jlogbacktraining.dto.MemberRequest;
import zangzangs.slf4jlogbacktraining.service.MemberService;

@RestController
@RequestMapping(value = "/api/v1/members")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody MemberRequest request) {
        memberService.save(request);
    }
}
