package collections.customcollectiondevelopment;

/**
 * Created by 609540082 on 19/02/2019.
 */
public class CustomCollectionDevelopment {

    Object objectArray [] = new Object[10];
    int elementCapacity=0;

    /**
     *1.Create an Object array with default size 10.
     * 2.check the length of array with elementCapacity
     *  if it is reached at the last then create a new Object array with double size and store copy the existing array into it and add the new elements
     *  3. increase the element capacity
     */

    public void add(Object obj)
    {
      if(elementCapacity == objectArray.length)
      {
          createnewObjectArray();
      }
      objectArray[elementCapacity]=obj;
      elementCapacity++;

    }

    public void createnewObjectArray()
    {
        int newCapacity = objectArray.length*2;
        Object [] newObjectArray = new Object[newCapacity];
        for(int i=0;i<objectArray.length;i++)
        {
            newObjectArray[i]= objectArray[i];
        }
        objectArray = newObjectArray;
    }

    public Object get(int index)
    {
        return objectArray[index];
    }
    public int size()
    {
        return elementCapacity;
    }
   // check the given index is less than the size of obj array
    // move all the elements from that given elements to left by 1 position
    // make the last index to null
    //
    public void remove(int index)
    {
        if(index<size())
        {
            for(int i =index;i<size()-1;index++)
            {
                objectArray[i]= objectArray[i+1];

            }
      objectArray[index]=null;
        }
    }

    public void getAllelements()
    {
        for(int i=0;i<elementCapacity;i++)
        {
            System.out.println(objectArray[i]);
        }
    }
}
