package n5;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes2.dex */
public class l<A, B> {

    /* renamed from: a  reason: collision with root package name */
    public final d6.i<b<A>, B> f13334a;

    /* loaded from: classes2.dex */
    public class a extends d6.i<b<A>, B> {
        public a(l lVar, long j10) {
            super(j10);
        }

        @Override // d6.i
        public void c(Object obj, Object obj2) {
            ((b) obj).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<A> {
        public static final Queue<b<?>> d;

        /* renamed from: a  reason: collision with root package name */
        public int f13335a;

        /* renamed from: b  reason: collision with root package name */
        public int f13336b;

        /* renamed from: c  reason: collision with root package name */
        public A f13337c;

        static {
            char[] cArr = d6.l.f8803a;
            d = new ArrayDeque(0);
        }

        /* JADX WARN: Finally extract failed */
        public static <A> b<A> a(A a10, int i10, int i11) {
            b<A> bVar;
            Queue<b<?>> queue = d;
            synchronized (queue) {
                try {
                    bVar = (b) ((ArrayDeque) queue).poll();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.f13337c = a10;
            bVar.f13336b = i10;
            bVar.f13335a = i11;
            return bVar;
        }

        public void b() {
            Queue<b<?>> queue = d;
            synchronized (queue) {
                ((ArrayDeque) queue).offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f13336b == bVar.f13336b && this.f13335a == bVar.f13335a && this.f13337c.equals(bVar.f13337c);
            }
            return false;
        }

        public int hashCode() {
            return this.f13337c.hashCode() + (((this.f13335a * 31) + this.f13336b) * 31);
        }
    }

    public l(long j10) {
        this.f13334a = new a(this, j10);
    }
}
