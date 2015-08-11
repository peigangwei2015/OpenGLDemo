package com.pgw.opengldemo;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;

public class MyRenderer implements GLSurfaceView.Renderer {
	private static final String TAG = null;
	/*
	 * 调用一次，用来配置View的OpenGL ES环境。
	 */
	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig config) {
		Log.v(TAG, "onSurfaceCreated");
		// Set the background frame color
		GLES20.glClearColor(0.0f, 0.0f, 1f, 0.0f);
	}
	
	/*
	 * 每次重新绘制View时被调用。
	 */
	@Override
	public void onDrawFrame(GL10 gl) {
//		Log.v(TAG, "onDrawFrame");
		// Redraw background color
		GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
	}

	/*
	 * 如果View的几何形态发生变化时会被调用，例如当设备的屏幕方向发生改变时。。
	 */
	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		Log.v(TAG, "onSurfaceChanged");
		GLES20.glViewport(0, 0, width, height);
	}

	
	

}
