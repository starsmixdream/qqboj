package com.qqboj.qqbojbackendserviceclient.service;


import com.qqboj.qqbojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 判题服务
 */
@FeignClient(name = "yuoj-backend-judge-service", path = "/api/judge/inner")
public interface JudgeFeignClient {

    /**
     * 判题
     *
     * @param questionSubmitId
     * @return
     */
    @PostMapping("/do")
    default QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId) {
        return null;
    }
}
