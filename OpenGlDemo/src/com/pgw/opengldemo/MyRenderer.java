package com.pgw.opengldemo;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;

public class MyRenderer implements GLSurfaceView.Renderer {
	private static final String TAG = null;
	/*
	 * ����һ�Σ���������View��OpenGL ES������
	 */
	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig config) {
		Log.v(TAG, "onSurfaceCreated");
		// Set the background frame color
		GLES20.glClearColor(0.0f, 0.0f, 1f, 0.0f);
	}
	
	/*
	 * ÿ�����»���Viewʱ�����á�
	 */
	@Override
	public void onDrawFrame(GL10 gl) {
//		Log.v(TAG, "onDrawFrame");
		// Redraw background color
		GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
	}

	/*
	 * ���View�ļ�����̬�����仯ʱ�ᱻ���ã����統�豸����Ļ�������ı�ʱ����
	 */
	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		Log.v(TAG, "onSurfaceChanged");
		GLES20.glViewport(0, 0, width, height);
	}

	
	

}
