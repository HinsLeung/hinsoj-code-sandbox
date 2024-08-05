package com.hins.hinsojcodesandbox.unsafe;

/**
 * 无限占用时间(阻塞程序执行）
 */
public class SleepError {
    public static void main(String[] args) throws InterruptedException {
        long ONE_HOUR = 60*60*1000L;
        Thread.sleep(ONE_HOUR);
        System.out.println("睡完了");
    }
}
