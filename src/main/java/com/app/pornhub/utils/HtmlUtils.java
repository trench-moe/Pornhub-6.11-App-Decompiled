package com.app.pornhub.utils;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.app.pornhub.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import t3.h;
import t3.i;
import t3.j;

/* loaded from: classes.dex */
public final class HtmlUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final HtmlUtils f4921a = new HtmlUtils();

    /* loaded from: classes.dex */
    public interface a {
        void a(String str);

        void b(String str);

        void c(String str, String str2);

        void d(String str);
    }

    public final void a(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder, "[STOP_IT_NOW_LOGO]", 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return;
        }
        int i10 = indexOf$default + 18;
        Drawable a10 = f.a.a(textView.getContext(), R.drawable.stop_it_now_logo);
        Intrinsics.checkNotNull(a10);
        int intrinsicWidth = a10.getIntrinsicWidth();
        double width = textView.getWidth() * 0.6d;
        a10.setBounds(0, 0, MathKt.roundToInt(width), MathKt.roundToInt(a10.getIntrinsicHeight() * (width / intrinsicWidth)));
        spannableStringBuilder.setSpan(new ImageSpan(a10, 1), indexOf$default, i10, 17);
    }

    /* JADX WARN: Type inference failed for: r11v25, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v34, types: [T, java.lang.Object, java.lang.String] */
    public final void b(final TextView textView, String html, a clickHandler) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        Spanned fromHtml = Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(html, 63) : Html.fromHtml(html);
        Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(html, HtmlCompat.FROM_HTML_MODE_COMPACT)");
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        Object[] spans = spannableStringBuilder.getSpans(0, fromHtml.length(), URLSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "strBuilder.getSpans(0, s…gth, URLSpan::class.java)");
        URLSpan[] uRLSpanArr = (URLSpan[]) spans;
        int length = uRLSpanArr.length;
        int i10 = 0;
        while (i10 < length) {
            URLSpan uRLSpan = uRLSpanArr[i10];
            i10++;
            int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
            int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            Intrinsics.checkNotNullExpressionValue(spannableStringBuilder2, "strBuilder.toString()");
            ?? substring = spannableStringBuilder2.substring(spanStart, spanEnd);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            objectRef.element = substring;
            if (40 < substring.length()) {
                ?? url = uRLSpan.getURL();
                Intrinsics.checkNotNullExpressionValue(url, "span.url");
                objectRef.element = url;
            }
            spannableStringBuilder.setSpan(new i(uRLSpan, clickHandler, objectRef), spanStart, spanEnd, spanFlags);
            spannableStringBuilder.setSpan(new j(), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), 0);
            spannableStringBuilder.removeSpan(uRLSpan);
        }
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.app.pornhub.utils.HtmlUtils$setTextViewHTML$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return Unit.INSTANCE;
            }
        };
        if (textView.getWidth() == 0) {
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new h(textView, spannableStringBuilder, function0));
            return;
        }
        a(textView, spannableStringBuilder);
        function0.invoke();
    }
}
