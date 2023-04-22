package w9;

import java.util.Iterator;
import kotlin.text.Typography;

/* loaded from: classes2.dex */
public final class s implements Iterable, o {

    /* renamed from: c  reason: collision with root package name */
    public final String f17300c;

    public s(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f17300c = str;
    }

    @Override // w9.o
    public final Boolean b() {
        return Boolean.valueOf(!this.f17300c.isEmpty());
    }

    @Override // w9.o
    public final o c() {
        return new s(this.f17300c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.f17300c.equals(((s) obj).f17300c);
        }
        return false;
    }

    @Override // w9.o
    public final Iterator h() {
        return new q(this);
    }

    public final int hashCode() {
        return this.f17300c.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new r(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0302, code lost:
        if (r1[r5].equals(com.appsflyer.oaid.BuildConfig.FLAVOR) == false) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // w9.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final w9.o j(java.lang.String r19, h2.h r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 1778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.s.j(java.lang.String, h2.h, java.util.List):w9.o");
    }

    public final String toString() {
        String str = this.f17300c;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append(Typography.quote);
        sb2.append(str);
        sb2.append(Typography.quote);
        return sb2.toString();
    }

    @Override // w9.o
    public final Double zzh() {
        if (this.f17300c.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.f17300c);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // w9.o
    public final String zzi() {
        return this.f17300c;
    }
}
