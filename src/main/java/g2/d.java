package g2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: c  reason: collision with root package name */
    public static final d f9711c = new d("COMPOSITION");

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f9712a;

    /* renamed from: b  reason: collision with root package name */
    public e f9713b;

    public d(d dVar) {
        this.f9712a = new ArrayList(dVar.f9712a);
        this.f9713b = dVar.f9713b;
    }

    public d(String... strArr) {
        this.f9712a = Arrays.asList(strArr);
    }

    public d a(String str) {
        d dVar = new d(this);
        dVar.f9712a.add(str);
        return dVar;
    }

    public final boolean b() {
        List<String> list = this.f9712a;
        return list.get(list.size() - 1).equals("**");
    }

    public boolean c(String str, int i10) {
        boolean z10 = false;
        if (i10 >= this.f9712a.size()) {
            return false;
        }
        boolean z11 = i10 == this.f9712a.size() - 1;
        String str2 = this.f9712a.get(i10);
        if (!str2.equals("**")) {
            boolean z12 = str2.equals(str) || str2.equals("*");
            if (!z11) {
                if (i10 == this.f9712a.size() - 2 && b()) {
                }
                return z10;
            }
            if (z12) {
                z10 = true;
            }
            return z10;
        }
        if (!z11 && this.f9712a.get(i10 + 1).equals(str)) {
            if (i10 == this.f9712a.size() - 2 || (i10 == this.f9712a.size() - 3 && b())) {
                z10 = true;
            }
            return z10;
        } else if (z11) {
            return true;
        } else {
            int i11 = i10 + 1;
            if (i11 < this.f9712a.size() - 1) {
                return false;
            }
            return this.f9712a.get(i11).equals(str);
        }
    }

    public int d(String str, int i10) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (this.f9712a.get(i10).equals("**")) {
            return (i10 != this.f9712a.size() - 1 && this.f9712a.get(i10 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean e(String str, int i10) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i10 >= this.f9712a.size()) {
            return false;
        }
        return this.f9712a.get(i10).equals(str) || this.f9712a.get(i10).equals("**") || this.f9712a.get(i10).equals("*");
    }

    public boolean f(String str, int i10) {
        return "__container".equals(str) || i10 < this.f9712a.size() - 1 || this.f9712a.get(i10).equals("**");
    }

    public d g(e eVar) {
        d dVar = new d(this);
        dVar.f9713b = eVar;
        return dVar;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("KeyPath{keys=");
        m10.append(this.f9712a);
        m10.append(",resolved=");
        return a0.a.l(m10, this.f9713b != null, '}');
    }
}
