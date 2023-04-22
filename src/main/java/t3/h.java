package t3;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.app.pornhub.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class h implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TextView f15113c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SpannableStringBuilder f15114f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f15115j;

    public h(TextView textView, SpannableStringBuilder spannableStringBuilder, Function0<Unit> function0) {
        this.f15113c = textView;
        this.f15114f = spannableStringBuilder;
        this.f15115j = function0;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f15113c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        TextView textView = this.f15113c;
        SpannableStringBuilder spannableStringBuilder = this.f15114f;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder, "[STOP_IT_NOW_LOGO]", 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            Drawable a10 = f.a.a(textView.getContext(), R.drawable.stop_it_now_logo);
            Intrinsics.checkNotNull(a10);
            int intrinsicWidth = a10.getIntrinsicWidth();
            double width = textView.getWidth() * 0.6d;
            a10.setBounds(0, 0, MathKt.roundToInt(width), MathKt.roundToInt(a10.getIntrinsicHeight() * (width / intrinsicWidth)));
            spannableStringBuilder.setSpan(new ImageSpan(a10, 1), indexOf$default, indexOf$default + 18, 17);
        }
        this.f15115j.invoke();
    }
}
