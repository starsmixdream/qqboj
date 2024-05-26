package com.qqboj.qqbojbackendjudgeservice.judge.strategy;


import com.qqboj.qqbojbackendmodel.codesandbox.JudgeInfo;

/**
 * 判题策略
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
