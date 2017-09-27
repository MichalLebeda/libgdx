/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btPoolAllocator extends BulletBase {
	private long swigCPtr;
	
	protected btPoolAllocator(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btPoolAllocator, normally you should not need this constructor it's intended for low-level usage. */ 
	public btPoolAllocator(long cPtr, boolean cMemoryOwn) {
		this("btPoolAllocator", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btPoolAllocator obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				LinearMathJNI.delete_btPoolAllocator(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btPoolAllocator(int elemSize, int maxElements) {
    this(LinearMathJNI.new_btPoolAllocator(elemSize, maxElements), true);
  }

  public int getFreeCount() {
    return LinearMathJNI.btPoolAllocator_getFreeCount(swigCPtr, this);
  }

  public int getUsedCount() {
    return LinearMathJNI.btPoolAllocator_getUsedCount(swigCPtr, this);
  }

  public int getMaxCount() {
    return LinearMathJNI.btPoolAllocator_getMaxCount(swigCPtr, this);
  }

  public long allocate(int size) {
    return LinearMathJNI.btPoolAllocator_allocate(swigCPtr, this, size);
  }

  public boolean validPtr(long ptr) {
    return LinearMathJNI.btPoolAllocator_validPtr(swigCPtr, this, ptr);
  }

  public void freeMemory(long ptr) {
    LinearMathJNI.btPoolAllocator_freeMemory(swigCPtr, this, ptr);
  }

  public int getElementSize() {
    return LinearMathJNI.btPoolAllocator_getElementSize(swigCPtr, this);
  }

  public java.nio.ByteBuffer getPoolAddress() {
    return LinearMathJNI.btPoolAllocator_getPoolAddress__SWIG_0(swigCPtr, this);
}

}
