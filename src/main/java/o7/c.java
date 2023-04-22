package o7;

import t7.g;
import w6.y;

/* loaded from: classes2.dex */
public interface c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f13606a = new a();

    /* loaded from: classes2.dex */
    public class a implements c {
        @Override // o7.c
        public b a(y yVar) {
            String str = yVar.B;
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1354451219:
                        if (!str.equals("application/vnd.dvb.ait")) {
                            break;
                        } else {
                            c10 = 0;
                            break;
                        }
                    case -1348231605:
                        if (!str.equals("application/x-icy")) {
                            break;
                        } else {
                            c10 = 1;
                            break;
                        }
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (!str.equals("application/x-emsg")) {
                            break;
                        } else {
                            c10 = 3;
                            break;
                        }
                    case 1652648887:
                        if (!str.equals("application/x-scte35")) {
                            break;
                        } else {
                            c10 = 4;
                            break;
                        }
                }
                switch (c10) {
                    case 0:
                        return new p7.b();
                    case 1:
                        return new s7.a();
                    case 2:
                        return new g();
                    case 3:
                        return new q7.b();
                    case 4:
                        return new v7.c();
                }
            }
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }

        @Override // o7.c
        public boolean c(y yVar) {
            String str = yVar.B;
            if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str)) {
                if (!"application/vnd.dvb.ait".equals(str)) {
                    return false;
                }
            }
            return true;
        }
    }

    b a(y yVar);

    boolean c(y yVar);
}
