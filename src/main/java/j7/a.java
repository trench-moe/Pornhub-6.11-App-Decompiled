package j7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k8.t;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f11433a;

    /* renamed from: j7.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0166a extends a {

        /* renamed from: b  reason: collision with root package name */
        public final long f11434b;

        /* renamed from: c  reason: collision with root package name */
        public final List<b> f11435c;
        public final List<C0166a> d;

        public C0166a(int i10, long j10) {
            super(i10);
            this.f11434b = j10;
            this.f11435c = new ArrayList();
            this.d = new ArrayList();
        }

        public C0166a b(int i10) {
            int size = this.d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0166a c0166a = this.d.get(i11);
                if (c0166a.f11433a == i10) {
                    return c0166a;
                }
            }
            return null;
        }

        public b c(int i10) {
            int size = this.f11435c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f11435c.get(i11);
                if (bVar.f11433a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // j7.a
        public String toString() {
            String a10 = a.a(this.f11433a);
            String arrays = Arrays.toString(this.f11435c.toArray());
            String arrays2 = Arrays.toString(this.d.toArray());
            StringBuilder n = a0.a.n(a0.a.e(arrays2, a0.a.e(arrays, a0.a.e(a10, 22))), a10, " leaves: ", arrays, " containers: ");
            n.append(arrays2);
            return n.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public final t f11436b;

        public b(int i10, t tVar) {
            super(i10);
            this.f11436b = tVar;
        }
    }

    public a(int i10) {
        this.f11433a = i10;
    }

    public static String a(int i10) {
        StringBuilder sb2 = new StringBuilder(4);
        sb2.append((char) ((i10 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE));
        sb2.append((char) ((i10 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE));
        sb2.append((char) ((i10 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
        sb2.append((char) (i10 & KotlinVersion.MAX_COMPONENT_VALUE));
        return sb2.toString();
    }

    public String toString() {
        return a(this.f11433a);
    }
}
