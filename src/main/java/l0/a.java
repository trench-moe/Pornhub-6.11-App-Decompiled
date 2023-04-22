package l0;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import java.util.Locale;
import l0.d;

/* loaded from: classes2.dex */
public final class a {
    public static final c d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f12155e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f12156f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f12157g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f12158h;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12159a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12160b;

    /* renamed from: c  reason: collision with root package name */
    public final c f12161c;

    /* renamed from: l0.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0199a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f12162e = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f12163a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12164b;

        /* renamed from: c  reason: collision with root package name */
        public int f12165c;
        public char d;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f12162e[i10] = Character.getDirectionality(i10);
            }
        }

        public C0199a(CharSequence charSequence, boolean z10) {
            this.f12163a = charSequence;
            this.f12164b = charSequence.length();
        }

        public byte a() {
            char charAt = this.f12163a.charAt(this.f12165c - 1);
            this.d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f12163a, this.f12165c);
                this.f12165c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f12165c--;
            char c10 = this.d;
            return c10 < 1792 ? f12162e[c10] : Character.getDirectionality(c10);
        }
    }

    static {
        c cVar = d.f12171c;
        d = cVar;
        f12155e = Character.toString((char) 8206);
        f12156f = Character.toString((char) 8207);
        f12157g = new a(false, 2, cVar);
        f12158h = new a(true, 2, cVar);
    }

    public a(boolean z10, int i10, c cVar) {
        this.f12159a = z10;
        this.f12160b = i10;
        this.f12161c = cVar;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        C0199a c0199a = new C0199a(charSequence, false);
        c0199a.f12165c = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            while (true) {
                int i13 = c0199a.f12165c;
                if (i13 < c0199a.f12164b && i10 == 0) {
                    char charAt = c0199a.f12163a.charAt(i13);
                    c0199a.d = charAt;
                    if (Character.isHighSurrogate(charAt)) {
                        int codePointAt = Character.codePointAt(c0199a.f12163a, c0199a.f12165c);
                        c0199a.f12165c = Character.charCount(codePointAt) + c0199a.f12165c;
                        directionality = Character.getDirectionality(codePointAt);
                    } else {
                        c0199a.f12165c++;
                        char c10 = c0199a.d;
                        directionality = c10 < 1792 ? C0199a.f12162e[c10] : Character.getDirectionality(c10);
                    }
                    if (directionality != 0) {
                        if (directionality != 1 && directionality != 2) {
                            if (directionality != 9) {
                                switch (directionality) {
                                    case 14:
                                    case 15:
                                        i12++;
                                        i11 = -1;
                                        break;
                                    case 16:
                                    case 17:
                                        i12++;
                                        i11 = 1;
                                        break;
                                    case 18:
                                        i12--;
                                        i11 = 0;
                                        break;
                                }
                            }
                        } else if (i12 == 0) {
                        }
                    } else if (i12 == 0) {
                    }
                    i10 = i12;
                }
            }
        }
        if (i10 == 0) {
            return 0;
        }
        if (i11 != 0) {
            return i11;
        }
        while (c0199a.f12165c > 0) {
            switch (c0199a.a()) {
                case 14:
                case 15:
                    if (i10 == i12) {
                        return -1;
                    }
                    break;
                case 16:
                case 17:
                    if (i10 == i12) {
                        return 1;
                    }
                    break;
                case 18:
                    i12++;
                    continue;
                default:
                    continue;
            }
            i12--;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0013, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.CharSequence r9) {
        /*
            r6 = r9
            l0.a$a r0 = new l0.a$a
            r8 = 6
            r8 = 0
            r1 = r8
            r0.<init>(r6, r1)
            r8 = 7
            int r6 = r0.f12164b
            r0.f12165c = r6
            r8 = 5
            r8 = 0
            r6 = r8
            r2 = 0
            r8 = 4
        L13:
            r8 = 6
        L14:
            int r3 = r0.f12165c
            r8 = 1
            r4 = 1
            if (r3 <= 0) goto L61
            r8 = 7
            byte r8 = r0.a()
            r3 = r8
            if (r3 == 0) goto L54
            r8 = 7
            if (r3 == r4) goto L49
            r5 = 2
            r8 = 4
            if (r3 == r5) goto L49
            r8 = 6
            r8 = 9
            r5 = r8
            if (r3 == r5) goto L13
            switch(r3) {
                case 14: goto L40;
                case 15: goto L40;
                case 16: goto L3b;
                case 17: goto L3b;
                case 18: goto L37;
                default: goto L32;
            }
        L32:
            r8 = 4
            if (r2 != 0) goto L13
            r8 = 3
            goto L5f
        L37:
            r8 = 5
            int r6 = r6 + 1
            goto L14
        L3b:
            r8 = 7
            if (r2 != r6) goto L45
            r8 = 5
            goto L4d
        L40:
            r8 = 5
            if (r2 != r6) goto L45
            r8 = 4
            goto L58
        L45:
            r8 = 7
            int r6 = r6 + (-1)
            goto L14
        L49:
            r8 = 3
            if (r6 != 0) goto L50
            r8 = 5
        L4d:
            r1 = 1
            r8 = 4
            goto L62
        L50:
            r8 = 4
            if (r2 != 0) goto L13
            goto L5f
        L54:
            r8 = 4
            if (r6 != 0) goto L5b
            r8 = 5
        L58:
            r8 = -1
            r1 = r8
            goto L62
        L5b:
            r8 = 4
            if (r2 != 0) goto L13
            r8 = 1
        L5f:
            r2 = r6
            goto L14
        L61:
            r8 = 1
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.b(java.lang.CharSequence):int");
    }

    public static a c() {
        Locale locale = Locale.getDefault();
        int i10 = e.f12175a;
        boolean z10 = true;
        if (TextUtils.getLayoutDirectionFromLocale(locale) != 1) {
            z10 = false;
        }
        c cVar = d;
        return cVar == d ? z10 ? f12158h : f12157g : new a(z10, 2, cVar);
    }

    public CharSequence d(CharSequence charSequence, c cVar, boolean z10) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean b10 = ((d.c) cVar).b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z11 = (this.f12160b & 2) != 0;
        String str2 = BuildConfig.FLAVOR;
        if (z11 && z10) {
            boolean b11 = ((d.c) (b10 ? d.f12170b : d.f12169a)).b(charSequence, 0, charSequence.length());
            if (this.f12159a || !(b11 || a(charSequence) == 1)) {
                if (!this.f12159a || (b11 && a(charSequence) != -1)) {
                    str = BuildConfig.FLAVOR;
                }
                str = f12156f;
            } else {
                str = f12155e;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (b10 != this.f12159a) {
            spannableStringBuilder.append(b10 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            boolean b12 = ((d.c) (b10 ? d.f12170b : d.f12169a)).b(charSequence, 0, charSequence.length());
            if (this.f12159a || (!b12 && b(charSequence) != 1)) {
                if (this.f12159a && (!b12 || b(charSequence) == -1)) {
                    str2 = f12156f;
                }
                spannableStringBuilder.append((CharSequence) str2);
            }
            str2 = f12155e;
            spannableStringBuilder.append((CharSequence) str2);
        }
        return spannableStringBuilder;
    }
}
