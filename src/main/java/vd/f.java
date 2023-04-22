package vd;

import cz.msebera.android.httpclient.HttpException;
import cz.msebera.android.httpclient.MethodNotSupportedException;
import cz.msebera.android.httpclient.ProtocolException;
import java.util.Objects;
import md.l;
import md.m;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public volatile d f16197a;

    /* renamed from: b  reason: collision with root package name */
    public volatile sc.c f16198b;

    /* renamed from: c  reason: collision with root package name */
    public volatile md.a f16199c;
    public volatile m d;

    /* renamed from: e  reason: collision with root package name */
    public volatile c f16200e;

    public f(d dVar, sc.c cVar) {
        this.f16197a = null;
        this.f16198b = null;
        this.f16199c = null;
        this.d = null;
        this.f16200e = null;
        this.f16197a = dVar;
        this.f16199c = cb.e.B;
        this.d = qd.b.f14503b;
        this.f16198b = cVar;
        this.f16200e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [vd.e] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public void a(md.i iVar, l lVar, a aVar) {
        Object obj;
        String str = null;
        e eVar = str;
        if (this.f16198b != null) {
            sc.c cVar = this.f16198b;
            Objects.requireNonNull(cVar);
            l9.e.l(iVar, "HTTP request");
            i iVar2 = (i) cVar.f14954f;
            String c10 = iVar.j().c();
            int indexOf = c10.indexOf(63);
            if (indexOf != -1) {
                c10 = c10.substring(0, indexOf);
            } else {
                int indexOf2 = c10.indexOf(35);
                if (indexOf2 != -1) {
                    c10 = c10.substring(0, indexOf2);
                }
            }
            synchronized (iVar2) {
                l9.e.l(c10, "Request path");
                obj = iVar2.f16203a.get(c10);
                if (obj == null) {
                    for (String str2 : iVar2.f16203a.keySet()) {
                        boolean z10 = true;
                        if (!str2.equals("*")) {
                            if (str2.endsWith("*")) {
                                if (!c10.startsWith(str2.substring(0, str2.length() - 1))) {
                                }
                            }
                            if (!str2.startsWith("*") || !c10.endsWith(str2.substring(1, str2.length()))) {
                                z10 = false;
                            }
                        }
                        if (z10) {
                            if (str != null) {
                                if (str.length() >= str2.length()) {
                                    if (str.length() == str2.length() && str2.endsWith("*")) {
                                    }
                                }
                            }
                            obj = iVar2.f16203a.get(str2);
                            str = str2;
                        }
                    }
                }
            }
            eVar = (e) obj;
        }
        if (eVar != 0) {
            eVar.a(iVar, lVar, aVar);
        } else {
            ((ud.f) lVar).h(501);
        }
    }

    public void b(HttpException httpException, l lVar) {
        if (httpException instanceof MethodNotSupportedException) {
            ((ud.f) lVar).h(501);
        } else if (httpException instanceof ProtocolException) {
            ((ud.f) lVar).h(400);
        } else {
            ((ud.f) lVar).h(500);
        }
        String message = httpException.getMessage();
        if (message == null) {
            message = httpException.toString();
        }
        l9.e.l(message, "Input");
        pd.c cVar = new pd.c(message.getBytes(md.b.f13084b));
        cVar.d("text/plain; charset=US-ASCII");
        ((ud.f) lVar).f15862f = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0211, code lost:
        if (java.lang.Integer.parseInt(r0[0].getValue()) < 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
        if (java.lang.Integer.parseInt(r15.getValue()) > 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0186, code lost:
        if (r11.f15849a.c("Transfer-Encoding") != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cf, code lost:
        if ("chunked".equalsIgnoreCase(r13.getValue()) == false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(qd.a r20, vd.a r21) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.f.c(qd.a, vd.a):void");
    }
}
