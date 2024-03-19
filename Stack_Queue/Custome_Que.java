package Stack_Queue;

public class Custome_Que {
    private int[] data;

    private static final int DEFAULT_SIZE = 10;
    int end=0;

    public Custome_Que(){
        this(DEFAULT_SIZE);
    }
    public Custome_Que(int size){
        this.data= new int[size];
    }

    public boolean isFull(){

        return end==data.length;
    }
    public boolean isEmpt(){
        return end==0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end]=item;
        end++;
        return true;
    }
    public int remove()throws Exception{
        if(isEmpt()) {
          throw new Exception("Queue is Empty");
        }
        int remove= data[0];
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return remove;
    }
    public int front() throws Exception{
        if(isEmpt()) {
          throw new Exception("Queue is Empty");
        }

        return data[0];
    }

    public void Display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i]+ " ");
        }
        System.out.println("END");
    }
    public static void main(String[] args) throws Exception {
        Custome_Que que= new Custome_Que(5);
        que.insert(1);
        que.insert(2);
        que.insert(3);
        que.insert(4);
        que.insert(5);
        que.Display();
        System.out.println(que.front());
    }
}
