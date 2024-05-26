package com.qqboj.qqbojbackendquestionservice.controller.inner;

import com.qqboj.qqbojbackendmodel.model.entity.Question;
import com.qqboj.qqbojbackendmodel.model.entity.QuestionSubmit;
import com.qqboj.qqbojbackendquestionservice.service.QuestionService;
import com.qqboj.qqbojbackendquestionservice.service.QuestionSubmitService;
import com.qqboj.qqbojbackendserviceclient.service.QuestionFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 该服务仅内部调用，不是给前端的
 */
@RestController
@RequestMapping("/inner")
public class QuestionInnerController implements QuestionFeignClient {

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;

    @Override
    @GetMapping("/get/id")
    public Question getQuestionById(@RequestParam("questionId") long questionId) {
        return questionService.getById(questionId);
    }

    @Override
    @GetMapping("/question_submit/get/id")
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionSubmitId") long questionSubmitId) {
        // todo 返回结果为空
        return questionSubmitService.getQuestionSubmitById(questionSubmitId);
    }

    @Override
    @PostMapping("/question_submit/update")
    public boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit) {
        return questionSubmitService.updateById(questionSubmit);
    }


}
