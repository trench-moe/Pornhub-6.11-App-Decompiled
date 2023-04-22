package t7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k8.c0;
import w6.d0;

/* loaded from: classes2.dex */
public final class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final String f15164f;

    /* renamed from: j  reason: collision with root package name */
    public final String f15165j;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = k8.c0.f11939a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f15164f = r0
            java.lang.String r3 = r3.readString()
            r2.f15165j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.l.<init>(android.os.Parcel):void");
    }

    public l(String str, String str2, String str3) {
        super(str);
        this.f15164f = str2;
        this.f15165j = str3;
    }

    public static List<Integer> a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // t7.h, o7.a.b
    public void J(d0.b bVar) {
        String str = this.f15154c;
        Objects.requireNonNull(str);
        char c10 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                break;
            case 82878:
                if (!str.equals("TCM")) {
                    break;
                } else {
                    c10 = 1;
                    break;
                }
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                break;
            case 83253:
                if (!str.equals("TP1")) {
                    break;
                } else {
                    c10 = 3;
                    break;
                }
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 83552:
                if (!str.equals("TYE")) {
                    break;
                } else {
                    c10 = '\t';
                    break;
                }
            case 2567331:
                if (!str.equals("TALB")) {
                    break;
                } else {
                    c10 = '\n';
                    break;
                }
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2569891:
                if (!str.equals("TDAT")) {
                    break;
                } else {
                    c10 = '\f';
                    break;
                }
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2581512:
                if (!str.equals("TPE1")) {
                    break;
                } else {
                    c10 = 17;
                    break;
                }
            case 2581513:
                if (!str.equals("TPE2")) {
                    break;
                } else {
                    c10 = 18;
                    break;
                }
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                break;
        }
        try {
            switch (c10) {
                case 0:
                case '\n':
                    bVar.f16537c = this.f15165j;
                    return;
                case 1:
                case 11:
                    bVar.f16555w = this.f15165j;
                    return;
                case 2:
                case '\f':
                    int parseInt = Integer.parseInt(this.f15165j.substring(2, 4));
                    int parseInt2 = Integer.parseInt(this.f15165j.substring(0, 2));
                    bVar.f16549q = Integer.valueOf(parseInt);
                    bVar.f16550r = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case 17:
                    bVar.f16536b = this.f15165j;
                    return;
                case 4:
                case 18:
                    bVar.d = this.f15165j;
                    return;
                case 5:
                case 19:
                    bVar.f16556x = this.f15165j;
                    return;
                case 6:
                case 20:
                    String[] F = c0.F(this.f15165j, "/");
                    int parseInt3 = Integer.parseInt(F[0]);
                    Integer valueOf = F.length > 1 ? Integer.valueOf(Integer.parseInt(F[1])) : null;
                    bVar.f16545l = Integer.valueOf(parseInt3);
                    bVar.f16546m = valueOf;
                    return;
                case 7:
                case 16:
                    bVar.f16535a = this.f15165j;
                    return;
                case '\b':
                case 15:
                    bVar.f16554v = this.f15165j;
                    return;
                case '\t':
                case 21:
                    bVar.f16548p = Integer.valueOf(Integer.parseInt(this.f15165j));
                    return;
                case '\r':
                    ArrayList arrayList = (ArrayList) a(this.f15165j);
                    int size = arrayList.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            }
                            bVar.f16550r = (Integer) arrayList.get(2);
                        }
                        bVar.f16549q = (Integer) arrayList.get(1);
                    }
                    bVar.f16548p = (Integer) arrayList.get(0);
                    return;
                case 14:
                    ArrayList arrayList2 = (ArrayList) a(this.f15165j);
                    int size2 = arrayList2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            }
                            bVar.f16553u = (Integer) arrayList2.get(2);
                        }
                        bVar.f16552t = (Integer) arrayList2.get(1);
                    }
                    bVar.f16551s = (Integer) arrayList2.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            return c0.a(this.f15154c, lVar.f15154c) && c0.a(this.f15164f, lVar.f15164f) && c0.a(this.f15165j, lVar.f15165j);
        }
        return false;
    }

    public int hashCode() {
        int b10 = a1.a.b(this.f15154c, 527, 31);
        String str = this.f15164f;
        int i10 = 0;
        int hashCode = (b10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15165j;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    @Override // t7.h
    public String toString() {
        String str = this.f15154c;
        String str2 = this.f15164f;
        String str3 = this.f15165j;
        StringBuilder n = a0.a.n(a0.a.e(str3, a0.a.e(str2, a0.a.e(str, 22))), str, ": description=", str2, ": value=");
        n.append(str3);
        return n.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15154c);
        parcel.writeString(this.f15164f);
        parcel.writeString(this.f15165j);
    }
}
