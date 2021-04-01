package main.java.com.sergeev.behavioral_pattern.command.example_command;

import main.java.com.sergeev.behavioral_pattern.command.editor.Editor;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
