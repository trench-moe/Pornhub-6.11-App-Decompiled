package u9;

/* loaded from: classes2.dex */
public final class e extends af.c {

    /* renamed from: a  reason: collision with root package name */
    public final char f15773a;

    public e(char c10) {
        this.f15773a = c10;
    }

    @Override // af.c
    public final boolean r(char c10) {
        return c10 == this.f15773a;
    }

    public final String toString() {
        int i10 = this.f15773a;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return android.support.v4.media.b.n(new StringBuilder(String.valueOf(copyValueOf).length() + 18), "CharMatcher.is('", copyValueOf, "')");
    }
}
