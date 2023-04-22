package com.app.pornhub.view.quickseek.overlay;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cb.e;
import com.app.pornhub.R;
import com.app.pornhub.view.quickseek.QuickSeekFrameLayout;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e5.q;
import e5.r;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import q0.h;
import w6.n0;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u00013B\u0019\u0012\u0006\u0010.\u001a\u00020-\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102R$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR*\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00038\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00038F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\u000eR$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00038F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\u000eR$\u0010\u001b\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00168F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u001c\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00168F@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR*\u0010 \u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00038F@BX\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\u000eR$\u0010(\u001a\u00020#2\u0006\u0010\n\u001a\u00020#8F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0011\u0010,\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00064"}, d2 = {"Lcom/app/pornhub/view/quickseek/overlay/QuickSeekOverlay;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lc5/a;", BuildConfig.FLAVOR, "<set-?>", "O", "I", "getSeekSeconds", "()I", "seekSeconds", AppMeasurementSdk.ConditionalUserProperty.VALUE, "P", "getTextAppearance", "setTextAppearance", "(I)V", "textAppearance", "getTapCircleColor", "setTapCircleColor", "tapCircleColor", "getCircleBackgroundColor", "setCircleBackgroundColor", "circleBackgroundColor", BuildConfig.FLAVOR, "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "animationDuration", "iconAnimationDuration", "J", "getIconAnimationDuration", "setIconAnimationDuration", "icon", "getIcon", "setIcon", BuildConfig.FLAVOR, "getArcSize", "()F", "setArcSize$Pornhub_6_11_0_release", "(F)V", "arcSize", "Landroid/widget/TextView;", "getSecondsTextView", "()Landroid/widget/TextView;", "secondsTextView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class QuickSeekOverlay extends ConstraintLayout implements c5.a {
    public Map<Integer, View> I;
    public final AttributeSet J;
    public int K;
    public QuickSeekFrameLayout L;
    public n0 M;
    public a N;
    public int O;
    public int P;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickSeekOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.I = new LinkedHashMap();
        this.J = attributeSet;
        this.K = -1;
        LayoutInflater.from(context).inflate(R.layout.quick_seek_overlay, (ViewGroup) this, true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f3924m, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…e.QuickSeekOverlay, 0, 0)");
            this.K = obtainStyledAttributes.getResourceId(5, -1);
            setAnimationDuration(obtainStyledAttributes.getInt(0, 650));
            this.O = obtainStyledAttributes.getInt(6, 10);
            setIconAnimationDuration(obtainStyledAttributes.getInt(4, 750));
            setArcSize$Pornhub_6_11_0_release(obtainStyledAttributes.getDimensionPixelSize(1, getContext().getResources().getDimensionPixelSize(R.dimen.seek_overlay_arc_size)));
            setTapCircleColor(obtainStyledAttributes.getColor(7, c0.a.b(getContext(), R.color.seek_overlay_tap_circle_color)));
            setCircleBackgroundColor(obtainStyledAttributes.getColor(2, c0.a.b(getContext(), R.color.seek_overlay_background_circle_color)));
            setTextAppearance(obtainStyledAttributes.getResourceId(8, R.style.VSOSecondsTextAppearance));
            setIcon(obtainStyledAttributes.getResourceId(3, R.drawable.ic_play_triangle));
            obtainStyledAttributes.recycle();
        } else {
            setArcSize$Pornhub_6_11_0_release(getContext().getResources().getDimensionPixelSize(R.dimen.seek_overlay_arc_size));
            setTapCircleColor(c0.a.b(getContext(), R.color.seek_overlay_tap_circle_color));
            setCircleBackgroundColor(c0.a.b(getContext(), R.color.seek_overlay_background_circle_color));
            setAnimationDuration(650L);
            setIconAnimationDuration(750L);
            this.O = 10;
            setTextAppearance(R.style.VSOSecondsTextAppearance);
        }
        ((QuickSeekOverlayContentView) x(R.id.seconds_view)).setForward(true);
        y(true);
        ((CircleClipTapView) x(R.id.circle_clip_tap_view)).setPerformAtEnd(new Function0<Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlay.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                a aVar = QuickSeekOverlay.this.N;
                if (aVar != null) {
                    r rVar = (r) aVar;
                    rVar.f9107a.animate().alpha(0.0f).setDuration(200L).setListener(new q(rVar));
                }
                ((QuickSeekOverlayContentView) QuickSeekOverlay.this.x(R.id.seconds_view)).setVisibility(4);
                ((QuickSeekOverlayContentView) QuickSeekOverlay.this.x(R.id.seconds_view)).setSeconds(0);
                ((QuickSeekOverlayContentView) QuickSeekOverlay.this.x(R.id.seconds_view)).y();
                return Unit.INSTANCE;
            }
        });
    }

    private final void setAnimationDuration(long j10) {
        ((CircleClipTapView) x(R.id.circle_clip_tap_view)).setAnimationDuration(j10);
    }

    private final void setCircleBackgroundColor(int i10) {
        ((CircleClipTapView) x(R.id.circle_clip_tap_view)).setCircleBackgroundColor(i10);
    }

    private final void setIcon(int i10) {
        ((QuickSeekOverlayContentView) x(R.id.seconds_view)).y();
        ((QuickSeekOverlayContentView) x(R.id.seconds_view)).setIcon(i10);
    }

    private final void setIconAnimationDuration(long j10) {
        ((QuickSeekOverlayContentView) x(R.id.seconds_view)).setCycleDuration(j10);
    }

    private final void setTapCircleColor(int i10) {
        ((CircleClipTapView) x(R.id.circle_clip_tap_view)).setCircleColor(i10);
    }

    private final void setTextAppearance(int i10) {
        h.f(((QuickSeekOverlayContentView) x(R.id.seconds_view)).getTextView(), i10);
        this.P = i10;
    }

    @Override // c5.a
    public void a() {
    }

    @Override // c5.a
    public void b(final float f10, final float f11) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Integer valueOf5;
        Integer valueOf6;
        n0 n0Var = this.M;
        if ((n0Var == null ? null : Long.valueOf(n0Var.getCurrentPosition())) != null) {
            QuickSeekFrameLayout quickSeekFrameLayout = this.L;
            if ((quickSeekFrameLayout == null ? null : Integer.valueOf(quickSeekFrameLayout.getWidth())) == null) {
                return;
            }
            n0 n0Var2 = this.M;
            if (n0Var2 != null) {
                long currentPosition = n0Var2.getCurrentPosition();
                double d = f10;
                QuickSeekFrameLayout quickSeekFrameLayout2 = this.L;
                Intrinsics.checkNotNull(quickSeekFrameLayout2 == null ? null : Integer.valueOf(quickSeekFrameLayout2.getWidth()));
                if (d < valueOf.intValue() * 0.35d && currentPosition <= 500) {
                    return;
                }
                QuickSeekFrameLayout quickSeekFrameLayout3 = this.L;
                Intrinsics.checkNotNull(quickSeekFrameLayout3 == null ? null : Integer.valueOf(quickSeekFrameLayout3.getWidth()));
                if (d > valueOf2.intValue() * 0.65d) {
                    n0 n0Var3 = this.M;
                    Long valueOf7 = n0Var3 == null ? null : Long.valueOf(n0Var3.getDuration());
                    Intrinsics.checkNotNull(valueOf7);
                    if (currentPosition >= valueOf7.longValue() - 500) {
                        return;
                    }
                }
            }
            if (getVisibility() != 0) {
                double d10 = f10;
                QuickSeekFrameLayout quickSeekFrameLayout4 = this.L;
                Intrinsics.checkNotNull(quickSeekFrameLayout4 == null ? null : Integer.valueOf(quickSeekFrameLayout4.getWidth()));
                if (d10 >= valueOf5.intValue() * 0.35d) {
                    QuickSeekFrameLayout quickSeekFrameLayout5 = this.L;
                    Intrinsics.checkNotNull(quickSeekFrameLayout5 == null ? null : Integer.valueOf(quickSeekFrameLayout5.getWidth()));
                    if (d10 <= valueOf6.intValue() * 0.65d) {
                        return;
                    }
                }
                a aVar = this.N;
                if (aVar != null) {
                    r rVar = (r) aVar;
                    rVar.f9107a.setAlpha(0.0f);
                    rVar.f9107a.setVisibility(0);
                    rVar.f9107a.animate().alpha(1.0f).setDuration(200L).setListener(null);
                }
                ((QuickSeekOverlayContentView) x(R.id.seconds_view)).setVisibility(0);
                QuickSeekOverlayContentView quickSeekOverlayContentView = (QuickSeekOverlayContentView) x(R.id.seconds_view);
                quickSeekOverlayContentView.y();
                quickSeekOverlayContentView.N.start();
            }
            double d11 = f10;
            QuickSeekFrameLayout quickSeekFrameLayout6 = this.L;
            Intrinsics.checkNotNull(quickSeekFrameLayout6 == null ? null : Integer.valueOf(quickSeekFrameLayout6.getWidth()));
            if (d11 < valueOf3.intValue() * 0.35d) {
                if (((QuickSeekOverlayContentView) x(R.id.seconds_view)).L) {
                    y(false);
                    QuickSeekOverlayContentView quickSeekOverlayContentView2 = (QuickSeekOverlayContentView) x(R.id.seconds_view);
                    quickSeekOverlayContentView2.setForward(false);
                    quickSeekOverlayContentView2.setSeconds(0);
                }
                ((CircleClipTapView) x(R.id.circle_clip_tap_view)).a(new Function0<Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlay$onDoubleTapProgressUp$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public Unit invoke() {
                        ((CircleClipTapView) QuickSeekOverlay.this.x(R.id.circle_clip_tap_view)).c(f10, f11);
                        return Unit.INSTANCE;
                    }
                });
                QuickSeekOverlayContentView quickSeekOverlayContentView3 = (QuickSeekOverlayContentView) x(R.id.seconds_view);
                quickSeekOverlayContentView3.setSeconds(quickSeekOverlayContentView3.getSeconds() + this.O);
                n0 n0Var4 = this.M;
                z(n0Var4 != null ? Long.valueOf(n0Var4.getCurrentPosition() - (this.O * 1000)) : null);
                return;
            }
            QuickSeekFrameLayout quickSeekFrameLayout7 = this.L;
            Intrinsics.checkNotNull(quickSeekFrameLayout7 == null ? null : Integer.valueOf(quickSeekFrameLayout7.getWidth()));
            if (d11 > valueOf4.intValue() * 0.65d) {
                if (!((QuickSeekOverlayContentView) x(R.id.seconds_view)).L) {
                    y(true);
                    QuickSeekOverlayContentView quickSeekOverlayContentView4 = (QuickSeekOverlayContentView) x(R.id.seconds_view);
                    quickSeekOverlayContentView4.setForward(true);
                    quickSeekOverlayContentView4.setSeconds(0);
                }
                ((CircleClipTapView) x(R.id.circle_clip_tap_view)).a(new Function0<Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlay$onDoubleTapProgressUp$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public Unit invoke() {
                        ((CircleClipTapView) QuickSeekOverlay.this.x(R.id.circle_clip_tap_view)).c(f10, f11);
                        return Unit.INSTANCE;
                    }
                });
                QuickSeekOverlayContentView quickSeekOverlayContentView5 = (QuickSeekOverlayContentView) x(R.id.seconds_view);
                quickSeekOverlayContentView5.setSeconds(quickSeekOverlayContentView5.getSeconds() + this.O);
                n0 n0Var5 = this.M;
                z(n0Var5 != null ? Long.valueOf(n0Var5.getCurrentPosition() + (this.O * 1000)) : null);
            }
        }
    }

    @Override // c5.a
    public void d(float f10, float f11) {
    }

    @Override // c5.a
    public void e(float f10, float f11) {
    }

    public final long getAnimationDuration() {
        return ((CircleClipTapView) x(R.id.circle_clip_tap_view)).getAnimationDuration();
    }

    public final float getArcSize() {
        return ((CircleClipTapView) x(R.id.circle_clip_tap_view)).getArcSize();
    }

    public final int getCircleBackgroundColor() {
        return ((CircleClipTapView) x(R.id.circle_clip_tap_view)).getCircleBackgroundColor();
    }

    public final int getIcon() {
        return ((QuickSeekOverlayContentView) x(R.id.seconds_view)).getIcon();
    }

    public final long getIconAnimationDuration() {
        return ((QuickSeekOverlayContentView) x(R.id.seconds_view)).getCycleDuration();
    }

    public final TextView getSecondsTextView() {
        return ((QuickSeekOverlayContentView) x(R.id.seconds_view)).getTextView();
    }

    public final int getSeekSeconds() {
        return this.O;
    }

    public final int getTapCircleColor() {
        return ((CircleClipTapView) x(R.id.circle_clip_tap_view)).getCircleColor();
    }

    public final int getTextAppearance() {
        return this.P;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.K != -1) {
            ViewParent parent = getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
            View findViewById = ((View) parent).findViewById(this.K);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type com.app.pornhub.view.quickseek.QuickSeekFrameLayout");
            QuickSeekFrameLayout seekPlayerView = (QuickSeekFrameLayout) findViewById;
            Intrinsics.checkNotNullParameter(seekPlayerView, "seekPlayerView");
            this.L = seekPlayerView;
        }
    }

    public final void setArcSize$Pornhub_6_11_0_release(float f10) {
        ((CircleClipTapView) x(R.id.circle_clip_tap_view)).setArcSize(f10);
    }

    public View x(int i10) {
        Map<Integer, View> map = this.I;
        View view = map.get(Integer.valueOf(i10));
        if (view == null) {
            view = findViewById(i10);
            if (view == null) {
                return null;
            }
            map.put(Integer.valueOf(i10), view);
        }
        return view;
    }

    public final void y(boolean z10) {
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        aVar.f((ConstraintLayout) x(R.id.root_constraint_layout));
        if (z10) {
            aVar.e(((QuickSeekOverlayContentView) x(R.id.seconds_view)).getId(), 6);
            aVar.g(((QuickSeekOverlayContentView) x(R.id.seconds_view)).getId(), 7, 0, 7);
        } else {
            aVar.e(((QuickSeekOverlayContentView) x(R.id.seconds_view)).getId(), 7);
            aVar.g(((QuickSeekOverlayContentView) x(R.id.seconds_view)).getId(), 6, 0, 6);
        }
        QuickSeekOverlayContentView quickSeekOverlayContentView = (QuickSeekOverlayContentView) x(R.id.seconds_view);
        quickSeekOverlayContentView.y();
        quickSeekOverlayContentView.N.start();
        aVar.b((ConstraintLayout) x(R.id.root_constraint_layout));
    }

    public final void z(Long l10) {
        if (l10 == null) {
            return;
        }
        if (l10.longValue() <= 0) {
            n0 n0Var = this.M;
            if (n0Var == null) {
                return;
            }
            n0Var.n(0L);
            return;
        }
        n0 n0Var2 = this.M;
        if (n0Var2 != null) {
            long duration = n0Var2.getDuration();
            if (l10.longValue() >= duration) {
                n0 n0Var3 = this.M;
                if (n0Var3 == null) {
                    return;
                }
                n0Var3.n(duration);
                return;
            }
        }
        QuickSeekFrameLayout quickSeekFrameLayout = this.L;
        if (quickSeekFrameLayout != null) {
            QuickSeekFrameLayout.a aVar = quickSeekFrameLayout.f5452f;
            aVar.n = true;
            aVar.f5457f.removeCallbacks(aVar.f5458j);
            aVar.f5457f.postDelayed(aVar.f5458j, aVar.f5460t);
        }
        n0 n0Var4 = this.M;
        if (n0Var4 == null) {
            return;
        }
        n0Var4.n(l10.longValue());
    }
}
