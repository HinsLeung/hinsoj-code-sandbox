package com.hins.hinsojcodesandbox;


import com.hins.hinsojcodesandbox.model.ExecuteCodeRequest;
import com.hins.hinsojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
