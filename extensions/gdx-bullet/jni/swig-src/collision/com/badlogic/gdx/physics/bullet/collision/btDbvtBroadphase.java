/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btDbvtBroadphase extends btBroadphaseInterface {
	private long swigCPtr;
	
	protected btDbvtBroadphase(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btDbvtBroadphase_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btDbvtBroadphase, normally you should not need this constructor it's intended for low-level usage. */
	public btDbvtBroadphase(long cPtr, boolean cMemoryOwn) {
		this("btDbvtBroadphase", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btDbvtBroadphase_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btDbvtBroadphase obj) {
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
				CollisionJNI.delete_btDbvtBroadphase(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setSets(btDbvt value) {
    CollisionJNI.btDbvtBroadphase_sets_set(swigCPtr, this, btDbvt.getCPtr(value), value);
  }

  public btDbvt getSets() {
    long cPtr = CollisionJNI.btDbvtBroadphase_sets_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btDbvt(cPtr, false);
  }

  public void setStageRoots(SWIGTYPE_p_p_btDbvtProxy value) {
    CollisionJNI.btDbvtBroadphase_stageRoots_set(swigCPtr, this, SWIGTYPE_p_p_btDbvtProxy.getCPtr(value));
  }

  public SWIGTYPE_p_p_btDbvtProxy getStageRoots() {
    long cPtr = CollisionJNI.btDbvtBroadphase_stageRoots_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_btDbvtProxy(cPtr, false);
  }

  public void setPaircache(btOverlappingPairCache value) {
    CollisionJNI.btDbvtBroadphase_paircache_set(swigCPtr, this, btOverlappingPairCache.getCPtr(value), value);
  }

  public btOverlappingPairCache getPaircache() {
    long cPtr = CollisionJNI.btDbvtBroadphase_paircache_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btOverlappingPairCache(cPtr, false);
  }

  public void setPrediction(float value) {
    CollisionJNI.btDbvtBroadphase_prediction_set(swigCPtr, this, value);
  }

  public float getPrediction() {
    return CollisionJNI.btDbvtBroadphase_prediction_get(swigCPtr, this);
  }

  public void setStageCurrent(int value) {
    CollisionJNI.btDbvtBroadphase_stageCurrent_set(swigCPtr, this, value);
  }

  public int getStageCurrent() {
    return CollisionJNI.btDbvtBroadphase_stageCurrent_get(swigCPtr, this);
  }

  public void setFupdates(int value) {
    CollisionJNI.btDbvtBroadphase_fupdates_set(swigCPtr, this, value);
  }

  public int getFupdates() {
    return CollisionJNI.btDbvtBroadphase_fupdates_get(swigCPtr, this);
  }

  public void setDupdates(int value) {
    CollisionJNI.btDbvtBroadphase_dupdates_set(swigCPtr, this, value);
  }

  public int getDupdates() {
    return CollisionJNI.btDbvtBroadphase_dupdates_get(swigCPtr, this);
  }

  public void setCupdates(int value) {
    CollisionJNI.btDbvtBroadphase_cupdates_set(swigCPtr, this, value);
  }

  public int getCupdates() {
    return CollisionJNI.btDbvtBroadphase_cupdates_get(swigCPtr, this);
  }

  public void setNewpairs(int value) {
    CollisionJNI.btDbvtBroadphase_newpairs_set(swigCPtr, this, value);
  }

  public int getNewpairs() {
    return CollisionJNI.btDbvtBroadphase_newpairs_get(swigCPtr, this);
  }

  public void setFixedleft(int value) {
    CollisionJNI.btDbvtBroadphase_fixedleft_set(swigCPtr, this, value);
  }

  public int getFixedleft() {
    return CollisionJNI.btDbvtBroadphase_fixedleft_get(swigCPtr, this);
  }

  public void setUpdates_call(long value) {
    CollisionJNI.btDbvtBroadphase_updates_call_set(swigCPtr, this, value);
  }

  public long getUpdates_call() {
    return CollisionJNI.btDbvtBroadphase_updates_call_get(swigCPtr, this);
  }

  public void setUpdates_done(long value) {
    CollisionJNI.btDbvtBroadphase_updates_done_set(swigCPtr, this, value);
  }

  public long getUpdates_done() {
    return CollisionJNI.btDbvtBroadphase_updates_done_get(swigCPtr, this);
  }

  public void setUpdates_ratio(float value) {
    CollisionJNI.btDbvtBroadphase_updates_ratio_set(swigCPtr, this, value);
  }

  public float getUpdates_ratio() {
    return CollisionJNI.btDbvtBroadphase_updates_ratio_get(swigCPtr, this);
  }

  public void setPid(int value) {
    CollisionJNI.btDbvtBroadphase_pid_set(swigCPtr, this, value);
  }

  public int getPid() {
    return CollisionJNI.btDbvtBroadphase_pid_get(swigCPtr, this);
  }

  public void setCid(int value) {
    CollisionJNI.btDbvtBroadphase_cid_set(swigCPtr, this, value);
  }

  public int getCid() {
    return CollisionJNI.btDbvtBroadphase_cid_get(swigCPtr, this);
  }

  public void setGid(int value) {
    CollisionJNI.btDbvtBroadphase_gid_set(swigCPtr, this, value);
  }

  public int getGid() {
    return CollisionJNI.btDbvtBroadphase_gid_get(swigCPtr, this);
  }

  public void setReleasepaircache(boolean value) {
    CollisionJNI.btDbvtBroadphase_releasepaircache_set(swigCPtr, this, value);
  }

  public boolean getReleasepaircache() {
    return CollisionJNI.btDbvtBroadphase_releasepaircache_get(swigCPtr, this);
  }

  public void setDeferedcollide(boolean value) {
    CollisionJNI.btDbvtBroadphase_deferedcollide_set(swigCPtr, this, value);
  }

  public boolean getDeferedcollide() {
    return CollisionJNI.btDbvtBroadphase_deferedcollide_get(swigCPtr, this);
  }

  public void setNeedcleanup(boolean value) {
    CollisionJNI.btDbvtBroadphase_needcleanup_set(swigCPtr, this, value);
  }

  public boolean getNeedcleanup() {
    return CollisionJNI.btDbvtBroadphase_needcleanup_get(swigCPtr, this);
  }

  public void setRayTestStacks(SWIGTYPE_p_btAlignedObjectArrayT_btAlignedObjectArrayT_btDbvtNode_const_p_t_t value) {
    CollisionJNI.btDbvtBroadphase_rayTestStacks_set(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btAlignedObjectArrayT_btDbvtNode_const_p_t_t.getCPtr(value));
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btAlignedObjectArrayT_btDbvtNode_const_p_t_t getRayTestStacks() {
    long cPtr = CollisionJNI.btDbvtBroadphase_rayTestStacks_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_btAlignedObjectArrayT_btAlignedObjectArrayT_btDbvtNode_const_p_t_t(cPtr, false);
  }

  public btDbvtBroadphase(btOverlappingPairCache paircache) {
    this(CollisionJNI.new_btDbvtBroadphase__SWIG_0(btOverlappingPairCache.getCPtr(paircache), paircache), true);
  }

  public btDbvtBroadphase() {
    this(CollisionJNI.new_btDbvtBroadphase__SWIG_1(), true);
  }

  public void collide(btDispatcher dispatcher) {
    CollisionJNI.btDbvtBroadphase_collide(swigCPtr, this, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public void optimize() {
    CollisionJNI.btDbvtBroadphase_optimize(swigCPtr, this);
  }

  public void rayTest(Vector3 rayFrom, Vector3 rayTo, btBroadphaseRayCallback rayCallback, Vector3 aabbMin, Vector3 aabbMax) {
    CollisionJNI.btDbvtBroadphase_rayTest__SWIG_0(swigCPtr, this, rayFrom, rayTo, btBroadphaseRayCallback.getCPtr(rayCallback), rayCallback, aabbMin, aabbMax);
  }

  public void rayTest(Vector3 rayFrom, Vector3 rayTo, btBroadphaseRayCallback rayCallback, Vector3 aabbMin) {
    CollisionJNI.btDbvtBroadphase_rayTest__SWIG_1(swigCPtr, this, rayFrom, rayTo, btBroadphaseRayCallback.getCPtr(rayCallback), rayCallback, aabbMin);
  }

  public void rayTest(Vector3 rayFrom, Vector3 rayTo, btBroadphaseRayCallback rayCallback) {
    CollisionJNI.btDbvtBroadphase_rayTest__SWIG_2(swigCPtr, this, rayFrom, rayTo, btBroadphaseRayCallback.getCPtr(rayCallback), rayCallback);
  }

  public btOverlappingPairCache getOverlappingPairCache() {
    long cPtr = CollisionJNI.btDbvtBroadphase_getOverlappingPairCache__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btOverlappingPairCache(cPtr, false);
  }

  public void performDeferredRemoval(btDispatcher dispatcher) {
    CollisionJNI.btDbvtBroadphase_performDeferredRemoval(swigCPtr, this, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public void setVelocityPrediction(float prediction) {
    CollisionJNI.btDbvtBroadphase_setVelocityPrediction(swigCPtr, this, prediction);
  }

  public float getVelocityPrediction() {
    return CollisionJNI.btDbvtBroadphase_getVelocityPrediction(swigCPtr, this);
  }

  public void setAabbForceUpdate(btBroadphaseProxy absproxy, Vector3 aabbMin, Vector3 aabbMax, btDispatcher arg3) {
    CollisionJNI.btDbvtBroadphase_setAabbForceUpdate(swigCPtr, this, btBroadphaseProxy.getCPtr(absproxy), absproxy, aabbMin, aabbMax, btDispatcher.getCPtr(arg3), arg3);
  }

  public static void benchmark(btBroadphaseInterface arg0) {
    CollisionJNI.btDbvtBroadphase_benchmark(btBroadphaseInterface.getCPtr(arg0), arg0);
  }

  public btDbvt getSet(int index) {
    long cPtr = CollisionJNI.btDbvtBroadphase_getSet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new btDbvt(cPtr, false);
  }

  public btDbvt getSet0() {
    long cPtr = CollisionJNI.btDbvtBroadphase_getSet0(swigCPtr, this);
    return (cPtr == 0) ? null : new btDbvt(cPtr, false);
  }

  public btDbvt getSet1() {
    long cPtr = CollisionJNI.btDbvtBroadphase_getSet1(swigCPtr, this);
    return (cPtr == 0) ? null : new btDbvt(cPtr, false);
  }

  public final static int DYNAMIC_SET = 0;
  public final static int FIXED_SET = 1;
  public final static int STAGECOUNT = 2;

}
