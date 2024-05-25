package team.mreal.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import team.mreal.demo.dto.PracticeDto;
import team.mreal.demo.service.PracticeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Slf4j
@RestController
@RequestMapping("/api/practice")
public class PracticeController {

    @Autowired
    private PracticeService practiceService;

    @GetMapping("/getData")
    public List<PracticeDto> getMethodName() {
        log.info(":::::::TEST가 실행되었습니다::::::::");
        return practiceService.getData();
    }
    

}
