package com.tcode.cli;

import com.tcode.cli.command.ConfigCommand;
import com.tcode.cli.command.GenerateCommand;
import com.tcode.cli.command.ListCommand;
import picocli.CommandLine;

/**
 * @author 14378
 * @version 1.0
 * @description TODO
 * @date 2024/3/20 14:53
 */
@CommandLine.Command(name = "tcode", mixinStandardHelpOptions = true)
public class CommandExecutor implements Runnable {

    private final CommandLine commandLine;

    {
        commandLine = new CommandLine(this)
                .addSubcommand(new GenerateCommand())
                .addSubcommand(new ConfigCommand())
                .addSubcommand(new ListCommand());
    }

    @Override
    public void run() {
        // 不输入子命令时，给出友好提示
        System.out.println("请输入具体命令，或者输入 --help 查看命令提示");
    }

    /**
     * 执行命令
     *
     * @param args
     * @return
     */
    public Integer doExecute(String[] args) {
        return commandLine.execute(args);
    }
}