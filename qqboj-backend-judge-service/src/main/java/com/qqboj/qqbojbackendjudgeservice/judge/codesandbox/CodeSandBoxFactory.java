package com.qqboj.qqbojbackendjudgeservice.judge.codesandbox;


import com.qqboj.qqbojbackendjudgeservice.judge.codesandbox.impl.ThirdPartyCodeSandBox;
import com.qqboj.qqbojbackendjudgeservice.judge.codesandbox.impl.ExampleCodeSandBox;
import com.qqboj.qqbojbackendjudgeservice.judge.codesandbox.impl.RemoteCodeSandBox;

/**
 * 代码沙箱工厂(根据字符串参数创建指定的代码沙箱实例)
 */
public class CodeSandBoxFactory {

    /**
     * 创建代码沙箱实例
     * @param type 沙箱类型
     * @return
     */
    public static CodeSandBox newInstance(String type){
        switch (type) {
            case "example":
                return new ExampleCodeSandBox();
            case "remote":
                return new RemoteCodeSandBox();
            case "thirdParty":
                return new ThirdPartyCodeSandBox();
            default:
                return new ExampleCodeSandBox();
        }
    }
}
