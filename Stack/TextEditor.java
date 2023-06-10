package Stack;

import java.util.*;

public class TextEditor {
    private StringBuilder text;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public TextEditor() {
        text = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void append(String str) {
        undoStack.push(text.toString());
        text.append(str);
    }

    public void delete(int length) {
        if (length <= text.length()) {
            undoStack.push(text.toString());
            text.delete(text.length() - length, text.length());
        }
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(text.toString());
            text = new StringBuilder(undoStack.pop());
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(text.toString());
            text = new StringBuilder(redoStack.pop());
        }
    }

    public String getText() {
        return text.toString();
    }

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("=== Text Editor ===");
            System.out.println("1. Append Text");
            System.out.println("2. Delete Text");
            System.out.println("3. Undo");
            System.out.println("4. Redo");
            System.out.println("5. Get Current Text");
            System.out.println("6. Exit");
            System.out.print("Enter command: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Enter text to append: ");
                    String appendText = scanner.nextLine();
                    textEditor.append(appendText);
                    System.out.println("Text appended successfully!");
                    break;
                case "2":
                    System.out.print("Enter length of text to delete: ");
                    int deleteLength = Integer.parseInt(scanner.nextLine());
                    textEditor.delete(deleteLength);
                    System.out.println("Text deleted successfully!");
                    break;
                case "3":
                    textEditor.undo();
                    System.out.println("Undo successful!");
                    break;
                case "4":
                    textEditor.redo();
                    System.out.println("Redo successful!");
                    break;
                case "5":
                    System.out.println("Current Text: " + textEditor.getText());
                    break;
                case "6":
                    System.out.println("Exiting Text Editor...");
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }

            System.out.println();
        } while (!command.equals("6"));
    }
}

