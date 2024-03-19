package Stack_Queue;

public class Circular {
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;
    int end=0;
    int size=0;
    int front=0;
    public Circular(){
        this(DEFAULT_SIZE);
    }
    public Circular(int size){
        this.data= new int[size];
    }

    public boolean isFull(){

        return size==data.length;
    }
    public boolean isEmpt(){
        return size==0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }
    public int remove()throws Exception{
        if(isEmpt()) {
          throw new Exception("Queue is Empty");
        }
        int remove= data[front++];
        front= front%data.length;
        size--;
        return remove;
    }
    public int front() throws Exception{
        if(isEmpt()) {
          throw new Exception("Queue is Empty");
        }

        return data[front];
    }

    public void Display(){
        if(isEmpt()){
            System.out.println("Empty");
        }

        int i=front;
       do{
         System.out.print(data[i]+" ->");
         i++;
         i%=data.length;
       }
       while(i!=end);
      System.out.println("END");
    }

    public static void main(String[] args) throws Exception{
        Circular c= new Circular(5);
        c.insert(1);
        c.insert(2);
        c.insert(3);
        c.insert(4);

        c.insert(5);
        c.Display();
        c.remove();
        c.Display();

    }
}
