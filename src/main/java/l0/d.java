package l0;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final l0.c f12169a = new C0200d(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final l0.c f12170b = new C0200d(null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final l0.c f12171c;
    public static final l0.c d;

    /* loaded from: classes2.dex */
    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12172a = new a();

        @Override // l0.d.b
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                l0.c cVar = d.f12169a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i13 = 2;
                                break;
                        }
                        i10++;
                    }
                    i13 = 0;
                    i10++;
                }
                i13 = 1;
                i10++;
            }
            return i13;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        int a(CharSequence charSequence, int i10, int i11);
    }

    /* loaded from: classes2.dex */
    public static abstract class c implements l0.c {

        /* renamed from: a  reason: collision with root package name */
        public final b f12173a;

        public c(b bVar) {
            this.f12173a = bVar;
        }

        public abstract boolean a();

        public boolean b(CharSequence charSequence, int i10, int i11) {
            if (i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f12173a;
            if (bVar == null) {
                return a();
            }
            int a10 = bVar.a(charSequence, i10, i11);
            if (a10 != 0) {
                if (a10 != 1) {
                    return a();
                }
                return false;
            }
            return true;
        }
    }

    /* renamed from: l0.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0200d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12174b;

        public C0200d(b bVar, boolean z10) {
            super(bVar);
            this.f12174b = z10;
        }

        @Override // l0.d.c
        public boolean a() {
            return this.f12174b;
        }
    }

    static {
        a aVar = a.f12172a;
        f12171c = new C0200d(aVar, false);
        d = new C0200d(aVar, true);
    }
}
