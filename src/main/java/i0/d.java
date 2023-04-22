package i0;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f10451b = 0;

    /* renamed from: a  reason: collision with root package name */
    public f f10452a;

    static {
        a(new Locale[0]);
    }

    public d(f fVar) {
        this.f10452a = fVar;
    }

    public static d a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new d(new g(new LocaleList(localeArr))) : new d(new e(localeArr));
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && this.f10452a.equals(((d) obj).f10452a);
    }

    public int hashCode() {
        return this.f10452a.hashCode();
    }

    public String toString() {
        return this.f10452a.toString();
    }
}
