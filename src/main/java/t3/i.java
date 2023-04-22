package t3;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.webkit.URLUtil;
import com.app.pornhub.utils.HtmlUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class i extends ClickableSpan {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ URLSpan f15116c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ HtmlUtils.a f15117f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<String> f15118j;

    public i(URLSpan uRLSpan, HtmlUtils.a aVar, Ref.ObjectRef<String> objectRef) {
        this.f15116c = uRLSpan;
        this.f15117f = aVar;
        this.f15118j = objectRef;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        String url = this.f15116c.getURL();
        Intrinsics.checkNotNullExpressionValue(url, "url");
        if (StringsKt.startsWith$default(url, "tel:", false, 2, (Object) null)) {
            HtmlUtils.a aVar = this.f15117f;
            StringBuilder sb2 = new StringBuilder();
            int length = url.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char charAt = url.charAt(i10);
                if (Character.isDigit(charAt)) {
                    sb2.append(charAt);
                }
                i10 = i11;
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "filterTo(StringBuilder(), predicate).toString()");
            if (StringsKt.startsWith$default(url, "+", false, 2, (Object) null)) {
                sb3 = Intrinsics.stringPlus("+", sb3);
            }
            aVar.b(Intrinsics.stringPlus("tel:", sb3));
        } else if (!StringsKt.startsWith$default(url, "sms:", false, 2, (Object) null)) {
            if (StringsKt.startsWith$default(url, "mailto:", false, 2, (Object) null)) {
                this.f15117f.d(url);
            } else if (URLUtil.isValidUrl(url)) {
                this.f15117f.c(url, this.f15118j.element);
            }
        } else {
            HtmlUtils.a aVar2 = this.f15117f;
            StringBuilder sb4 = new StringBuilder();
            int length2 = url.length();
            int i12 = 0;
            while (i12 < length2) {
                int i13 = i12 + 1;
                char charAt2 = url.charAt(i12);
                if (Character.isDigit(charAt2)) {
                    sb4.append(charAt2);
                }
                i12 = i13;
            }
            String sb5 = sb4.toString();
            Intrinsics.checkNotNullExpressionValue(sb5, "filterTo(StringBuilder(), predicate).toString()");
            if (StringsKt.startsWith$default(url, "+", false, 2, (Object) null)) {
                sb5 = Intrinsics.stringPlus("+", sb5);
            }
            aVar2.a(Intrinsics.stringPlus("sms:", sb5));
        }
    }
}
