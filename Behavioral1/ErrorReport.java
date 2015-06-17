
public class ErrorReport implements Observer{
    
    private Subject sub;
    private int timedout = 0;
    
    public void update(){
        timeout = sub.wasTimeoutError();
        if(timeout)
            timedout++;
    }
    
    public void setSubject(Subject sub){
        this.sub = sub
    }
    
    public int getCount(){
        return timedout;
    }

}