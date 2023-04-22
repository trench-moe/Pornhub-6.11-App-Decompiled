package kotlin.text;

import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Objects;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a5\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u0003*\u0002H\u00012\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u001a9\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u00032\u0006\u0010\n\u001a\u0002H\u00012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fH\u0000¢\u0006\u0002\u0010\r\u001a\u0015\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u0003H\u0087\b\u001a\u001d\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u000fH\u0087\b\u001a\u001f\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0006H\u0087\b\u001a7\u0010\u0010\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u0003*\u0002H\u00012\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"append", "T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", AppMeasurementSdk.ConditionalUserProperty.VALUE, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "(Ljava/lang/Appendable;[Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "appendElement", BuildConfig.FLAVOR, "element", "transform", "Lkotlin/Function1;", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "appendLine", BuildConfig.FLAVOR, "appendRange", "startIndex", BuildConfig.FLAVOR, "endIndex", "(Ljava/lang/Appendable;Ljava/lang/CharSequence;II)Ljava/lang/Appendable;", "kotlin-stdlib"}, k = 5, mv = {1, 6, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class StringsKt__AppendableKt {
    public static final <T extends Appendable> T append(T t2, CharSequence... value) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        int length = value.length;
        int i10 = 0;
        while (i10 < length) {
            CharSequence charSequence = value[i10];
            i10++;
            t2.append(charSequence);
        }
        return t2;
    }

    public static <T> void appendElement(Appendable appendable, T t2, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        if (function1 != null) {
            appendable.append(function1.invoke(t2));
            return;
        }
        if (t2 == null ? true : t2 instanceof CharSequence) {
            appendable.append((CharSequence) t2);
        } else if (t2 instanceof Character) {
            appendable.append(((Character) t2).charValue());
        } else {
            appendable.append(String.valueOf(t2));
        }
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Appendable appendLine(Appendable appendable) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append('\n');
        Intrinsics.checkNotNullExpressionValue(append, "append('\\n')");
        return append;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Appendable appendLine(Appendable appendable, char c10) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(c10);
        Intrinsics.checkNotNullExpressionValue(append, "append(value)");
        Appendable append2 = append.append('\n');
        Intrinsics.checkNotNullExpressionValue(append2, "append('\\n')");
        return append2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Appendable appendLine(Appendable appendable, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(append, "append(value)");
        Appendable append2 = append.append('\n');
        Intrinsics.checkNotNullExpressionValue(append2, "append('\\n')");
        return append2;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T extends Appendable> T appendRange(T t2, CharSequence value, int i10, int i11) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        T t8 = (T) t2.append(value, i10, i11);
        Objects.requireNonNull(t8, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t8;
    }
}
