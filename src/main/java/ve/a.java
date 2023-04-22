package ve;

import bf.h;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.o;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public long f16204a;

    /* renamed from: b  reason: collision with root package name */
    public final h f16205b;

    public a(h source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f16205b = source;
        this.f16204a = 262144;
    }

    public final o a() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String value = b();
            if (value.length() == 0) {
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return new o((String[]) array, null);
            }
            Intrinsics.checkNotNullParameter(value, "line");
            int indexOf$default = StringsKt.indexOf$default((CharSequence) value, ':', 1, false, 4, (Object) null);
            if (indexOf$default != -1) {
                String name = value.substring(0, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(name, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String value2 = value.substring(indexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(value2, "(this as java.lang.String).substring(startIndex)");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value2, "value");
                arrayList.add(name);
                arrayList.add(StringsKt.trim((CharSequence) value2).toString());
            } else if (value.charAt(0) == ':') {
                String value3 = value.substring(1);
                Intrinsics.checkNotNullExpressionValue(value3, "(this as java.lang.String).substring(startIndex)");
                Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.NAME);
                Intrinsics.checkNotNullParameter(value3, "value");
                arrayList.add(BuildConfig.FLAVOR);
                arrayList.add(StringsKt.trim((CharSequence) value3).toString());
            } else {
                Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.NAME);
                Intrinsics.checkNotNullParameter(value, "value");
                arrayList.add(BuildConfig.FLAVOR);
                arrayList.add(StringsKt.trim((CharSequence) value).toString());
            }
        }
    }

    public final String b() {
        String L = this.f16205b.L(this.f16204a);
        this.f16204a -= L.length();
        return L;
    }
}
