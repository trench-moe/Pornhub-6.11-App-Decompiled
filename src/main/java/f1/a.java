package f1;

import com.app.pornhub.R;
import k2.c;
import k2.d;
import kotlin.jvm.internal.Intrinsics;
import pe.b;
import pe.b0;
import pe.u;
import pe.y;
import t9.o1;

/* loaded from: classes.dex */
public class a implements ae.a, b, o1 {

    /* renamed from: c  reason: collision with root package name */
    public static int f9353c;

    /* renamed from: f  reason: collision with root package name */
    public static volatile d f9354f;

    /* renamed from: j  reason: collision with root package name */
    public static volatile c f9355j;

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f9356m = {16842960, R.attr.destination, R.attr.enterAnim, R.attr.exitAnim, R.attr.launchSingleTop, R.attr.popEnterAnim, R.attr.popExitAnim, R.attr.popUpTo, R.attr.popUpToInclusive};
    public static final int[] n = {16842755, 16843245, R.attr.argType, R.attr.nullable};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f9357t = {16844014, R.attr.action, R.attr.mimeType, R.attr.uri};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f9358u = {R.attr.startDestination};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f9359w = {16842753, 16842960};
    public static final o1 y = new a();

    /* renamed from: z  reason: collision with root package name */
    public static final o1 f9360z = new a();
    public static final o1 A = new a();
    public static final int[] B = {R.attr.castAdBreakMarkerColor, R.attr.castAdInProgressLabelTextAppearance, R.attr.castAdInProgressText, R.attr.castAdInProgressTextColor, R.attr.castAdLabelColor, R.attr.castAdLabelTextAppearance, R.attr.castAdLabelTextColor, R.attr.castButtonColor, R.attr.castClosedCaptionsButtonDrawable, R.attr.castControlButtons, R.attr.castDefaultAdPosterUrl, R.attr.castExpandedControllerLoadingIndicatorColor, R.attr.castForward30ButtonDrawable, R.attr.castLiveIndicatorColor, R.attr.castMuteToggleButtonDrawable, R.attr.castPauseButtonDrawable, R.attr.castPlayButtonDrawable, R.attr.castRewind30ButtonDrawable, R.attr.castSeekBarProgressAndThumbColor, R.attr.castSeekBarProgressDrawable, R.attr.castSeekBarSecondaryProgressColor, R.attr.castSeekBarThumbDrawable, R.attr.castSeekBarTooltipBackgroundColor, R.attr.castSeekBarUnseekableProgressColor, R.attr.castSkipNextButtonDrawable, R.attr.castSkipPreviousButtonDrawable, R.attr.castStopButtonDrawable};
    public static final int[] C = {R.attr.castBackground, R.attr.castButtonColor, R.attr.castClosedCaptionsButtonDrawable, R.attr.castControlButtons, R.attr.castForward30ButtonDrawable, R.attr.castLargePauseButtonDrawable, R.attr.castLargePlayButtonDrawable, R.attr.castLargeStopButtonDrawable, R.attr.castMiniControllerLoadingIndicatorColor, R.attr.castMuteToggleButtonDrawable, R.attr.castPauseButtonDrawable, R.attr.castPlayButtonDrawable, R.attr.castProgressBarColor, R.attr.castRewind30ButtonDrawable, R.attr.castShowImageThumbnail, R.attr.castSkipNextButtonDrawable, R.attr.castSkipPreviousButtonDrawable, R.attr.castStopButtonDrawable, R.attr.castSubtitleTextAppearance, R.attr.castTitleTextAppearance};

    public /* synthetic */ a() {
    }

    public /* synthetic */ a(boolean z10) {
    }

    public static float b(String str) {
        int i10 = f9353c;
        if (i10 > 0) {
            f9353c = i10 - 1;
        }
        return 0.0f;
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    @Override // pe.b
    public u a(b0 b0Var, y response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return null;
    }
}
