package com.tcode.cli.example;

import picocli.CommandLine;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

// 1）首先命令类需要实现 Callable 接口
public class Login implements Callable<Integer> {
    @Option(names = {"-u", "--user"}, description = "User name")
    String user;

    // 2）将 @Option 注解的 interactive 参数设置为 true，表示该选项支持交互式输入
    @Option(names = {"-p", "--password"}, description = "Passphrase", interactive = true)
    String password;

    @Option(names = {"-cp", "--checkPassword"}, description = "Check Password", interactive = true)
    String checkPassword;

    // 3）在所有参数都输入完成后，会执行 call 方法，可以在该方法中编写具体的业务逻辑：
    public Integer call() throws Exception {
        System.out.println("password = " + password);
        System.out.println("checkPassword = " + checkPassword);
        return 0;
    }

    // 4）在 Main 方法中执行命令并传入参数：
    public static void main(String[] args) {
        new CommandLine(new Login()).execute("-u", "user123", "-p", "-cp");
    }
}