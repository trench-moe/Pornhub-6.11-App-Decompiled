package kb;

import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f12046a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final e f12047b = new b(-1);

    /* renamed from: c  reason: collision with root package name */
    public static final e f12048c = new b(1);

    /* loaded from: classes2.dex */
    public static class a extends e {
        public a() {
            super(null);
        }

        @Override // kb.e
        public e a(int i10, int i11) {
            return g(i10 < i11 ? -1 : i10 > i11 ? 1 : 0);
        }

        @Override // kb.e
        public e b(long j10, long j11) {
            int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
            return g(i10 < 0 ? -1 : i10 > 0 ? 1 : 0);
        }

        @Override // kb.e
        public <T> e c(@NullableDecl T t2, @NullableDecl T t8, Comparator<T> comparator) {
            return g(comparator.compare(t2, t8));
        }

        @Override // kb.e
        public e d(boolean z10, boolean z11) {
            return g(z10 == z11 ? 0 : z10 ? 1 : -1);
        }

        @Override // kb.e
        public e e(boolean z10, boolean z11) {
            return g(z11 == z10 ? 0 : z11 ? 1 : -1);
        }

        @Override // kb.e
        public int f() {
            return 0;
        }

        public e g(int i10) {
            return i10 < 0 ? e.f12047b : i10 > 0 ? e.f12048c : e.f12046a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends e {
        public final int d;

        public b(int i10) {
            super(null);
            this.d = i10;
        }

        @Override // kb.e
        public e a(int i10, int i11) {
            return this;
        }

        @Override // kb.e
        public e b(long j10, long j11) {
            return this;
        }

        @Override // kb.e
        public <T> e c(@NullableDecl T t2, @NullableDecl T t8, @NullableDecl Comparator<T> comparator) {
            return this;
        }

        @Override // kb.e
        public e d(boolean z10, boolean z11) {
            return this;
        }

        @Override // kb.e
        public e e(boolean z10, boolean z11) {
            return this;
        }

        @Override // kb.e
        public int f() {
            return this.d;
        }
    }

    public e(a aVar) {
    }

    public abstract e a(int i10, int i11);

    public abstract e b(long j10, long j11);

    public abstract <T> e c(@NullableDecl T t2, @NullableDecl T t8, Comparator<T> comparator);

    public abstract e d(boolean z10, boolean z11);

    public abstract e e(boolean z10, boolean z11);

    public abstract int f();
}
