/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.julien.openpaceandroidstudiotest;

public final class s_type {
  public final static s_type PACE_MRZ = new s_type("PACE_MRZ", eacJNI.PACE_MRZ_get());
  public final static s_type PACE_CAN = new s_type("PACE_CAN");
  public final static s_type PACE_PIN = new s_type("PACE_PIN");
  public final static s_type PACE_PUK = new s_type("PACE_PUK");
  public final static s_type PACE_RAW = new s_type("PACE_RAW");
  public final static s_type PACE_SEC_UNDEF = new s_type("PACE_SEC_UNDEF");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static s_type swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + s_type.class + " with value " + swigValue);
  }

  private s_type(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private s_type(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private s_type(String swigName, s_type swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static s_type[] swigValues = { PACE_MRZ, PACE_CAN, PACE_PIN, PACE_PUK, PACE_RAW, PACE_SEC_UNDEF };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

