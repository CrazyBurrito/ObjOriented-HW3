
public class CountReport implements Observer{
    
    private Subject sub;
    private int passed = 0;
    
    public void update(){
        passed++;
    }
    
    public void setSubject(Subject sub){
        this.sub = sub
    }
    
    public int getCount(){
        return passed;
    }

}