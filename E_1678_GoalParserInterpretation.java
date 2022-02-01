public class Solution {
    public String interpret(String command) {
                command=command.replace("(al)","al");
                command=command.replace("()","o");

        return command;

    }
}