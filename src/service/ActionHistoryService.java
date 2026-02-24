package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        actions.addLast("Submitted Assignment");
        actions.addLast("Dropped Course");
        actions.addLast("Registered Course");
        actions.addLast("Updated Profile");
    }

    public void undoLastAction() {
        if (actions.isEmpty()) {
            System.out.println("No actions to undo.");
            return;
        }
        System.out.println("Undone action: " + actions.removeLast());
    }

    public void addRequestedTranscript() {
        actions.addLast("Requested Transcript");
    }

    public void showFirstAndLast() {
        if (actions.isEmpty()) {
            System.out.println("No actions found.");
            return;
        }
        System.out.println("First action: " + actions.getFirst());
        System.out.println("Last action: " + actions.getLast());
    }

    public void printHistory() {
        System.out.println("Action history:");
        Iterator<String> iterator = actions.iterator();
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }
    }
}
