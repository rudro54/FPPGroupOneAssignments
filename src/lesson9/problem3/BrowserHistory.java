package lesson9.problem3;

import java.util.Stack;

public class BrowserHistory {
    private String url;
    private Stack<String> backwardPages;
    private Stack<String> forwardPages;

    BrowserHistory() {
        this.url = null;
        this.backwardPages = new Stack<String>();
        this.forwardPages = new Stack<String>();
    }
    BrowserHistory(String url) {
        backwardPages = new Stack<String>();
        forwardPages = new Stack<String>();
        visit(url);
    }
    public void visit(String url) {
        if(url == null || url.isEmpty())
            return;
        if(this.url != null)
            backwardPages.push(this.url);
        this.url = url;
        System.out.println("Visited: " + url);
    }
    public void back() {
        if (backwardPages.isEmpty()) {
            System.out.println("No history to go back to.");
            return;
        }
        forwardPages.push(url);
        url = backwardPages.pop();
        System.out.println("Back to: " + url);
    }
    public void forward() {
        if (forwardPages.isEmpty()) {
            System.out.println("No forward history.");
            return;
        }
        backwardPages.push(url);
        url = forwardPages.pop();
        System.out.println("Forward to: " + url);
    }

    @Override
    public String toString() {
        return "Current Page: " + url +
                " Backward Pages: " + backwardPages +
                " Forward Pages: " + forwardPages;
    }
}
