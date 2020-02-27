package collections.customcollectiondevelopment;

public class CustomCollection {
    private Object objectArray[] = new Object[4];
    private int capacity=0;

    public void add(Object object)
    {
       if(capacity==objectArray.length)
       {
       //todo capcacity increase
           increaseCapacity();
       }
       objectArray[capacity]= object;
       capacity++;
    }
    public void increaseCapacity()
    {
        int newCapacity = objectArray.length*2;
        Object newObjectArray [] = new Object[newCapacity];
        for(int i =0; i<objectArray.length;i++)
        {
            newObjectArray[i] = objectArray[i];
        }
        objectArray = newObjectArray;
    }

    public void getAll()
    {
        for(Object object :objectArray)
        {
            System.out.println("Elements in the list"+object);
        }
    }
    public Object get(int index)
    {
        return objectArray[index];
    }
    public int size()
    {
    return capacity;
    }

    public void replace(int index,Object obj)
    {
    objectArray[index]= obj;

    }
    public void removeElement(int index)
    {
     while(index<size()-1){
      objectArray[index] = objectArray[index+1];
      index++;
    }
    objectArray[index]= null;
        capacity--;
    }

}
