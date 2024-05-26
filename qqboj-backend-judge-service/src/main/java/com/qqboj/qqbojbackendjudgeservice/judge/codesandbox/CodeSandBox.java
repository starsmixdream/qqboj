package com.qqboj.qqbojbackendjudgeservice.judge.codesandbox;


import com.qqboj.qqbojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.qqboj.qqbojbackendmodel.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandBox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);

}
