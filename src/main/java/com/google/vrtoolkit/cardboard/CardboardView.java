package com.google.vrtoolkit.cardboard;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import javax.microedition.khronos.egl.EGLConfig;

/* loaded from: classes.dex */
public class CardboardView extends GLSurfaceView {
    private CardboardViewApi cardboardViewApi;
    private boolean rendererIsSet;

    /* renamed from: com.google.vrtoolkit.cardboard.CardboardView$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements View.OnSystemUiVisibilityChangeListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i10) {
            if (CardboardView.this.getConvertTapIntoTrigger() && (i10 & 2) == 0) {
                CardboardView.this.cardboardViewApi.runOnCardboardTriggerListener();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface Renderer {
        @UsedByNative
        void onDrawFrame(HeadTransform headTransform, Eye eye, Eye eye2);

        @UsedByNative
        void onFinishFrame(Viewport viewport);

        void onRendererShutdown();

        void onSurfaceChanged(int i10, int i11);

        void onSurfaceCreated(EGLConfig eGLConfig);
    }

    /* loaded from: classes.dex */
    public interface StereoRenderer {
        @UsedByNative
        void onDrawEye(Eye eye);

        @UsedByNative
        void onFinishFrame(Viewport viewport);

        @UsedByNative
        void onNewFrame(HeadTransform headTransform);

        void onRendererShutdown();

        void onSurfaceChanged(int i10, int i11);

        void onSurfaceCreated(EGLConfig eGLConfig);
    }

    public CardboardView(Context context) {
        super(context);
        this.rendererIsSet = false;
        init(context);
    }

