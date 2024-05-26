package com.qqboj.qqbojbackendjudgeservice.judge.codesandbox.impl;


import com.qqboj.qqbojbackendjudgeservice.judge.codesandbox.CodeSandBox;
import com.qqboj.qqbojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.qqboj.qqbojbackendmodel.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱(调用网上现成的代码沙箱)
 */
public class ThirdPartyCodeSandBox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
