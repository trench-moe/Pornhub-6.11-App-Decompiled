package jb;

/* loaded from: classes2.dex */
public abstract class a implements f<Character> {

    /* renamed from: jb.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0170a extends a {
        @Override // jb.f
        @Deprecated
        /* renamed from: apply */
        public boolean mo1631apply(Character ch) {
            return b(ch.charValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends AbstractC0170a {

        /* renamed from: c  reason: collision with root package name */
        public final char f11655c;

        public b(char c10) {
            this.f11655c = c10;
        }

        @Override // jb.a
        public boolean b(char c10) {
            return c10 == this.f11655c;
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("CharMatcher.is('");
            char c10 = this.f11655c;
            char[] cArr = {'\\', 'u', 0, 0, 0, 0};
            for (int i10 = 0; i10 < 4; i10++) {
                cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
                c10 = (char) (c10 >> 4);
            }
            m10.append(String.copyValueOf(cArr));
            m10.append("')");
            return m10.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c extends AbstractC0170a {

        /* renamed from: c  reason: collision with root package name */
        public final String f11656c;

        public c(String str) {
            this.f11656c = str;
        }

        public final String toString() {
            return this.f11656c;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends c {

        /* renamed from: f  reason: collision with root package name */
        public static final d f11657f = new d();

        public d() {
            super("CharMatcher.none()");
        }

        @Override // jb.a
        public int a(CharSequence charSequence, int i10) {
            e.e(i10, charSequence.length());
            return -1;
        }

        @Override // jb.a
        public boolean b(char c10) {
            return false;
        }
    }

    public int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        e.e(i10, length);
        while (i10 < length) {
            if (b(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean b(char c10);
}
