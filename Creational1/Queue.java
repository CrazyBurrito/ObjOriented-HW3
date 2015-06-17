//Singleton Pattern

public class SingletonQueue {
    private static final SingletonQueue INSTANCE = new SingletonQueue();
 
    private SingletonQueue() {
        Queue<Submission> q = new LinkedList<Submission>();
    }
 
    public static SingletonQueue getInstance() {
        return INSTANCE;
    }
    
    public add(Submission s){
        q.add(s);
    }
    
    public Submission process(){
        s = q.removeFirst();
        System.out.println(s.id + " has been dequeued.");
    }
}