package g1;

import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public String f9691a;

    /* renamed from: b  reason: collision with root package name */
    public int f9692b;

    /* renamed from: c  reason: collision with root package name */
    public int f9693c;

    public c(String str, int i10, int i11) {
        this.f9691a = str;
        this.f9692b = i10;
        this.f9693c = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f9692b >= 0 && cVar.f9692b >= 0) {
                return TextUtils.equals(this.f9691a, cVar.f9691a) && this.f9692b == cVar.f9692b && this.f9693c == cVar.f9693c;
            }
            return TextUtils.equals(this.f9691a, cVar.f9691a) && this.f9693c == cVar.f9693c;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f9691a, Integer.valueOf(this.f9693c));
    }
}
