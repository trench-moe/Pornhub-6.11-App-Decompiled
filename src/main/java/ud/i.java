package ud;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class i implements Iterator {

    /* renamed from: c  reason: collision with root package name */
    public final md.f f15871c;

    /* renamed from: f  reason: collision with root package name */
    public String f15872f;

    /* renamed from: j  reason: collision with root package name */
    public String f15873j;

    /* renamed from: m  reason: collision with root package name */
    public int f15874m;

    public i(md.f fVar) {
        l9.e.l(fVar, "Header iterator");
        this.f15871c = fVar;
        this.f15874m = a(-1);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00e0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(int r14) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.i.a(int):int");
    }

    public boolean c(char c10) {
        if (Character.isLetterOrDigit(c10)) {
            return true;
        }
        if (Character.isISOControl(c10)) {
            return false;
        }
        return !(" ,;=()<>@:\\\"/[]?{}\t".indexOf(c10) >= 0);
    }

    public String d() {
        String str = this.f15873j;
        if (str != null) {
            this.f15874m = a(this.f15874m);
            return str;
        }
        throw new NoSuchElementException("Iteration already finished.");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f15873j != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return d();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }
}
