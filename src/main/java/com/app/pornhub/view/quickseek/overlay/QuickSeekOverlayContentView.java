package com.app.pornhub.view.quickseek.overlay;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z3.f;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001'B\u0019\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&R*\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006("}, d2 = {"Lcom/app/pornhub/view/quickseek/overlay/QuickSeekOverlayContentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.VALUE, "J", "getCycleDuration", "()J", "setCycleDuration", "(J)V", "cycleDuration", BuildConfig.FLAVOR, "K", "I", "getSeconds", "()I", "setSeconds", "(I)V", "seconds", BuildConfig.FLAVOR, "L", "Z", "isForward", "()Z", "setForward", "(Z)V", "M", "getIcon", "setIcon", "icon", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "textView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class QuickSeekOverlayContentView extends ConstraintLayout {
    public Map<Integer, View> I;
    public long J;
    public int K;
    public boolean L;
    public int M;
    public final ValueAnimator N;
    public final ValueAnimator O;
    public final ValueAnimator P;
    public final ValueAnimator Q;
    public final ValueAnimator R;

    /* loaded from: classes.dex */
    public final class a extends ValueAnimator {

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int f5471c = 0;

        /* renamed from: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0061a implements Animator.AnimatorListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Function0 f5472a;

            public C0061a(Function0 function0) {
                this.f5472a = function0;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                this.f5472a.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements Animator.AnimatorListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Function0 f5473a;

            public b(Function0 function0) {
                this.f5473a = function0;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                this.f5473a.invoke();
            }
        }

        public a(QuickSeekOverlayContentView this$0, Function0<Unit> start, Function1<? super Float, Unit> update, Function0<Unit> end) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(update, "update");
            Intrinsics.checkNotNullParameter(end, "end");
            setDuration(this$0.getCycleDuration() / 5);
            setFloatValues(0.0f, 1.0f);
            addUpdateListener(new f(update, 2));
            addListener(new b(start));
            addListener(new C0061a(end));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickSeekOverlayContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.I = new LinkedHashMap();
        this.J = 750L;
        this.L = true;
        this.M = R.drawable.ic_play_triangle;
        LayoutInflater.from(context).inflate(R.layout.quick_seek_overlay_content, (ViewGroup) this, true);
        this.N = new a(this, new Function0<Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView$firstAnimator$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_1)).setAlpha(0.0f);
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_2)).setAlpha(0.0f);
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_3)).setAlpha(0.0f);
                return Unit.INSTANCE;
            }
        }, new Function1<Float, Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView$firstAnimator$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Float f10) {
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_1)).setAlpha(f10.floatValue());
                return Unit.INSTANCE;
            }
        }, new Function0<Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView$firstAnimator$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                QuickSeekOverlayContentView.this.O.start();
                return Unit.INSTANCE;
            }
        });
        this.O = new a(this, new Function0<Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView$secondAnimator$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_1)).setAlpha(1.0f);
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_2)).setAlpha(0.0f);
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_3)).setAlpha(0.0f);
                return Unit.INSTANCE;
            }
        }, new Function1<Float, Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView$secondAnimator$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Float f10) {
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_2)).setAlpha(f10.floatValue());
                return Unit.INSTANCE;
            }
        }, new Function0<Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView$secondAnimator$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                QuickSeekOverlayContentView.this.P.start();
                return Unit.INSTANCE;
            }
        });
        this.P = new a(this, new Function0<Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView$thirdAnimator$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_1)).setAlpha(1.0f);
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_2)).setAlpha(1.0f);
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_3)).setAlpha(0.0f);
                return Unit.INSTANCE;
            }
        }, new Function1<Float, Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView$thirdAnimator$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Float f10) {
                float floatValue = f10.floatValue();
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_1)).setAlpha(1.0f - ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_3)).getAlpha());
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_3)).setAlpha(floatValue);
                return Unit.INSTANCE;
            }
        }, new Function0<Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView$thirdAnimator$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                QuickSeekOverlayContentView.this.Q.start();
                return Unit.INSTANCE;
            }
        });
        this.Q = new a(this, new Function0<Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView$fourthAnimator$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_1)).setAlpha(0.0f);
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_2)).setAlpha(1.0f);
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_3)).setAlpha(1.0f);
                return Unit.INSTANCE;
            }
        }, new Function1<Float, Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView$fourthAnimator$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Float f10) {
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_2)).setAlpha(1.0f - f10.floatValue());
                return Unit.INSTANCE;
            }
        }, new Function0<Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView$fourthAnimator$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                QuickSeekOverlayContentView.this.R.start();
                return Unit.INSTANCE;
            }
        });
        this.R = new a(this, new Function0<Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView$fifthAnimator$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_1)).setAlpha(0.0f);
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_2)).setAlpha(0.0f);
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_3)).setAlpha(1.0f);
                return Unit.INSTANCE;
            }
        }, new Function1<Float, Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView$fifthAnimator$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Float f10) {
                ((ImageView) QuickSeekOverlayContentView.this.x(R.id.icon_3)).setAlpha(1.0f - f10.floatValue());
                return Unit.INSTANCE;
            }
        }, new Function0<Unit>() { // from class: com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView$fifthAnimator$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                QuickSeekOverlayContentView.this.N.start();
                return Unit.INSTANCE;
            }
        });
    }

    public final long getCycleDuration() {
        return this.J;
    }

    public final int getIcon() {
        return this.M;
    }

    public final int getSeconds() {
        return this.K;
    }

    public final TextView getTextView() {
        TextView tv_seconds = (TextView) x(R.id.tv_seconds);
        Intrinsics.checkNotNullExpressionValue(tv_seconds, "tv_seconds");
        return tv_seconds;
    }

    public final void setCycleDuration(long j10) {
        long j11 = j10 / 5;
        this.N.setDuration(j11);
        this.O.setDuration(j11);
        this.P.setDuration(j11);
        this.Q.setDuration(j11);
        this.R.setDuration(j11);
        this.J = j10;
    }

    public final void setForward(boolean z10) {
        ((LinearLayout) x(R.id.triangle_container)).setRotation(z10 ? 0.0f : 180.0f);
        this.L = z10;
    }

    public final void setIcon(int i10) {
        if (i10 > 0) {
            ((ImageView) x(R.id.icon_1)).setImageResource(i10);
            ((ImageView) x(R.id.icon_2)).setImageResource(i10);
            ((ImageView) x(R.id.icon_3)).setImageResource(i10);
        }
        this.M = i10;
    }

    public final void setSeconds(int i10) {
        ((TextView) x(R.id.tv_seconds)).setText(getContext().getResources().getQuantityString(R.plurals.quick_seek_x_second, i10, Integer.valueOf(i10)));
        this.K = i10;
    }

    public View x(int i10) {
        Map<Integer, View> map = this.I;
        View view = map.get(Integer.valueOf(i10));
        if (view == null) {
            View findViewById = findViewById(i10);
            if (findViewById == null) {
                return null;
            }
            map.put(Integer.valueOf(i10), findViewById);
            return findViewById;
        }
        return view;
    }

    public final void y() {
        this.N.cancel();
        this.O.cancel();
        this.P.cancel();
        this.Q.cancel();
        this.R.cancel();
        ((ImageView) x(R.id.icon_1)).setAlpha(0.0f);
        ((ImageView) x(R.id.icon_2)).setAlpha(0.0f);
        ((ImageView) x(R.id.icon_3)).setAlpha(0.0f);
    }
}
