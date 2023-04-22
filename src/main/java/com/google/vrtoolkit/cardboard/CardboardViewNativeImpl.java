package com.google.vrtoolkit.cardboard;

import android.app.Activity;
import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import android.view.MotionEvent;
import com.google.vr.cardboard.DisplaySynchronizer;
import com.google.vrtoolkit.cardboard.CardboardView;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import uc.d;
import uc.e;
import uc.f;
import uc.g;

@UsedByNative
/* loaded from: classes.dex */
public class CardboardViewNativeImpl implements CardboardViewApi {
    private static final String TAG = "CardboardViewNativeImpl";
    private Runnable cardboardBackListener;
    private Handler cardboardBackListenerHandler;
    private Runnable cardboardTriggerListener;
    private Handler cardboardTriggerListenerHandler;
    private DisplaySynchronizer displaySynchronizer;
    private final GLSurfaceView glSurfaceView;
    private HeadMountedDisplayManager hmdManager;
    private final long nativeCardboardView;
    private RendererHelper rendererHelper;
    private CountDownLatch shutdownLatch;
    private g uiLayer;
    private boolean convertTapIntoTrigger = true;
    private int cardboardTriggerCount = 0;
    private boolean vrMode = true;
    private volatile boolean restoreGLStateEnabled = true;
    private volatile boolean distortionCorrectionEnabled = true;
    private volatile boolean lowLatencyModeEnabled = false;
    private volatile boolean chromaticAberrationCorrectionEnabled = false;
    private volatile boolean vignetteEnabled = true;
    private volatile boolean electronicDisplayStabilizationEnabled = false;
    private volatile boolean uiLayerAlignmentMarkerEnabled = true;
    private volatile boolean uiLayerAttached = false;

    /* loaded from: classes.dex */
    public class RendererHelper implements GLSurfaceView.Renderer {
        private EGLDisplay eglDisplay;
        private HeadMountedDisplay hmd;
        private boolean invalidSurfaceSizeWarningShown;
        private CardboardView.Renderer renderer;
        private CardboardView.StereoRenderer stereoRenderer;
        private boolean surfaceCreated;
        private boolean vrMode;

