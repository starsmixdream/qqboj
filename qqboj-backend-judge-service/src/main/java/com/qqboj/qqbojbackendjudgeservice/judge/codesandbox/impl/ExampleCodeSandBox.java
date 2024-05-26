package com.qqboj.qqbojbackendjudgeservice.judge.codesandbox.impl;


import com.qqboj.qqbojbackendjudgeservice.judge.codesandbox.CodeSandBox;
import com.qqboj.qqbojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.qqboj.qqbojbackendmodel.codesandbox.ExecuteCodeResponse;
import com.qqboj.qqbojbackendmodel.codesandbox.JudgeInfo;
import com.qqboj.qqbojbackendmodel.model.enums.JudgeInfoMessageEnum;
import com.qqboj.qqbojbackendmodel.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * 示例代码沙箱(仅为了跑通业务流程)
 */
public class ExampleCodeSandBox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();

        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
