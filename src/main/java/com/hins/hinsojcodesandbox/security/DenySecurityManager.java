package com.hins.hinsojcodesandbox.security;

import java.security.Permission;

/**
 * 禁用所有权限的安全管理器
 */
public class DenySecurityManager extends SecurityManager{

    // 检查所有的权限
    @Override
    public void checkPermission(Permission perm) {
        throw new SecurityException("权限异常" + perm.toString());

    }
}