        public RendererHelper() {
            this.hmd = new HeadMountedDisplay(CardboardViewNativeImpl.this.getHeadMountedDisplay());
            this.vrMode = CardboardViewNativeImpl.this.vrMode;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void callOnRendererShutdown() {
            CardboardView.Renderer renderer = this.renderer;
            if (renderer != null) {
                renderer.onRendererShutdown();
                return;
            }
            CardboardView.StereoRenderer stereoRenderer = this.stereoRenderer;
            if (stereoRenderer != null) {
                stereoRenderer.onRendererShutdown();
            }
        }

        private void callOnSurfaceChanged(int i10, int i11) {
            CardboardView.Renderer renderer = this.renderer;
            if (renderer != null) {
                renderer.onSurfaceChanged(i10, i11);
                return;
            }
            CardboardView.StereoRenderer stereoRenderer = this.stereoRenderer;
            if (stereoRenderer != null) {
                if (this.vrMode) {
                    stereoRenderer.onSurfaceChanged(i10 / 2, i11);
                    return;
                }
                stereoRenderer.onSurfaceChanged(i10, i11);
            }
        }

        private void callOnSurfaceCreated(EGLConfig eGLConfig) {
            CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
            cardboardViewNativeImpl.nativeOnSurfaceCreated(cardboardViewNativeImpl.nativeCardboardView);
            CardboardView.Renderer renderer = this.renderer;
            if (renderer != null) {
                renderer.onSurfaceCreated(eGLConfig);
                return;
            }
            CardboardView.StereoRenderer stereoRenderer = this.stereoRenderer;
            if (stereoRenderer != null) {
                stereoRenderer.onSurfaceCreated(eGLConfig);
            }
        }

        public void getCurrentEyeParams(final HeadTransform headTransform, final Eye eye, final Eye eye2, final Eye eye3, final Eye eye4, final Eye eye5) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            CardboardViewNativeImpl.this.queueEvent(new Runnable() { // from class: com.google.vrtoolkit.cardboard.CardboardViewNativeImpl.RendererHelper.3
                @Override // java.lang.Runnable
                public void run() {
                    CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                    cardboardViewNativeImpl.nativeGetCurrentEyeParams(cardboardViewNativeImpl.nativeCardboardView, headTransform, eye, eye2, eye3, eye4, eye5);
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                String str = CardboardViewNativeImpl.TAG;
                String valueOf = String.valueOf(e10.toString());
                Log.e(str, valueOf.length() != 0 ? "Interrupted while reading frame params: ".concat(valueOf) : new String("Interrupted while reading frame params: "));
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            if ((this.renderer != null || this.stereoRenderer != null) && this.surfaceCreated) {
                long j10 = 0;
                if (CardboardViewNativeImpl.this.lowLatencyModeEnabled) {
                    TraceCompat.beginSection("Sync");
                    j10 = CardboardViewNativeImpl.this.displaySynchronizer.b();
                    TraceCompat.endSection();
                }
                TraceCompat.beginSection("Render");
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeOnDrawFrame(cardboardViewNativeImpl.nativeCardboardView);
                TraceCompat.endSection();
                if (!CardboardViewNativeImpl.this.lowLatencyModeEnabled) {
                    EGL14.eglSwapInterval(this.eglDisplay, 1);
                    return;
                }
                EGLExt.eglPresentationTimeANDROID(this.eglDisplay, EGL14.eglGetCurrentSurface(12377), j10 - 1000000);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            if ((this.renderer != null || this.stereoRenderer != null) && this.surfaceCreated) {
                ScreenParams screenParams = this.hmd.getScreenParams();
                if (!this.vrMode || (i10 == screenParams.getWidth() && i11 == screenParams.getHeight())) {
                    this.invalidSurfaceSizeWarningShown = false;
                    CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                    cardboardViewNativeImpl.nativeOnSurfaceChanged(cardboardViewNativeImpl.nativeCardboardView, i10, i11);
                    callOnSurfaceChanged(i10, i11);
                }
                if (!this.invalidSurfaceSizeWarningShown) {
                    String str = CardboardViewNativeImpl.TAG;
                    int width = screenParams.getWidth();
                    int height = screenParams.getHeight();
                    StringBuilder sb2 = new StringBuilder(134);
                    sb2.append("Surface size ");
                    sb2.append(i10);
                    sb2.append("x");
                    sb2.append(i11);
                    sb2.append(" does not match the expected screen size ");
                    sb2.append(width);
                    sb2.append("x");
                    sb2.append(height);
                    sb2.append(". Stereo rendering might feel off.");
                    Log.e(str, sb2.toString());
                }
                this.invalidSurfaceSizeWarningShown = true;
                CardboardViewNativeImpl cardboardViewNativeImpl2 = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl2.nativeOnSurfaceChanged(cardboardViewNativeImpl2.nativeCardboardView, i10, i11);
                callOnSurfaceChanged(i10, i11);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            if (this.renderer == null && this.stereoRenderer == null) {
                return;
            }
            this.surfaceCreated = true;
            if (!CardboardViewNativeImpl.this.uiLayerAttached) {
                g gVar = CardboardViewNativeImpl.this.uiLayer;
                ((Activity) gVar.f15835a).runOnUiThread(new d(gVar, null));
                CardboardViewNativeImpl.this.uiLayerAttached = true;
            }
            this.eglDisplay = EGL14.eglGetCurrentDisplay();
            callOnSurfaceCreated(eGLConfig);
        }

        public void setRenderer(CardboardView.Renderer renderer) {
            this.renderer = renderer;
            CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
            cardboardViewNativeImpl.nativeSetRenderer(cardboardViewNativeImpl.nativeCardboardView, renderer);
        }

        public void setRenderer(CardboardView.StereoRenderer stereoRenderer) {
            this.stereoRenderer = stereoRenderer;
            CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
            cardboardViewNativeImpl.nativeSetStereoRenderer(cardboardViewNativeImpl.nativeCardboardView, stereoRenderer);
        }

        public void setVRModeEnabled(final boolean z10) {
            CardboardViewNativeImpl.this.queueEvent(new Runnable() { // from class: com.google.vrtoolkit.cardboard.CardboardViewNativeImpl.RendererHelper.2
                @Override // java.lang.Runnable
                public void run() {
                    boolean z11 = RendererHelper.this.vrMode;
                    boolean z12 = z10;
                    if (z11 == z12) {
                        return;
                    }
                    RendererHelper.this.vrMode = z12;
                    CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                    cardboardViewNativeImpl.nativeSetVRModeEnabled(cardboardViewNativeImpl.nativeCardboardView, z10);
                    RendererHelper rendererHelper = RendererHelper.this;
                    rendererHelper.onSurfaceChanged(null, rendererHelper.hmd.getScreenParams().getWidth(), RendererHelper.this.hmd.getScreenParams().getHeight());
                }
            });
        }

        public void shutdown() {
            CardboardViewNativeImpl.this.queueEvent(new Runnable() { // from class: com.google.vrtoolkit.cardboard.CardboardViewNativeImpl.RendererHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    if (RendererHelper.this.renderer != null && RendererHelper.this.surfaceCreated) {
                        RendererHelper.this.surfaceCreated = false;
                        RendererHelper.this.callOnRendererShutdown();
                    }
                    CardboardViewNativeImpl.this.shutdownLatch.countDown();
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class TraceCompat {
        private TraceCompat() {
        }

        public static void beginSection(String str) {
            Trace.beginSection(str);
        }

        public static void endSection() {
            Trace.endSection();
        }
    }

    public CardboardViewNativeImpl(Context context, GLSurfaceView gLSurfaceView) {
        String str;
        HeadMountedDisplayManager headMountedDisplayManager = new HeadMountedDisplayManager(context);
        this.hmdManager = headMountedDisplayManager;
        ScreenParams screenParams = headMountedDisplayManager.getHeadMountedDisplay().getScreenParams();
        try {
            str = (String) Class.forName(String.valueOf(getClass().getPackage().getName()).concat(".NativeProxy")).getDeclaredField("PROXY_LIBRARY").get(null);
        } catch (Exception unused) {
            Log.d(TAG, "NativeProxy not found");
            str = "vrtoolkit";
        }
        String str2 = TAG;
        String valueOf = String.valueOf(str);
        Log.d(str2, valueOf.length() != 0 ? "Loading native library ".concat(valueOf) : new String("Loading native library "));
        System.loadLibrary(str);
        Log.d(str2, "Native library loaded");
        nativeSetApplicationState(getClass().getClassLoader(), context.getApplicationContext());
        this.glSurfaceView = gLSurfaceView;
        this.rendererHelper = new RendererHelper();
        this.displaySynchronizer = new DisplaySynchronizer();
        this.uiLayer = new g(context);
        this.nativeCardboardView = nativeInit(screenParams.getWidth(), screenParams.getHeight(), screenParams.getWidthMeters() / screenParams.getWidth(), screenParams.getHeightMeters() / screenParams.getHeight(), screenParams.getBorderSizeMeters(), this.displaySynchronizer.a());
        this.cardboardTriggerListenerHandler = new Handler(Looper.getMainLooper());
        this.cardboardBackListenerHandler = new Handler(Looper.getMainLooper());
    }

    private native void nativeDestroy(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDrawUiLayer(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeGetCurrentEyeParams(long j10, HeadTransform headTransform, Eye eye, Eye eye2, Eye eye3, Eye eye4, Eye eye5);

    private native boolean nativeGetGyroBiasEstimationEnabled(long j10);

    private native float nativeGetNeckModelFactor(long j10);

    private native long nativeInit(int i10, int i11, float f10, float f11, float f12, long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnDrawFrame(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnSurfaceChanged(long j10, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnSurfaceCreated(long j10);

    private native void nativeResetHeadTracker(long j10);

    private static native long nativeSetApplicationState(ClassLoader classLoader, Context context);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetCardboardDeviceParams(long j10, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetChromaticAberrationCorrectionEnabled(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetDistortionCorrectionEnabled(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetDistortionCorrectionScale(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetElectronicDisplayStabilizationEnabled(long j10, boolean z10);

    private native void nativeSetGyroBiasEstimationEnabled(long j10, boolean z10);

    private native void nativeSetNeckModelEnabled(long j10, boolean z10);

    private native void nativeSetNeckModelFactor(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetRenderer(long j10, CardboardView.Renderer renderer);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetRestoreGLStateEnabled(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetScreenParams(long j10, int i10, int i11, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetStereoRenderer(long j10, CardboardView.StereoRenderer stereoRenderer);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetUiLayerAlignmentMarkerEnabled(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetVRModeEnabled(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetVignetteEnabled(long j10, boolean z10);

    private native void nativeStartTracking(long j10);

    private native void nativeStopTracking(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUndistortTexture(long j10, int i10);

    @UsedByNative
    private void onCardboardBack() {
        runOnCardboardBackListener();
    }

    @UsedByNative
    private void onCardboardTrigger() {
        if (this.convertTapIntoTrigger) {
            runOnCardboardTriggerListener();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queueEvent(Runnable runnable) {
        this.glSurfaceView.queueEvent(runnable);
    }

    private void setCardboardDeviceParams(final CardboardDeviceParams cardboardDeviceParams) {
        new CardboardDeviceParams(cardboardDeviceParams);
        queueEvent(new Runnable() { // from class: com.google.vrtoolkit.cardboard.CardboardViewNativeImpl.12
            @Override // java.lang.Runnable
            public void run() {
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeSetCardboardDeviceParams(cardboardViewNativeImpl.nativeCardboardView, cardboardDeviceParams.toByteArray());
            }
        });
    }

    private void setScreenParams(ScreenParams screenParams) {
        final ScreenParams screenParams2 = new ScreenParams(screenParams);
        queueEvent(new Runnable() { // from class: com.google.vrtoolkit.cardboard.CardboardViewNativeImpl.13
            @Override // java.lang.Runnable
            public void run() {
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeSetScreenParams(cardboardViewNativeImpl.nativeCardboardView, screenParams2.getWidth(), screenParams2.getHeight(), screenParams2.getWidthMeters() / screenParams2.getWidth(), screenParams2.getHeightMeters() / screenParams2.getHeight(), screenParams2.getBorderSizeMeters());
            }
        });
    }

    public void finalize() {
        try {
            nativeDestroy(this.nativeCardboardView);
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public boolean getAlignmentMarkerEnabled() {
        return this.uiLayerAlignmentMarkerEnabled;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public boolean getCardboardBackButtonEnabled() {
        return this.uiLayer.f15843j != null;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public CardboardDeviceParams getCardboardDeviceParams() {
        return this.hmdManager.getHeadMountedDisplay().getCardboardDeviceParams();
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public boolean getChromaticAberrationCorrectionEnabled() {
        return this.chromaticAberrationCorrectionEnabled;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public boolean getConvertTapIntoTrigger() {
        return this.convertTapIntoTrigger;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void getCurrentEyeParams(HeadTransform headTransform, Eye eye, Eye eye2, Eye eye3, Eye eye4, Eye eye5) {
        this.rendererHelper.getCurrentEyeParams(headTransform, eye, eye2, eye3, eye4, eye5);
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public boolean getDistortionCorrectionEnabled() {
        return this.distortionCorrectionEnabled;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public boolean getElectronicDisplayStabilizationEnabled() {
        return this.electronicDisplayStabilizationEnabled;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public boolean getGyroBiasEstimationEnabled() {
        return nativeGetGyroBiasEstimationEnabled(this.nativeCardboardView);
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public HeadMountedDisplay getHeadMountedDisplay() {
        return this.hmdManager.getHeadMountedDisplay();
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public float getInterpupillaryDistance() {
        return getCardboardDeviceParams().getInterLensDistance();
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public boolean getLowLatencyModeEnabled() {
        return this.lowLatencyModeEnabled;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public float getNeckModelFactor() {
        return nativeGetNeckModelFactor(this.nativeCardboardView);
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public boolean getRestoreGLStateEnabled() {
        return this.restoreGLStateEnabled;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public ScreenParams getScreenParams() {
        return this.hmdManager.getHeadMountedDisplay().getScreenParams();
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public boolean getSettingsButtonEnabled() {
        return this.uiLayer.f15842i;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public boolean getVRMode() {
        return this.vrMode;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public boolean getVignetteEnabled() {
        return this.vignetteEnabled;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public boolean handlesMagnetInput() {
        return true;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void onDetachedFromWindow() {
        if (this.shutdownLatch == null) {
            this.shutdownLatch = new CountDownLatch(1);
            this.rendererHelper.shutdown();
            try {
                this.shutdownLatch.await();
            } catch (InterruptedException e10) {
                String str = TAG;
                String valueOf = String.valueOf(e10.toString());
                Log.e(str, valueOf.length() != 0 ? "Interrupted during shutdown: ".concat(valueOf) : new String("Interrupted during shutdown: "));
            }
            this.shutdownLatch = null;
        }
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void onPause() {
        this.hmdManager.onPause();
        nativeStopTracking(this.nativeCardboardView);
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void onResume() {
        this.hmdManager.onResume();
        setScreenParams(getScreenParams());
        setCardboardDeviceParams(getCardboardDeviceParams());
        nativeStartTracking(this.nativeCardboardView);
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            onCardboardTrigger();
            return true;
        }
        return false;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void renderUiLayer() {
        if (!this.uiLayerAttached) {
            g gVar = this.uiLayer;
            ((Activity) gVar.f15835a).runOnUiThread(new d(gVar, null));
            this.uiLayerAttached = true;
        }
        queueEvent(new Runnable() { // from class: com.google.vrtoolkit.cardboard.CardboardViewNativeImpl.8
            @Override // java.lang.Runnable
            public void run() {
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeDrawUiLayer(cardboardViewNativeImpl.nativeCardboardView);
            }
        });
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void resetHeadTracker() {
        nativeResetHeadTracker(this.nativeCardboardView);
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void runOnCardboardBackListener() {
        synchronized (this) {
            if (this.cardboardBackListener == null) {
                return;
            }
            if (this.cardboardBackListenerHandler.getLooper().getThread() == Thread.currentThread()) {
                this.cardboardBackListener.run();
            } else {
                this.cardboardBackListenerHandler.post(new Runnable() { // from class: com.google.vrtoolkit.cardboard.CardboardViewNativeImpl.11
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (CardboardViewNativeImpl.this) {
                            if (CardboardViewNativeImpl.this.cardboardBackListener != null) {
                                CardboardViewNativeImpl.this.cardboardBackListener.run();
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void runOnCardboardTriggerListener() {
        synchronized (this) {
            if (this.cardboardTriggerListener == null) {
                return;
            }
            if (this.cardboardTriggerListenerHandler.getLooper().getThread() == Thread.currentThread()) {
                this.cardboardTriggerListener.run();
            } else {
                this.cardboardTriggerListenerHandler.post(new Runnable() { // from class: com.google.vrtoolkit.cardboard.CardboardViewNativeImpl.10
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (CardboardViewNativeImpl.this) {
                            if (CardboardViewNativeImpl.this.cardboardTriggerListener != null) {
                                CardboardViewNativeImpl.this.cardboardTriggerListener.run();
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void setAlignmentMarkerEnabled(final boolean z10) {
        this.uiLayerAlignmentMarkerEnabled = z10;
        queueEvent(new Runnable() { // from class: com.google.vrtoolkit.cardboard.CardboardViewNativeImpl.1
            @Override // java.lang.Runnable
            public void run() {
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeSetUiLayerAlignmentMarkerEnabled(cardboardViewNativeImpl.nativeCardboardView, z10);
            }
        });
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void setChromaticAberrationCorrectionEnabled(final boolean z10) {
        this.chromaticAberrationCorrectionEnabled = z10;
        queueEvent(new Runnable() { // from class: com.google.vrtoolkit.cardboard.CardboardViewNativeImpl.3
            @Override // java.lang.Runnable
            public void run() {
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeSetChromaticAberrationCorrectionEnabled(cardboardViewNativeImpl.nativeCardboardView, z10);
            }
        });
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void setConvertTapIntoTrigger(boolean z10) {
        this.convertTapIntoTrigger = z10;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void setDistortionCorrectionEnabled(final boolean z10) {
        this.distortionCorrectionEnabled = z10;
        queueEvent(new Runnable() { // from class: com.google.vrtoolkit.cardboard.CardboardViewNativeImpl.6
            @Override // java.lang.Runnable
            public void run() {
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeSetDistortionCorrectionEnabled(cardboardViewNativeImpl.nativeCardboardView, z10);
            }
        });
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void setDistortionCorrectionScale(final float f10) {
        queueEvent(new Runnable() { // from class: com.google.vrtoolkit.cardboard.CardboardViewNativeImpl.9
            @Override // java.lang.Runnable
            public void run() {
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeSetDistortionCorrectionScale(cardboardViewNativeImpl.nativeCardboardView, f10);
            }
        });
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void setElectronicDisplayStabilizationEnabled(boolean z10) {
        this.electronicDisplayStabilizationEnabled = z10;
        queueEvent(new Runnable() { // from class: com.google.vrtoolkit.cardboard.CardboardViewNativeImpl.5
            @Override // java.lang.Runnable
            public void run() {
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeSetElectronicDisplayStabilizationEnabled(cardboardViewNativeImpl.nativeCardboardView, CardboardViewNativeImpl.this.electronicDisplayStabilizationEnabled);
            }
        });
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void setGyroBiasEstimationEnabled(boolean z10) {
        nativeSetGyroBiasEstimationEnabled(this.nativeCardboardView, z10);
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void setLowLatencyModeEnabled(boolean z10) {
        this.lowLatencyModeEnabled = z10;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void setNeckModelEnabled(boolean z10) {
        nativeSetNeckModelEnabled(this.nativeCardboardView, z10);
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void setNeckModelFactor(float f10) {
        nativeSetNeckModelFactor(this.nativeCardboardView, f10);
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void setOnCardboardBackButtonListener(Runnable runnable) {
        g gVar = this.uiLayer;
        gVar.f15843j = runnable;
        ((Activity) gVar.f15835a).runOnUiThread(new f(gVar, runnable));
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public synchronized void setOnCardboardBackListener(Runnable runnable) {
        this.cardboardBackListener = runnable;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public synchronized void setOnCardboardTriggerListener(Runnable runnable) {
        this.cardboardTriggerListener = runnable;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public GLSurfaceView.Renderer setRenderer(CardboardView.Renderer renderer) {
        if (renderer == null) {
            return null;
        }
        this.rendererHelper.setRenderer(renderer);
        return this.rendererHelper;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public GLSurfaceView.Renderer setRenderer(CardboardView.StereoRenderer stereoRenderer) {
        if (stereoRenderer == null) {
            return null;
        }
        this.rendererHelper.setRenderer(stereoRenderer);
        return this.rendererHelper;
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void setRestoreGLStateEnabled(final boolean z10) {
        this.restoreGLStateEnabled = z10;
        queueEvent(new Runnable() { // from class: com.google.vrtoolkit.cardboard.CardboardViewNativeImpl.2
            @Override // java.lang.Runnable
            public void run() {
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeSetRestoreGLStateEnabled(cardboardViewNativeImpl.nativeCardboardView, z10);
            }
        });
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void setSettingsButtonEnabled(boolean z10) {
        g gVar = this.uiLayer;
        gVar.f15842i = z10;
        ((Activity) gVar.f15835a).runOnUiThread(new e(gVar, z10));
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void setVRModeEnabled(boolean z10) {
        this.vrMode = z10;
        this.rendererHelper.setVRModeEnabled(z10);
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void setVignetteEnabled(final boolean z10) {
        this.vignetteEnabled = z10;
        queueEvent(new Runnable() { // from class: com.google.vrtoolkit.cardboard.CardboardViewNativeImpl.4
            @Override // java.lang.Runnable
            public void run() {
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeSetVignetteEnabled(cardboardViewNativeImpl.nativeCardboardView, z10);
            }
        });
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void undistortTexture(final int i10) {
        queueEvent(new Runnable() { // from class: com.google.vrtoolkit.cardboard.CardboardViewNativeImpl.7
            @Override // java.lang.Runnable
            public void run() {
                CardboardViewNativeImpl cardboardViewNativeImpl = CardboardViewNativeImpl.this;
                cardboardViewNativeImpl.nativeUndistortTexture(cardboardViewNativeImpl.nativeCardboardView, i10);
            }
        });
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void updateCardboardDeviceParams(CardboardDeviceParams cardboardDeviceParams) {
        if (this.hmdManager.updateCardboardDeviceParams(cardboardDeviceParams)) {
            setCardboardDeviceParams(getCardboardDeviceParams());
        }
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardViewApi
    public void updateScreenParams(ScreenParams screenParams) {
        if (this.hmdManager.updateScreenParams(screenParams)) {
            setScreenParams(getScreenParams());
        }
    }
}
