public class BrowserHistory{
    private Stack backstack;
    private Stack forwardstack;
    private String currentpage;
    public BrowserHistory() {
        backstack=new Stack();
        forwardstack=new Stack();
        currentpage=null;
    }
    public void visit(String url){
        if (currentpage != null){
            backstack.push(currentpage);
        }
        currentpage = url;
        clearStack(forwardstack);
        System.out.println("visited: " +currentpage);
    }
    public void goBack(){
        if (backstack.isEmpty()) {
            System.out.println("cannot go back");
            return;
        }
        forwardstack.push(currentpage);
        currentpage=backstack.pop();
        System.out.println("went back to: " +currentpage);
    }
    public void goForward() {
        if (forwardstack.isEmpty()) {
            System.out.println("c go forward");
            return;
        }
        backstack.push(currentpage);
        currentpage=forwardstack.pop();
        System.out.println("went forward to: " + currentpage);
    }
    public void displayCurrentPage(){
        if(currentpage==null){
            System.out.println("no page is open");
        }else{
            System.out.println("current page: " + currentpage);
        }
    }
    private void clearStack(Stack stack){
        while(!stack.isEmpty()){
            stack.pop();
        }
    }
    public void displayHistory() {
        System.out.println("\n========== BROWSER HISTORY ==========");
        System.out.println("current page: " + currentpage);
        System.out.print("back stack (top -> bottom): ");
        backstack.display();
        System.out.print("forward stack (top -> bottom): ");
        forwardstack.display();
        System.out.println("=====================================");
    }
}