package kotlin.text;

import android.support.v4.media.a;
import android.support.v4.media.b;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/ScreenFloatValueRegEx;", BuildConfig.FLAVOR, "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lkotlin/text/Regex;", "kotlin-stdlib"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ScreenFloatValueRegEx {
    public static final ScreenFloatValueRegEx INSTANCE = new ScreenFloatValueRegEx();
    @JvmField
    public static final Regex value;

    static {
        String stringPlus = Intrinsics.stringPlus("[eE][+-]?", "(\\p{Digit}+)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        sb2.append("(\\p{Digit}+)");
        sb2.append("(\\.)?(");
        sb2.append("(\\p{Digit}+)");
        sb2.append("?)(");
        a.o(sb2, stringPlus, ")?)|(\\.(", "(\\p{Digit}+)", ")(");
        a.o(sb2, stringPlus, ")?)|((", "(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))", ")[pP][+-]?");
        value = new Regex(b.j("[\\x00-\\x20]*[+-]?(NaN|Infinity|((", b.l(sb2, "(\\p{Digit}+)", ')'), ")[fFdD]?))[\\x00-\\x20]*"));
    }

    private ScreenFloatValueRegEx() {
    }
}
