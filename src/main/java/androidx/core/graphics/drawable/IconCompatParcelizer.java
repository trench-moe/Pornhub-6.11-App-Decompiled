package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;
import java.util.Objects;
import w1.a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1817a = aVar.k(iconCompat.f1817a, 1);
        byte[] bArr = iconCompat.f1819c;
        if (aVar.i(2)) {
            bArr = aVar.g();
        }
        iconCompat.f1819c = bArr;
        iconCompat.d = aVar.m(iconCompat.d, 3);
        iconCompat.f1820e = aVar.k(iconCompat.f1820e, 4);
        iconCompat.f1821f = aVar.k(iconCompat.f1821f, 5);
        iconCompat.f1822g = (ColorStateList) aVar.m(iconCompat.f1822g, 6);
        String str = iconCompat.f1824i;
        if (aVar.i(7)) {
            str = aVar.n();
        }
        iconCompat.f1824i = str;
        String str2 = iconCompat.f1825j;
        if (aVar.i(8)) {
            str2 = aVar.n();
        }
        iconCompat.f1825j = str2;
        iconCompat.f1823h = PorterDuff.Mode.valueOf(iconCompat.f1824i);
        switch (iconCompat.f1817a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.f1818b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 == null) {
                    byte[] bArr2 = iconCompat.f1819c;
                    iconCompat.f1818b = bArr2;
                    iconCompat.f1817a = 3;
                    iconCompat.f1820e = 0;
                    iconCompat.f1821f = bArr2.length;
                    break;
                } else {
                    iconCompat.f1818b = parcelable2;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1819c, Charset.forName("UTF-16"));
                iconCompat.f1818b = str3;
                if (iconCompat.f1817a != 2 || iconCompat.f1825j != null) {
                    break;
                } else {
                    iconCompat.f1825j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.f1818b = iconCompat.f1819c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        Objects.requireNonNull(aVar);
        iconCompat.f1824i = iconCompat.f1823h.name();
        switch (iconCompat.f1817a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f1818b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f1818b;
                break;
            case 2:
                iconCompat.f1819c = ((String) iconCompat.f1818b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1819c = (byte[]) iconCompat.f1818b;
                break;
            case 4:
            case 6:
                iconCompat.f1819c = iconCompat.f1818b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f1817a;
        if (-1 != i10) {
            aVar.p(1);
            aVar.t(i10);
        }
        byte[] bArr = iconCompat.f1819c;
        if (bArr != null) {
            aVar.p(2);
            aVar.r(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            aVar.p(3);
            aVar.u(parcelable);
        }
        int i11 = iconCompat.f1820e;
        if (i11 != 0) {
            aVar.p(4);
            aVar.t(i11);
        }
        int i12 = iconCompat.f1821f;
        if (i12 != 0) {
            aVar.p(5);
            aVar.t(i12);
        }
        ColorStateList colorStateList = iconCompat.f1822g;
        if (colorStateList != null) {
            aVar.p(6);
            aVar.u(colorStateList);
        }
        String str = iconCompat.f1824i;
        if (str != null) {
            aVar.p(7);
            aVar.v(str);
        }
        String str2 = iconCompat.f1825j;
        if (str2 != null) {
            aVar.p(8);
            aVar.v(str2);
        }
    }
}
