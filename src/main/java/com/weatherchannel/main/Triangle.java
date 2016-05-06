package com.weatherchannel.main;

/**
 * @author Kent Fletcher
 *
 */
public class Triangle
{

  public static TriangleType getTriangleType(Double x, Double y, Double z)
  {

    TriangleType rtnType;
    
    //TODO
    /**
     * validate x,y,z using pythagorean theorem.  
     * Return 'TriangleType.INVALID_ARGS' if x, y, and z are found to be invalid
     */

    /*
     * Set rtnType to EQUILATERAL if all three sides are equal to each other
     */
    if (x.equals(y) && x.equals(z) && y.equals(z))
    {
      rtnType = TriangleType.EQUILATERAL;
    }
    /*
     * Set rtnType to ISOSCELESE if any two sides are equal to each other and
     * the third side is not equal to any of the other two sides
     */
    else if ((x.equals(y) && !x.equals(z)) || (x.equals(z) && !x.equals(y)) || (y.equals(x) && !y.equals(z))
        || (y.equals(z) && !y.equals(x)) || (z.equals(y) && !z.equals(x)) || (z.equals(x) && !z.equals(y)))
    {
      rtnType = TriangleType.ISOSCELESE;
    }

    /*
     * If either of the two previous conditions are not met, then by default all
     * three sides of the triangle do not equal each other and the triangle type
     * returned from this method is SCALENE
     */
    else
      rtnType = TriangleType.SCALENE;

    return rtnType;
  }

}
