package seedu.BrokeMan.command;

import seedu.BrokeMan.ui.Ui;

public class InvalidCommand extends Command {
    private String invalidMessage;

    public InvalidCommand(String invalidMessage) {
        this.invalidMessage = invalidMessage;
    }

    public void execute() {
        Ui.showToUserWithLineBreak(invalidMessage, "");
    }
}
