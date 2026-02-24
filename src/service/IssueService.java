package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        issues.add(new Issue("Cannot enroll in required course", 2));
        issues.add(new Issue("Transcript mismatch", 3));
        issues.add(new Issue("Final exam conflict", 1));
        issues.add(new Issue("Missing scholarship payment", 2));
        issues.add(new Issue("Portal login blocked", 4));
    }

    public void showMostUrgent() {
        Issue mostUrgent = issues.peek();
        if (mostUrgent == null) {
            System.out.println("No issues in queue.");
            return;
        }
        System.out.println("Most urgent issue: " + mostUrgent);
    }

    public void resolveIssues() {
        for (int i = 0; i < 2 && !issues.isEmpty(); i++) {
            System.out.println("Resolved: " + issues.poll());
        }
    }

    public void printRemainingIssues() {
        System.out.println("Remaining issues:");
        Iterator<Issue> iterator = issues.iterator();
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        issues.add(new Issue(description, urgency));
        System.out.println("Issue added.");
    }
}
