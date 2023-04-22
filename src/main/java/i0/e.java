package i0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class e implements f {

    /* renamed from: b  reason: collision with root package name */
    public static final Locale[] f10453b = new Locale[0];

    /* renamed from: a  reason: collision with root package name */
    public final Locale[] f10454a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        int i10 = d.f10451b;
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length != 1) {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        } else {
            new Locale(split[0]);
        }
    }

    public e(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f10454a = f10453b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale == null) {
                throw new NullPointerException(a0.a.k("list[", i10, "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                locale2.getLanguage();
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    locale2.getCountry();
                }
                hashSet.add(locale2);
            }
        }
        this.f10454a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
    }

    @Override // i0.f
    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        Locale[] localeArr = ((e) obj).f10454a;
        if (this.f10454a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f10454a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override // i0.f
    public Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f10454a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public int hashCode() {
        int i10 = 1;
        int i11 = 0;
        while (true) {
            Locale[] localeArr = this.f10454a;
            if (i11 >= localeArr.length) {
                return i10;
            }
            i10 = (i10 * 31) + localeArr[i11].hashCode();
            i11++;
        }
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f10454a;
            if (i10 >= localeArr.length) {
                m10.append("]");
                return m10.toString();
            }
            m10.append(localeArr[i10]);
            if (i10 < this.f10454a.length - 1) {
                m10.append(',');
            }
            i10++;
        }
    }
}
