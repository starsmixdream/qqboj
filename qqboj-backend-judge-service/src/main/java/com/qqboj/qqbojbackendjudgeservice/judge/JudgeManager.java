package com.qqboj.qqbojbackendjudgeservice.judge;

import com.qqboj.qqbojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.qqboj.qqbojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.qqboj.qqbojbackendjudgeservice.judge.strategy.JudgeContext;
import com.qqboj.qqbojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.qqboj.qqbojbackendmodel.codesandbox.JudgeInfo;
import com.qqboj.qqbojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理(简化调用)
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
