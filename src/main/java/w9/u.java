package w9;

import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* loaded from: classes2.dex */
public final class u extends v {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f17311b;

    public u(int i10) {
        this.f17311b = i10;
        if (i10 != 1) {
            this.f17332a.add(zzbl.BITWISE_AND);
            this.f17332a.add(zzbl.BITWISE_LEFT_SHIFT);
            this.f17332a.add(zzbl.BITWISE_NOT);
            this.f17332a.add(zzbl.BITWISE_OR);
            this.f17332a.add(zzbl.BITWISE_RIGHT_SHIFT);
            this.f17332a.add(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT);
            this.f17332a.add(zzbl.BITWISE_XOR);
            return;
        }
        this.f17332a.add(zzbl.ADD);
        this.f17332a.add(zzbl.DIVIDE);
        this.f17332a.add(zzbl.MODULUS);
        this.f17332a.add(zzbl.MULTIPLY);
        this.f17332a.add(zzbl.NEGATE);
        this.f17332a.add(zzbl.POST_DECREMENT);
        this.f17332a.add(zzbl.POST_INCREMENT);
        this.f17332a.add(zzbl.PRE_DECREMENT);
        this.f17332a.add(zzbl.PRE_INCREMENT);
        this.f17332a.add(zzbl.SUBTRACT);
    }

    @Override // w9.v
    public final o a(String str, h2.h hVar, List list) {
        o sVar;
        h hVar2;
        switch (this.f17311b) {
            case 0:
                zzbl zzblVar = zzbl.ADD;
                switch (a0.b.r0(str).ordinal()) {
                    case 4:
                        zzbl zzblVar2 = zzbl.BITWISE_AND;
                        a0.b.u0("BITWISE_AND", 2, list);
                        return new h(Double.valueOf(a0.b.m0(hVar.b((o) list.get(0)).zzh().doubleValue()) & a0.b.m0(hVar.b((o) list.get(1)).zzh().doubleValue())));
                    case 5:
                        zzbl zzblVar3 = zzbl.BITWISE_LEFT_SHIFT;
                        a0.b.u0("BITWISE_LEFT_SHIFT", 2, list);
                        hVar2 = new h(Double.valueOf(a0.b.m0(hVar.b((o) list.get(0)).zzh().doubleValue()) << ((int) (a0.b.q0(hVar.b((o) list.get(1)).zzh().doubleValue()) & 31))));
                        break;
                    case 6:
                        zzbl zzblVar4 = zzbl.BITWISE_NOT;
                        a0.b.u0("BITWISE_NOT", 1, list);
                        return new h(Double.valueOf(~a0.b.m0(hVar.b((o) list.get(0)).zzh().doubleValue())));
                    case 7:
                        zzbl zzblVar5 = zzbl.BITWISE_OR;
                        a0.b.u0("BITWISE_OR", 2, list);
                        return new h(Double.valueOf(a0.b.m0(hVar.b((o) list.get(0)).zzh().doubleValue()) | a0.b.m0(hVar.b((o) list.get(1)).zzh().doubleValue())));
                    case 8:
                        zzbl zzblVar6 = zzbl.BITWISE_RIGHT_SHIFT;
                        a0.b.u0("BITWISE_RIGHT_SHIFT", 2, list);
                        hVar2 = new h(Double.valueOf(a0.b.m0(hVar.b((o) list.get(0)).zzh().doubleValue()) >> ((int) (a0.b.q0(hVar.b((o) list.get(1)).zzh().doubleValue()) & 31))));
                        break;
                    case 9:
                        zzbl zzblVar7 = zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT;
                        a0.b.u0("BITWISE_UNSIGNED_RIGHT_SHIFT", 2, list);
                        return new h(Double.valueOf(a0.b.q0(hVar.b((o) list.get(0)).zzh().doubleValue()) >>> ((int) (a0.b.q0(hVar.b((o) list.get(1)).zzh().doubleValue()) & 31))));
                    case 10:
                        zzbl zzblVar8 = zzbl.BITWISE_XOR;
                        a0.b.u0("BITWISE_XOR", 2, list);
                        return new h(Double.valueOf(a0.b.m0(hVar.b((o) list.get(0)).zzh().doubleValue()) ^ a0.b.m0(hVar.b((o) list.get(1)).zzh().doubleValue())));
                    default:
                        b(str);
                        throw null;
                }
                return hVar2;
            default:
                zzbl zzblVar9 = zzbl.ADD;
                int ordinal = a0.b.r0(str).ordinal();
                if (ordinal == 0) {
                    a0.b.u0("ADD", 2, list);
                    o b10 = hVar.b((o) list.get(0));
                    o b11 = hVar.b((o) list.get(1));
                    if (!(b10 instanceof k) && !(b10 instanceof s) && !(b11 instanceof k) && !(b11 instanceof s)) {
                        sVar = new h(Double.valueOf(b11.zzh().doubleValue() + b10.zzh().doubleValue()));
                    }
                    String valueOf = String.valueOf(b10.zzi());
                    String valueOf2 = String.valueOf(b11.zzi());
                    sVar = new s(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                } else if (ordinal == 21) {
                    zzbl zzblVar10 = zzbl.DIVIDE;
                    a0.b.u0("DIVIDE", 2, list);
                    sVar = new h(Double.valueOf(hVar.b((o) list.get(0)).zzh().doubleValue() / hVar.b((o) list.get(1)).zzh().doubleValue()));
                } else if (ordinal == 59) {
                    zzbl zzblVar11 = zzbl.SUBTRACT;
                    a0.b.u0("SUBTRACT", 2, list);
                    o b12 = hVar.b((o) list.get(0));
                    Double valueOf3 = Double.valueOf(-hVar.b((o) list.get(1)).zzh().doubleValue());
                    if (valueOf3 == null) {
                        valueOf3 = Double.valueOf(Double.NaN);
                    }
                    sVar = new h(Double.valueOf(valueOf3.doubleValue() + b12.zzh().doubleValue()));
                } else if (ordinal == 52 || ordinal == 53) {
                    a0.b.u0(str, 2, list);
                    o b13 = hVar.b((o) list.get(0));
                    hVar.b((o) list.get(1));
                    return b13;
                } else if (ordinal == 55 || ordinal == 56) {
                    a0.b.u0(str, 1, list);
                    return hVar.b((o) list.get(0));
                } else {
                    switch (ordinal) {
                        case 44:
                            zzbl zzblVar12 = zzbl.MODULUS;
                            a0.b.u0("MODULUS", 2, list);
                            sVar = new h(Double.valueOf(hVar.b((o) list.get(0)).zzh().doubleValue() % hVar.b((o) list.get(1)).zzh().doubleValue()));
                            break;
                        case 45:
                            zzbl zzblVar13 = zzbl.MULTIPLY;
                            a0.b.u0("MULTIPLY", 2, list);
                            sVar = new h(Double.valueOf(hVar.b((o) list.get(0)).zzh().doubleValue() * hVar.b((o) list.get(1)).zzh().doubleValue()));
                            break;
                        case 46:
                            zzbl zzblVar14 = zzbl.NEGATE;
                            a0.b.u0("NEGATE", 1, list);
                            return new h(Double.valueOf(-hVar.b((o) list.get(0)).zzh().doubleValue()));
                        default:
                            b(str);
                            throw null;
                    }
                }
                return sVar;
        }
    }
}
