package com.weatherchannel.main;

import java.util.Iterator;
import java.util.List;

/**
 * @author Kent Fletcher
 *
 */
public class ListTools
{

  /**
   * This method returns the fifth element of List. If the list does not contain
   * at least five elements, the method will return null
   * 
   * @param argList
   * @return
   */
  public static Object getFifthElement(List<?> argList)
  {
    Object rtnFifthElement = null;

    /*
     * per requirements, we cannot use size() and length() methods on the List
     * class. Instead we use an iterator to traverse the list one time and use a
     * simple counter to keep track of the number of elements in this list
     */
    Iterator<?> itr = argList.iterator();

    int ctr = 0;

    while (itr.hasNext())
    {
      itr.next(); // increment the iterator
      ctr++; // keep count of how many elements we are traversing
    }

    if (ctr > 5)
      rtnFifthElement = argList.get(ctr - 5);

    return rtnFifthElement;
  }

  /**
   * This method will return a boolean value of true if every element of
   * 'thisList' is also in 'thatList'.  If not, this method will return false.
   * 
   * @param thisList
   * @param thatList
   * @return boolean
   */
  public static boolean isThisListInThatList(List<?> thisList, List<?> thatList)
  {
    boolean result = true;

    for (Object thisListObject : thisList)
    {
      if (!thatList.contains(thisListObject))
      {
        result = false;
        break;
      }

    }
    return result;
  }
}
