package w9;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class h implements o {

    /* renamed from: c  reason: collision with root package name */
    public final Double f17170c;

    public h(Double d) {
        if (d == null) {
            this.f17170c = Double.valueOf(Double.NaN);
        } else {
            this.f17170c = d;
        }
    }

    @Override // w9.o
    public final Boolean b() {
        boolean z10 = false;
        if (!Double.isNaN(this.f17170c.doubleValue()) && this.f17170c.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // w9.o
    public final o c() {
        return new h(this.f17170c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return this.f17170c.equals(((h) obj).f17170c);
        }
        return false;
    }

    @Override // w9.o
    public final Iterator h() {
        return null;
    }

    public final int hashCode() {
        return this.f17170c.hashCode();
    }

    @Override // w9.o
    public final o j(String str, h2.h hVar, List list) {
        if ("toString".equals(str)) {
            return new s(zzi());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzi(), str));
    }

    public final String toString() {
        return zzi();
    }

    @Override // w9.o
    public final Double zzh() {
        return this.f17170c;
    }

    @Override // w9.o
    public final String zzi() {
        if (Double.isNaN(this.f17170c.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f17170c.doubleValue())) {
            return this.f17170c.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f17170c.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((stripTrailingZeros.scale() > 0 ? stripTrailingZeros.precision() : stripTrailingZeros.scale()) - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if (parseInt < 0) {
                if (parseInt <= -7) {
                }
            }
            return (parseInt < 0 || parseInt >= 21) ? format.replace("E-", "e-").replace("E", "e+") : stripTrailingZeros.toPlainString();
        }
        return format;
    }
}
