package com.google.vrtoolkit.cardboard;

import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import com.google.vrtoolkit.cardboard.CardboardView;

/* loaded from: classes.dex */
public interface CardboardViewApi {
    boolean getAlignmentMarkerEnabled();

    boolean getCardboardBackButtonEnabled();

    CardboardDeviceParams getCardboardDeviceParams();

    boolean getChromaticAberrationCorrectionEnabled();

    boolean getConvertTapIntoTrigger();

    void getCurrentEyeParams(HeadTransform headTransform, Eye eye, Eye eye2, Eye eye3, Eye eye4, Eye eye5);

    boolean getDistortionCorrectionEnabled();

    boolean getElectronicDisplayStabilizationEnabled();

    boolean getGyroBiasEstimationEnabled();

    HeadMountedDisplay getHeadMountedDisplay();

    float getInterpupillaryDistance();

    boolean getLowLatencyModeEnabled();

    float getNeckModelFactor();

    boolean getRestoreGLStateEnabled();

    ScreenParams getScreenParams();

    boolean getSettingsButtonEnabled();

    boolean getVRMode();

    boolean getVignetteEnabled();

    boolean handlesMagnetInput();

    void onDetachedFromWindow();

    void onPause();

    void onResume();

    boolean onTouchEvent(MotionEvent motionEvent);

    void renderUiLayer();

    void resetHeadTracker();

    void runOnCardboardBackListener();

    void runOnCardboardTriggerListener();

    void setAlignmentMarkerEnabled(boolean z10);

    void setChromaticAberrationCorrectionEnabled(boolean z10);

    void setConvertTapIntoTrigger(boolean z10);

    void setDistortionCorrectionEnabled(boolean z10);

    void setDistortionCorrectionScale(float f10);

    void setElectronicDisplayStabilizationEnabled(boolean z10);

    void setGyroBiasEstimationEnabled(boolean z10);

    void setLowLatencyModeEnabled(boolean z10);

    void setNeckModelEnabled(boolean z10);

    void setNeckModelFactor(float f10);

    void setOnCardboardBackButtonListener(Runnable runnable);

    void setOnCardboardBackListener(Runnable runnable);

    void setOnCardboardTriggerListener(Runnable runnable);

    GLSurfaceView.Renderer setRenderer(CardboardView.Renderer renderer);

    GLSurfaceView.Renderer setRenderer(CardboardView.StereoRenderer stereoRenderer);

    void setRestoreGLStateEnabled(boolean z10);

    void setSettingsButtonEnabled(boolean z10);

    void setVRModeEnabled(boolean z10);

    void setVignetteEnabled(boolean z10);

    void undistortTexture(int i10);

    void updateCardboardDeviceParams(CardboardDeviceParams cardboardDeviceParams);

    void updateScreenParams(ScreenParams screenParams);
}
