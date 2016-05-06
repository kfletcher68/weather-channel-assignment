package com.weatherchannel.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.weatherchannel.main.ListTools;
import com.weatherchannel.main.Triangle;
import com.weatherchannel.main.TriangleType;

public class WeatherChannelUnitTest
{

  @Test
  public void triangleTest()
  {

    /*
     * Assert that the method 'getTriangleType' returns an Equilateral triangle
     * type where x,y,z all equal 1
     */

    TriangleType tt = Triangle.getTriangleType(1.0, 1.0, 1.0);
    int i = tt.compareTo(TriangleType.EQUILATERAL);
    assert(i == 0);

    /*
     * Assert that the method 'getTriangleType' returns an Isoscelese triangle
     * type where at least two sides are equal
     */
    tt = Triangle.getTriangleType(2.0, 2.0, 4.0);
    i = tt.compareTo(TriangleType.ISOSCELESE);
    assert(i == 0);

    /*
     * Assert that the method 'getTriangleType' returns a Scalene triangle type
     * where at least two sides are equal
     */
    tt = Triangle.getTriangleType(2.0, 3.0, 3.60555127546);
    i = tt.compareTo(TriangleType.SCALENE);
    assert(i == 0);
  }

  @Test
  public void checkListCrossSection()
  {
    List<String> thisList = new ArrayList<String>();
    List<String> thatList = new ArrayList<String>();

    thisList.add("A");
    thisList.add("B");
    thisList.add("C");

    thatList.add("A");
    thatList.add("B");
    thatList.add("C");
    thatList.add("D");

    /*
     * given args thisList and thatList, determine if all thisList elements are
     * present in thatList
     */
    boolean ll;
    ll = ListTools.isThisListInThatList(thisList, thatList);
    assert(ll == true);

    thisList.clear();
    thatList.clear();

    thisList.add("A");
    thisList.add("B");

    thatList.add("A");
    thatList.add("C");

    ll = ListTools.isThisListInThatList(thisList, thatList);
    assert(ll == false);
  }
  
  @Test
  public void getFifthElementFromLast()
  {
    List<String> testList = new ArrayList<String>();
 
    testList.add("A");
    testList.add("B");
    testList.add("C");
    testList.add("D");
    testList.add("E");
    testList.add("G");

    String fifthElementFromLast = (String)ListTools.getFifthElement(testList);
    
    assert(fifthElementFromLast.equals("B"));
  }
}
