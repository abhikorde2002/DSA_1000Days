package Stack_Queue;

public class Dynamic_Que extends Circular {
    public Dynamic_Que(){
        super();
    }
    public Dynamic_Que(int size){
        super(size);
    }
    @Override
    public boolean insert(int item){
        if(isFull()){

            int tem[]=new int[data.length*2];
    
            for (int i = 0; i < tem.length; i++) {
                tem[i]=data[(front+i)%data.length];
            }
            front=0;
            end=data.length;
            data=tem;
        }
        return super.insert(item);
    }
}
