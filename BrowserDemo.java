public class BrowserDemo {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        browser.visit("google.com");
        browser.visit("youtube.com");
        browser.goBack();
        browser.visit("Facebook.com");
        browser.goBack();
        browser.goForward();
        browser.visit("stackoverflow.com");
        browser.displayCurrentPage();
        browser.displayHistory();
    }
}

// 1.

//initial state: null
//visit google: google.com
//visit youTube: youtube.com
//go back: google.com
//visit facebook: Facebook.com
//go back: google.com
//go forward: Facebook.com
//visit StackOverflow: stackoverflow.com


// 2.
//when a new page is visited the forward stack is cleared


// 3.

//stacks follow the LIFO principle
//they make back and forward navigation easy to manage


// 4.

// push():O(1)-inserts an element at the top
// pop():O(1)-removes the top element
// peek():O(1)-returns the top element
// visit():O(n)-clears the forward stack
// goBack():O(1)-uses push and pop
// goForward():O(1)-uses push and pop


