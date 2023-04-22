package w9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class p implements o {

    /* renamed from: c  reason: collision with root package name */
    public final String f17268c;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f17269f;

    public p(String str, List list) {
        this.f17268c = str;
        ArrayList arrayList = new ArrayList();
        this.f17269f = arrayList;
        arrayList.addAll(list);
    }

    @Override // w9.o
    public final Boolean b() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // w9.o
    public final o c() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            String str = this.f17268c;
            if (str == null ? pVar.f17268c == null : str.equals(pVar.f17268c)) {
                return this.f17269f.equals(pVar.f17269f);
            }
            return false;
        }
        return false;
    }

    @Override // w9.o
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        String str = this.f17268c;
        return this.f17269f.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // w9.o
    public final o j(String str, h2.h hVar, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // w9.o
    public final Double zzh() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // w9.o
    public final String zzi() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }
}