    public CardboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.rendererIsSet = false;
        init(context);
    }

    private void init(Context context) {
        this.cardboardViewApi = ImplementationSelector.createCardboardViewApi(context, this);
        setEGLContextClientVersion(2);
        setPreserveEGLContextOnPause(true);
    }

    public boolean getAlignmentMarkerEnabled() {
        return this.cardboardViewApi.getAlignmentMarkerEnabled();
    }

    public boolean getCardboardBackButtonEnabled() {
        return this.cardboardViewApi.getCardboardBackButtonEnabled();
    }

    public CardboardDeviceParams getCardboardDeviceParams() {
        return this.cardboardViewApi.getCardboardDeviceParams();
    }

    public boolean getChromaticAberrationCorrectionEnabled() {
        return this.cardboardViewApi.getChromaticAberrationCorrectionEnabled();
    }

    public boolean getConvertTapIntoTrigger() {
        return this.cardboardViewApi.getConvertTapIntoTrigger();
    }

    public void getCurrentEyeParams(HeadTransform headTransform, Eye eye, Eye eye2, Eye eye3, Eye eye4, Eye eye5) {
        this.cardboardViewApi.getCurrentEyeParams(headTransform, eye, eye2, eye3, eye4, eye5);
    }

    public boolean getDistortionCorrectionEnabled() {
        return this.cardboardViewApi.getDistortionCorrectionEnabled();
    }

    public boolean getElectronicDisplayStabilizationEnabled() {
        return this.cardboardViewApi.getElectronicDisplayStabilizationEnabled();
    }

    public boolean getGyroBiasEstimationEnabled() {
        return this.cardboardViewApi.getGyroBiasEstimationEnabled();
    }

    public HeadMountedDisplay getHeadMountedDisplay() {
        return this.cardboardViewApi.getHeadMountedDisplay();
    }

    public float getInterpupillaryDistance() {
        return this.cardboardViewApi.getInterpupillaryDistance();
    }

    public boolean getLowLatencyModeEnabled() {
        return this.cardboardViewApi.getLowLatencyModeEnabled();
    }

    public float getNeckModelFactor() {
        return this.cardboardViewApi.getNeckModelFactor();
    }

    public boolean getRestoreGLStateEnabled() {
        return this.cardboardViewApi.getRestoreGLStateEnabled();
    }

    public ScreenParams getScreenParams() {
        return this.cardboardViewApi.getScreenParams();
    }

    public boolean getSettingsButtonEnabled() {
        return this.cardboardViewApi.getSettingsButtonEnabled();
    }

    public boolean getVRMode() {
        return this.cardboardViewApi.getVRMode();
    }

    public boolean getVignetteEnabled() {
        return this.cardboardViewApi.getVignetteEnabled();
    }

    public boolean handlesMagnetInput() {
        return this.cardboardViewApi.handlesMagnetInput();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        if (this.rendererIsSet) {
            this.cardboardViewApi.onDetachedFromWindow();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.cardboardViewApi.onPause();
        if (this.rendererIsSet) {
            super.onPause();
        }
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        if (this.rendererIsSet) {
            super.onResume();
        }
        this.cardboardViewApi.onResume();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.cardboardViewApi.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.opengl.GLSurfaceView
    public void queueEvent(Runnable runnable) {
        if (this.rendererIsSet) {
            super.queueEvent(runnable);
        } else {
            runnable.run();
        }
    }

    public void renderUiLayer() {
        this.cardboardViewApi.renderUiLayer();
    }

    public void resetHeadTracker() {
        this.cardboardViewApi.resetHeadTracker();
    }

    public void setAlignmentMarkerEnabled(boolean z10) {
        this.cardboardViewApi.setAlignmentMarkerEnabled(z10);
    }

    public void setChromaticAberrationCorrectionEnabled(boolean z10) {
        this.cardboardViewApi.setChromaticAberrationCorrectionEnabled(z10);
    }

    public void setConvertTapIntoTrigger(boolean z10) {
        this.cardboardViewApi.setConvertTapIntoTrigger(z10);
    }

    public void setDistortionCorrectionEnabled(boolean z10) {
        this.cardboardViewApi.setDistortionCorrectionEnabled(z10);
    }

    public void setDistortionCorrectionScale(float f10) {
        this.cardboardViewApi.setDistortionCorrectionScale(f10);
    }

    public void setElectronicDisplayStabilizationEnabled(boolean z10) {
        this.cardboardViewApi.setElectronicDisplayStabilizationEnabled(z10);
    }

    public void setGyroBiasEstimationEnabled(boolean z10) {
        this.cardboardViewApi.setGyroBiasEstimationEnabled(z10);
    }

    public void setLowLatencyModeEnabled(boolean z10) {
        this.cardboardViewApi.setLowLatencyModeEnabled(z10);
    }

    public void setNeckModelEnabled(boolean z10) {
        this.cardboardViewApi.setNeckModelEnabled(z10);
    }

    public void setNeckModelFactor(float f10) {
        this.cardboardViewApi.setNeckModelFactor(f10);
    }

    public void setOnCardboardBackButtonListener(Runnable runnable) {
        this.cardboardViewApi.setOnCardboardBackButtonListener(runnable);
    }

    public void setOnCardboardBackListener(Runnable runnable) {
        this.cardboardViewApi.setOnCardboardBackListener(runnable);
    }

    public void setOnCardboardTriggerListener(Runnable runnable) {
        this.cardboardViewApi.setOnCardboardTriggerListener(runnable);
    }

    @Override // android.opengl.GLSurfaceView
    public void setRenderer(GLSurfaceView.Renderer renderer) {
        throw new RuntimeException("Please use the CardboardView renderer interfaces");
    }

    public void setRenderer(Renderer renderer) {
        GLSurfaceView.Renderer renderer2 = this.cardboardViewApi.setRenderer(renderer);
        if (renderer2 == null) {
            return;
        }
        super.setRenderer(renderer2);
        this.rendererIsSet = true;
    }

    public void setRenderer(StereoRenderer stereoRenderer) {
        GLSurfaceView.Renderer renderer = this.cardboardViewApi.setRenderer(stereoRenderer);
        if (renderer == null) {
            return;
        }
        super.setRenderer(renderer);
        this.rendererIsSet = true;
    }

    public void setRestoreGLStateEnabled(boolean z10) {
        this.cardboardViewApi.setRestoreGLStateEnabled(z10);
    }

    public void setSettingsButtonEnabled(boolean z10) {
        this.cardboardViewApi.setSettingsButtonEnabled(z10);
    }

    public void setVRModeEnabled(boolean z10) {
        this.cardboardViewApi.setVRModeEnabled(z10);
    }

    public void setVignetteEnabled(boolean z10) {
        this.cardboardViewApi.setVignetteEnabled(z10);
    }

    public void undistortTexture(int i10) {
        this.cardboardViewApi.undistortTexture(i10);
    }

    public void updateCardboardDeviceParams(CardboardDeviceParams cardboardDeviceParams) {
        this.cardboardViewApi.updateCardboardDeviceParams(cardboardDeviceParams);
    }

    public void updateScreenParams(ScreenParams screenParams) {
        this.cardboardViewApi.updateScreenParams(screenParams);
    }
}
