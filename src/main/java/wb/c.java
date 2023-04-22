package wb;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    public static final b f17435c = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public final ac.c f17436a;

    /* renamed from: b  reason: collision with root package name */
    public wb.a f17437b = f17435c;

    /* loaded from: classes2.dex */
    public static final class b implements wb.a {
        public b(a aVar) {
        }

        @Override // wb.a
        public void a() {
        }

        @Override // wb.a
        public String b() {
            return null;
        }

        @Override // wb.a
        public void c(long j10, String str) {
        }
    }

    public c(ac.c cVar) {
        this.f17436a = cVar;
    }

    public c(ac.c cVar, String str) {
        this.f17436a = cVar;
        a(str);
    }

    public final void a(String str) {
        this.f17437b.a();
        this.f17437b = f17435c;
        if (str == null) {
            return;
        }
        this.f17437b = new f(this.f17436a.f(str, "userlog"), 65536);
    }
}
