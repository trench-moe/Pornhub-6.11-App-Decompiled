package w9;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class p6 extends l {

    /* renamed from: f  reason: collision with root package name */
    public final n2.c f17275f;

    public p6(n2.c cVar) {
        this.f17275f = cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // w9.l, w9.o
    public final o j(String str, h2.h hVar, List list) {
        char c10;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            a0.b.u0("getEventName", 0, list);
            return new s(((b) this.f17275f.f13277j).f17072a);
        } else if (c10 == 1) {
            a0.b.u0("getParamValue", 1, list);
            String zzi = hVar.b((o) list.get(0)).zzi();
            b bVar = (b) this.f17275f.f13277j;
            return a0.b.o0(bVar.f17074c.containsKey(zzi) ? bVar.f17074c.get(zzi) : null);
        } else if (c10 == 2) {
            a0.b.u0("getParams", 0, list);
            Map map = ((b) this.f17275f.f13277j).f17074c;
            l lVar = new l();
            for (String str2 : map.keySet()) {
                lVar.g(str2, a0.b.o0(map.get(str2)));
            }
            return lVar;
        } else if (c10 == 3) {
            a0.b.u0("getTimestamp", 0, list);
            return new h(Double.valueOf(((b) this.f17275f.f13277j).f17073b));
        } else if (c10 == 4) {
            a0.b.u0("setEventName", 1, list);
            o b10 = hVar.b((o) list.get(0));
            if (o.f17256k.equals(b10) || o.f17257l.equals(b10)) {
                throw new IllegalArgumentException("Illegal event name");
            }
            ((b) this.f17275f.f13277j).f17072a = b10.zzi();
            return new s(b10.zzi());
        } else if (c10 != 5) {
            return super.j(str, hVar, list);
        } else {
            a0.b.u0("setParamValue", 2, list);
            String zzi2 = hVar.b((o) list.get(0)).zzi();
            o b11 = hVar.b((o) list.get(1));
            b bVar2 = (b) this.f17275f.f13277j;
            Object s02 = a0.b.s0(b11);
            if (s02 == null) {
                bVar2.f17074c.remove(zzi2);
            } else {
                bVar2.f17074c.put(zzi2, s02);
            }
            return b11;
        }
    }
}
