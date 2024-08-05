package com.hins.hinsojcodesandbox.security;

import java.security.Permission;

public class MySecurity extends SecurityManager{

    // 检查所有的权限
    @Override
    public void checkPermission(Permission perm) {
        super.checkPermission(perm);
    }

    // 检测程序是否可执行
    @Override
    public void checkExec(String cmd) {
//        super.checkExec(cmd);
        throw new SecurityException("权限异常" + cmd);
    }

    //检测程序是否允许读文件
    @Override
    public void checkRead(String file, Object context) {
//        super.checkRead(file, context);
        if (file.contains("hutool")){
            return;
        }
        throw new SecurityException("权限异常" + file);
    }

    //检测程序是否允许写文件
    @Override
    public void checkWrite(String file) {
//        super.checkWrite(file);
        throw new SecurityException("权限异常" + file);
    }

    //检测程序是否允许删除文件
    @Override
    public void checkDelete(String file) {
//        super.checkDelete(file);
        throw new SecurityException("权限异常" + file);
    }

    //检测程序是否允许文件连接网络
    @Override
    public void checkConnect(String host, int port) {
//        super.checkConnect(host, port);
        throw new SecurityException("权限异常" + host + ":" + port);
    }
}
