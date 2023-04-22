package t0;

import android.graphics.Rect;
import java.util.Comparator;
import t0.a;

/* loaded from: classes2.dex */
public class b {

    /* loaded from: classes2.dex */
    public interface a<T> {
    }

    /* renamed from: t0.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0266b<T, V> {
    }

    /* loaded from: classes2.dex */
    public static class c<T> implements Comparator<T> {

        /* renamed from: c  reason: collision with root package name */
        public final Rect f15072c = new Rect();

        /* renamed from: f  reason: collision with root package name */
        public final Rect f15073f = new Rect();

        /* renamed from: j  reason: collision with root package name */
        public final boolean f15074j;

        /* renamed from: m  reason: collision with root package name */
        public final a<T> f15075m;

        public c(boolean z10, a<T> aVar) {
            this.f15074j = z10;
            this.f15075m = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t2, T t8) {
            Rect rect = this.f15072c;
            Rect rect2 = this.f15073f;
            ((a.C0265a) this.f15075m).a(t2, rect);
            ((a.C0265a) this.f15075m).a(t8, rect2);
            int i10 = rect.top;
            int i11 = rect2.top;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.left;
            int i13 = rect2.left;
            if (i12 < i13) {
                return this.f15074j ? 1 : -1;
            } else if (i12 > i13) {
                return this.f15074j ? -1 : 1;
            } else {
                int i14 = rect.bottom;
                int i15 = rect2.bottom;
                if (i14 < i15) {
                    return -1;
                }
                if (i14 > i15) {
                    return 1;
                }
                int i16 = rect.right;
                int i17 = rect2.right;
                if (i16 < i17) {
                    return this.f15074j ? 1 : -1;
                } else if (i16 > i17) {
                    return this.f15074j ? -1 : 1;
                } else {
                    return 0;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r12.right <= r14.left) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
        if (r12.top >= r14.bottom) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(int r11, android.graphics.Rect r12, android.graphics.Rect r13, android.graphics.Rect r14) {
        /*
            Method dump skipped, instructions count: 161
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.b.a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean b(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean c(Rect rect, Rect rect2, int i10) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        } else if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        } else if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        } else if (i10 == 130) {
            int i17 = rect.top;
            int i18 = rect2.top;
            if (i17 >= i18) {
                if (rect.bottom <= i18) {
                }
                return false;
            }
            if (rect.bottom < rect2.bottom) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static int d(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            i11 = rect2.top;
            i12 = rect.bottom;
        }
        return Math.max(0, i11 - i12);
    }

    public static int e(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
