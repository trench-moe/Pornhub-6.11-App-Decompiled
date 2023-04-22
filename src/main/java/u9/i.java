package u9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public abstract class i implements Iterator<String> {

    /* renamed from: c  reason: collision with root package name */
    public String f15776c;

    /* renamed from: j  reason: collision with root package name */
    public final CharSequence f15778j;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f15779m;

    /* renamed from: t  reason: collision with root package name */
    public int f15780t;

    /* renamed from: f  reason: collision with root package name */
    public int f15777f = 2;
    public int n = 0;

    public i(j jVar, CharSequence charSequence) {
        af.c cVar = jVar.f15781a;
        this.f15779m = jVar.f15782b;
        this.f15780t = IntCompanionObject.MAX_VALUE;
        this.f15778j = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
        r3 = r15.f15780t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
        if (r3 != 1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
        r2 = r15.f15778j.length();
        r15.n = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
        if (r2 <= r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
        r15.f15778j.charAt(r2 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
        r15.f15780t = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00be, code lost:
        r3 = r15.f15778j.subSequence(r1, r2).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011e, code lost:
        r15.f15776c = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0123, code lost:
        if (r15.f15777f == 3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0125, code lost:
        r15.f15777f = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
        return true;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasNext() {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.i.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final String next() {
        if (hasNext()) {
            this.f15777f = 2;
            String str = this.f15776c;
            this.f15776c = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
