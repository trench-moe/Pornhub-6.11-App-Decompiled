package i0;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f10455a;

    public g(LocaleList localeList) {
        this.f10455a = localeList;
    }

    @Override // i0.f
    public Object a() {
        return this.f10455a;
    }

    public boolean equals(Object obj) {
        return this.f10455a.equals(((f) obj).a());
    }

    @Override // i0.f
    public Locale get(int i10) {
        return this.f10455a.get(i10);
    }

    public int hashCode() {
        return this.f10455a.hashCode();
    }

    public String toString() {
        return this.f10455a.toString();
    }
}
