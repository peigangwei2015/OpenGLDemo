package com.pgw.opengldemo;
import android.content.Context;
import android.opengl.GLSurfaceView;


public class MySurfaceView extends GLSurfaceView {

	private MyRenderer myRenderer;

	public MySurfaceView(Context context) {
		super(context);
		// Create an OpenGL ES 2.0 context
		setEGLContextClientVersion(2);
		myRenderer = new MyRenderer();
		// Set the Renderer for drawing on the GLSurfaceView
		setRenderer(myRenderer);
	}
	

}
