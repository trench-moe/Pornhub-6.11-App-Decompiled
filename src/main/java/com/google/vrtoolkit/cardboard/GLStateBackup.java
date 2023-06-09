package com.google.vrtoolkit.cardboard;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
class GLStateBackup {
    private boolean cullFaceEnabled;
    private boolean depthTestEnabled;
    private boolean scissorTestEnabled;
    private IntBuffer viewport = IntBuffer.allocate(4);
    private IntBuffer texture2dId = IntBuffer.allocate(1);
    private IntBuffer textureUnit = IntBuffer.allocate(1);
    private IntBuffer scissorBox = IntBuffer.allocate(4);
    private IntBuffer shaderProgram = IntBuffer.allocate(1);
    private IntBuffer arrayBufferBinding = IntBuffer.allocate(1);
    private IntBuffer elementArrayBufferBinding = IntBuffer.allocate(1);
    private FloatBuffer clearColor = FloatBuffer.allocate(4);
    private ArrayList<VertexAttributeState> vertexAttributes = new ArrayList<>();

    /* loaded from: classes.dex */
    public class VertexAttributeState {
        private int attributeId;
        private IntBuffer enabled = IntBuffer.allocate(1);

        public VertexAttributeState(int i10) {
            this.attributeId = i10;
        }

        public void readFromGL() {
            GLES20.glGetVertexAttribiv(this.attributeId, 34338, this.enabled);
        }

        public void writeToGL() {
            if (this.enabled.array()[0] == 0) {
                GLES20.glDisableVertexAttribArray(this.attributeId);
            } else {
                GLES20.glEnableVertexAttribArray(this.attributeId);
            }
        }
    }

    public void addTrackedVertexAttribute(int i10) {
        this.vertexAttributes.add(new VertexAttributeState(i10));
    }

    public void clearTrackedVertexAttributes() {
        this.vertexAttributes.clear();
    }

    public void readFromGL() {
        GLES20.glGetIntegerv(2978, this.viewport);
        this.cullFaceEnabled = GLES20.glIsEnabled(2884);
        this.scissorTestEnabled = GLES20.glIsEnabled(3089);
        this.depthTestEnabled = GLES20.glIsEnabled(2929);
        GLES20.glGetFloatv(3106, this.clearColor);
        GLES20.glGetIntegerv(35725, this.shaderProgram);
        GLES20.glGetIntegerv(3088, this.scissorBox);
        GLES20.glGetIntegerv(34016, this.textureUnit);
        GLES20.glGetIntegerv(32873, this.texture2dId);
        GLES20.glGetIntegerv(34964, this.arrayBufferBinding);
        GLES20.glGetIntegerv(34965, this.elementArrayBufferBinding);
        Iterator<VertexAttributeState> it = this.vertexAttributes.iterator();
        while (it.hasNext()) {
            it.next().readFromGL();
        }
    }

    public void writeToGL() {
        Iterator<VertexAttributeState> it = this.vertexAttributes.iterator();
        while (it.hasNext()) {
            it.next().writeToGL();
        }
        GLES20.glBindBuffer(34962, this.arrayBufferBinding.array()[0]);
        GLES20.glBindBuffer(34963, this.elementArrayBufferBinding.array()[0]);
        GLES20.glBindTexture(3553, this.texture2dId.array()[0]);
        GLES20.glActiveTexture(this.textureUnit.array()[0]);
        GLES20.glScissor(this.scissorBox.array()[0], this.scissorBox.array()[1], this.scissorBox.array()[2], this.scissorBox.array()[3]);
        GLES20.glUseProgram(this.shaderProgram.array()[0]);
        GLES20.glClearColor(this.clearColor.array()[0], this.clearColor.array()[1], this.clearColor.array()[2], this.clearColor.array()[3]);
        if (this.cullFaceEnabled) {
            GLES20.glEnable(2884);
        } else {
            GLES20.glDisable(2884);
        }
        if (this.scissorTestEnabled) {
            GLES20.glEnable(3089);
        } else {
            GLES20.glDisable(3089);
        }
        if (this.depthTestEnabled) {
            GLES20.glEnable(2929);
        } else {
            GLES20.glDisable(2929);
        }
        GLES20.glViewport(this.viewport.array()[0], this.viewport.array()[1], this.viewport.array()[2], this.viewport.array()[3]);
    }
}
