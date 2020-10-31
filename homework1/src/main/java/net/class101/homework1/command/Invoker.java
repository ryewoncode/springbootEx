package net.class101.homework1.command;

public class Invoker {
    private ICommand _command;

    // 필요한 기능을 인지로 받는다.
    public Invoker(ICommand command) {
        setCommand(command);
    }

    public void setCommand(ICommand newCommand) {
        _command = newCommand;
    }

    // 주어진 Command의 execute 메서드를 호출한다.
    public void run() {
        _command.execute();
    }
}
