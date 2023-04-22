package androidx.recyclerview.widget;

import androidx.recyclerview.widget.v;
import com.app.pornhub.domain.config.PerformersConfig;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements v.a {
    public final InterfaceC0038a d;

    /* renamed from: a  reason: collision with root package name */
    public m0.c<b> f2939a = new m0.d(30);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f2940b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f2941c = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public int f2943f = 0;

    /* renamed from: e  reason: collision with root package name */
    public final v f2942e = new v(this);

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0038a {
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2944a;

        /* renamed from: b  reason: collision with root package name */
        public int f2945b;

        /* renamed from: c  reason: collision with root package name */
        public Object f2946c;
        public int d;

        public b(int i10, int i11, int i12, Object obj) {
            this.f2944a = i10;
            this.f2945b = i11;
            this.d = i12;
            this.f2946c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i10 = this.f2944a;
                if (i10 != bVar.f2944a) {
                    return false;
                }
                if (i10 == 8 && Math.abs(this.d - this.f2945b) == 1 && this.d == bVar.f2945b && this.f2945b == bVar.d) {
                    return true;
                }
                if (this.d == bVar.d && this.f2945b == bVar.f2945b) {
                    Object obj2 = this.f2946c;
                    if (obj2 != null) {
                        if (!obj2.equals(bVar.f2946c)) {
                            return false;
                        }
                    } else if (bVar.f2946c != null) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f2944a * 31) + this.f2945b) * 31) + this.d;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append("[");
            int i10 = this.f2944a;
            sb2.append(i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : PerformersConfig.RATING_UP : "rm" : "add");
            sb2.append(",s:");
            sb2.append(this.f2945b);
            sb2.append("c:");
            sb2.append(this.d);
            sb2.append(",p:");
            sb2.append(this.f2946c);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public a(InterfaceC0038a interfaceC0038a) {
        this.d = interfaceC0038a;
    }

    public final boolean a(int i10) {
        int size = this.f2941c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f2941c.get(i11);
            int i12 = bVar.f2944a;
            if (i12 == 8) {
                if (f(bVar.d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f2945b;
                int i14 = bVar.d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void b() {
        int size = this.f2941c.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b0) this.d).a(this.f2941c.get(i10));
        }
        l(this.f2941c);
        this.f2943f = 0;
    }

    public void c() {
        b();
        int size = this.f2940b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f2940b.get(i10);
            int i11 = bVar.f2944a;
            if (i11 == 1) {
                ((b0) this.d).a(bVar);
                ((b0) this.d).d(bVar.f2945b, bVar.d);
            } else if (i11 == 2) {
                ((b0) this.d).a(bVar);
                InterfaceC0038a interfaceC0038a = this.d;
                int i12 = bVar.f2945b;
                int i13 = bVar.d;
                b0 b0Var = (b0) interfaceC0038a;
                b0Var.f2949a.S(i12, i13, true);
                RecyclerView recyclerView = b0Var.f2949a;
                recyclerView.A0 = true;
                recyclerView.f2798x0.f2868c += i13;
            } else if (i11 == 4) {
                ((b0) this.d).a(bVar);
                ((b0) this.d).c(bVar.f2945b, bVar.d, bVar.f2946c);
            } else if (i11 == 8) {
                ((b0) this.d).a(bVar);
                ((b0) this.d).e(bVar.f2945b, bVar.d);
            }
        }
        l(this.f2940b);
        this.f2943f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r12 == r0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(androidx.recyclerview.widget.a.b r15) {
        /*
            Method dump skipped, instructions count: 179
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.d(androidx.recyclerview.widget.a$b):void");
    }

    public void e(b bVar, int i10) {
        ((b0) this.d).a(bVar);
        int i11 = bVar.f2944a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            ((b0) this.d).c(i10, bVar.d, bVar.f2946c);
            return;
        }
        InterfaceC0038a interfaceC0038a = this.d;
        int i12 = bVar.d;
        b0 b0Var = (b0) interfaceC0038a;
        b0Var.f2949a.S(i10, i12, true);
        RecyclerView recyclerView = b0Var.f2949a;
        recyclerView.A0 = true;
        recyclerView.f2798x0.f2868c += i12;
    }

    public int f(int i10, int i11) {
        int size = this.f2941c.size();
        while (i11 < size) {
            b bVar = this.f2941c.get(i11);
            int i12 = bVar.f2944a;
            if (i12 == 8) {
                int i13 = bVar.f2945b;
                if (i13 == i10) {
                    i10 = bVar.d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f2945b;
                if (i14 <= i10) {
                    if (i12 == 2) {
                        int i15 = bVar.d;
                        if (i10 < i14 + i15) {
                            return -1;
                        }
                        i10 -= i15;
                    } else if (i12 == 1) {
                        i10 += bVar.d;
                    }
                }
            }
            i11++;
        }
        return i10;
    }

    public boolean g() {
        return this.f2940b.size() > 0;
    }

    public b h(int i10, int i11, int i12, Object obj) {
        b b10 = this.f2939a.b();
        if (b10 == null) {
            return new b(i10, i11, i12, obj);
        }
        b10.f2944a = i10;
        b10.f2945b = i11;
        b10.d = i12;
        b10.f2946c = obj;
        return b10;
    }

    public final void i(b bVar) {
        this.f2941c.add(bVar);
        int i10 = bVar.f2944a;
        if (i10 == 1) {
            ((b0) this.d).d(bVar.f2945b, bVar.d);
        } else if (i10 == 2) {
            InterfaceC0038a interfaceC0038a = this.d;
            b0 b0Var = (b0) interfaceC0038a;
            b0Var.f2949a.S(bVar.f2945b, bVar.d, false);
            b0Var.f2949a.A0 = true;
        } else if (i10 == 4) {
            ((b0) this.d).c(bVar.f2945b, bVar.d, bVar.f2946c);
        } else if (i10 == 8) {
            ((b0) this.d).e(bVar.f2945b, bVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j() {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.j():void");
    }

    public void k(b bVar) {
        bVar.f2946c = null;
        this.f2939a.a(bVar);
    }

    public void l(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            k(list.get(i10));
        }
        list.clear();
    }

    public final int m(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f2941c.size() - 1; size >= 0; size--) {
            b bVar = this.f2941c.get(size);
            int i14 = bVar.f2944a;
            if (i14 == 8) {
                int i15 = bVar.f2945b;
                int i16 = bVar.d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f2945b = i15 + 1;
                            bVar.d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f2945b = i15 - 1;
                            bVar.d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f2945b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f2945b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f2945b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.d;
                    } else if (i14 == 2) {
                        i10 += bVar.d;
                    }
                } else if (i11 == 1) {
                    bVar.f2945b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f2945b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f2941c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f2941c.get(size2);
            if (bVar2.f2944a == 8) {
                int i18 = bVar2.d;
                if (i18 != bVar2.f2945b) {
                    if (i18 < 0) {
                    }
                }
                this.f2941c.remove(size2);
                k(bVar2);
            } else if (bVar2.d <= 0) {
                this.f2941c.remove(size2);
                k(bVar2);
            }
        }
        return i10;
    }
}
