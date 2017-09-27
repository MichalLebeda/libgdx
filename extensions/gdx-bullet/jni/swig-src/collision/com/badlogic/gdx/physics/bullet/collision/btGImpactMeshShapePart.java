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

public class btGImpactMeshShapePart extends btGImpactShapeInterface {
	private long swigCPtr;
	
	protected btGImpactMeshShapePart(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btGImpactMeshShapePart_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGImpactMeshShapePart, normally you should not need this constructor it's intended for low-level usage. */
	public btGImpactMeshShapePart(long cPtr, boolean cMemoryOwn) {
		this("btGImpactMeshShapePart", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btGImpactMeshShapePart_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btGImpactMeshShapePart obj) {
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
				CollisionJNI.delete_btGImpactMeshShapePart(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  static public class TrimeshPrimitiveManager extends btPrimitiveManagerBase {
  	private long swigCPtr;
  	
  	protected TrimeshPrimitiveManager(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_SWIGUpcast(cPtr), cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new TrimeshPrimitiveManager, normally you should not need this constructor it's intended for low-level usage. */
  	public TrimeshPrimitiveManager(long cPtr, boolean cMemoryOwn) {
  		this("TrimeshPrimitiveManager", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
  	}
  	
  	public static long getCPtr(TrimeshPrimitiveManager obj) {
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
  				CollisionJNI.delete_btGImpactMeshShapePart_TrimeshPrimitiveManager(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void setMargin(float value) {
      CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_margin_set(swigCPtr, this, value);
    }
  
    public float getMargin() {
      return CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_margin_get(swigCPtr, this);
    }
  
    public void setMeshInterface(btStridingMeshInterface value) {
      CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_meshInterface_set(swigCPtr, this, btStridingMeshInterface.getCPtr(value), value);
    }
  
    public btStridingMeshInterface getMeshInterface() {
      long cPtr = CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_meshInterface_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btStridingMeshInterface(cPtr, false);
    }
  
    public void setScale(btVector3 value) {
      CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_scale_set(swigCPtr, this, btVector3.getCPtr(value), value);
    }
  
    public btVector3 getScale() {
      long cPtr = CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_scale_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btVector3(cPtr, false);
    }
  
    public void setPart(int value) {
      CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_part_set(swigCPtr, this, value);
    }
  
    public int getPart() {
      return CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_part_get(swigCPtr, this);
    }
  
    public void setLock_count(int value) {
      CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_lock_count_set(swigCPtr, this, value);
    }
  
    public int getLock_count() {
      return CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_lock_count_get(swigCPtr, this);
    }
  
    public void setVertexbase(java.nio.ByteBuffer value) {
      assert value.isDirect() : "Buffer must be allocated direct.";
      {
        CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_vertexbase_set(swigCPtr, this, value);
      }
    }
  
    public java.nio.ByteBuffer getVertexbase() {
      return CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_vertexbase_get(swigCPtr, this);
  }
  
    public void setNumverts(int value) {
      CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_numverts_set(swigCPtr, this, value);
    }
  
    public int getNumverts() {
      return CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_numverts_get(swigCPtr, this);
    }
  
    public void setType(int value) {
      CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_type_set(swigCPtr, this, value);
    }
  
    public int getType() {
      return CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_type_get(swigCPtr, this);
    }
  
    public void setStride(int value) {
      CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_stride_set(swigCPtr, this, value);
    }
  
    public int getStride() {
      return CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_stride_get(swigCPtr, this);
    }
  
    public void setIndexbase(java.nio.ByteBuffer value) {
      assert value.isDirect() : "Buffer must be allocated direct.";
      {
        CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_indexbase_set(swigCPtr, this, value);
      }
    }
  
    public java.nio.ByteBuffer getIndexbase() {
      return CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_indexbase_get(swigCPtr, this);
  }
  
    public void setIndexstride(int value) {
      CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_indexstride_set(swigCPtr, this, value);
    }
  
    public int getIndexstride() {
      return CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_indexstride_get(swigCPtr, this);
    }
  
    public void setNumfaces(int value) {
      CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_numfaces_set(swigCPtr, this, value);
    }
  
    public int getNumfaces() {
      return CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_numfaces_get(swigCPtr, this);
    }
  
    public void setIndicestype(int value) {
      CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_indicestype_set(swigCPtr, this, value);
    }
  
    public int getIndicestype() {
      return CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_indicestype_get(swigCPtr, this);
    }
  
    public TrimeshPrimitiveManager() {
      this(CollisionJNI.new_btGImpactMeshShapePart_TrimeshPrimitiveManager__SWIG_0(), true);
    }
  
    public TrimeshPrimitiveManager(btGImpactMeshShapePart.TrimeshPrimitiveManager manager) {
      this(CollisionJNI.new_btGImpactMeshShapePart_TrimeshPrimitiveManager__SWIG_1(btGImpactMeshShapePart.TrimeshPrimitiveManager.getCPtr(manager), manager), true);
    }
  
    public TrimeshPrimitiveManager(btStridingMeshInterface meshInterface, int part) {
      this(CollisionJNI.new_btGImpactMeshShapePart_TrimeshPrimitiveManager__SWIG_2(btStridingMeshInterface.getCPtr(meshInterface), meshInterface, part), true);
    }
  
    public void lock() {
      CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_lock(swigCPtr, this);
    }
  
    public void unlock() {
      CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_unlock(swigCPtr, this);
    }
  
    public int get_vertex_count() {
      return CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_get_vertex_count(swigCPtr, this);
    }
  
    public void get_indices(int face_index, SWIGTYPE_p_unsigned_int i0, SWIGTYPE_p_unsigned_int i1, SWIGTYPE_p_unsigned_int i2) {
      CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_get_indices(swigCPtr, this, face_index, SWIGTYPE_p_unsigned_int.getCPtr(i0), SWIGTYPE_p_unsigned_int.getCPtr(i1), SWIGTYPE_p_unsigned_int.getCPtr(i2));
    }
  
    public void get_vertex(long vertex_index, Vector3 vertex) {
      CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_get_vertex(swigCPtr, this, vertex_index, vertex);
    }
  
    public void get_bullet_triangle(int prim_index, btTriangleShapeEx triangle) {
      CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_get_bullet_triangle(swigCPtr, this, prim_index, btTriangleShapeEx.getCPtr(triangle), triangle);
    }
  
  }

  public btGImpactMeshShapePart() {
    this(CollisionJNI.new_btGImpactMeshShapePart__SWIG_0(), true);
  }

  public btGImpactMeshShapePart(btStridingMeshInterface meshInterface, int part) {
    this(CollisionJNI.new_btGImpactMeshShapePart__SWIG_1(btStridingMeshInterface.getCPtr(meshInterface), meshInterface, part), true);
  }

  public btCollisionShape getChildShape(int index) {
    long cPtr = CollisionJNI.btGImpactMeshShapePart_getChildShape__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
  }

  public btGImpactMeshShapePart.TrimeshPrimitiveManager getTrimeshPrimitiveManager() {
    long cPtr = CollisionJNI.btGImpactMeshShapePart_getTrimeshPrimitiveManager(swigCPtr, this);
    return (cPtr == 0) ? null : new btGImpactMeshShapePart.TrimeshPrimitiveManager(cPtr, false);
  }

  public int getVertexCount() {
    return CollisionJNI.btGImpactMeshShapePart_getVertexCount(swigCPtr, this);
  }

  public void getVertex(int vertex_index, Vector3 vertex) {
    CollisionJNI.btGImpactMeshShapePart_getVertex(swigCPtr, this, vertex_index, vertex);
  }

  public int getPart() {
    return CollisionJNI.btGImpactMeshShapePart_getPart(swigCPtr, this);
  }

}
