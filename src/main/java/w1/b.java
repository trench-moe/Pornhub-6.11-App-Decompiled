package w1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.appsflyer.oaid.BuildConfig;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class b extends a {
    public final SparseIntArray d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f16364e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16365f;

    /* renamed from: g  reason: collision with root package name */
    public final int f16366g;

    /* renamed from: h  reason: collision with root package name */
    public final String f16367h;

    /* renamed from: i  reason: collision with root package name */
    public int f16368i;

    /* renamed from: j  reason: collision with root package name */
    public int f16369j;

    /* renamed from: k  reason: collision with root package name */
    public int f16370k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new p.a(), new p.a(), new p.a());
    }

    public b(Parcel parcel, int i10, int i11, String str, p.a<String, Method> aVar, p.a<String, Method> aVar2, p.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.d = new SparseIntArray();
        this.f16368i = -1;
        this.f16369j = 0;
        this.f16370k = -1;
        this.f16364e = parcel;
        this.f16365f = i10;
        this.f16366g = i11;
        this.f16369j = i10;
        this.f16367h = str;
    }

    @Override // w1.a
    public void a() {
        int i10 = this.f16368i;
        if (i10 >= 0) {
            int i11 = this.d.get(i10);
            int dataPosition = this.f16364e.dataPosition();
            this.f16364e.setDataPosition(i11);
            this.f16364e.writeInt(dataPosition - i11);
            this.f16364e.setDataPosition(dataPosition);
        }
    }

    @Override // w1.a
    public a b() {
        Parcel parcel = this.f16364e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f16369j;
        if (i10 == this.f16365f) {
            i10 = this.f16366g;
        }
        return new b(parcel, dataPosition, i10, android.support.v4.media.b.m(new StringBuilder(), this.f16367h, "  "), this.f16361a, this.f16362b, this.f16363c);
    }

    @Override // w1.a
    public boolean f() {
        return this.f16364e.readInt() != 0;
    }

    @Override // w1.a
    public byte[] g() {
        int readInt = this.f16364e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f16364e.readByteArray(bArr);
        return bArr;
    }

    @Override // w1.a
    public CharSequence h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f16364e);
    }

    @Override // w1.a
    public boolean i(int i10) {
        while (this.f16369j < this.f16366g) {
            int i11 = this.f16370k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f16364e.setDataPosition(this.f16369j);
            int readInt = this.f16364e.readInt();
            this.f16370k = this.f16364e.readInt();
            this.f16369j += readInt;
        }
        return this.f16370k == i10;
    }

    @Override // w1.a
    public int j() {
        return this.f16364e.readInt();
    }

    @Override // w1.a
    public <T extends Parcelable> T l() {
        return (T) this.f16364e.readParcelable(b.class.getClassLoader());
    }

    @Override // w1.a
    public String n() {
        return this.f16364e.readString();
    }

    @Override // w1.a
    public void p(int i10) {
        a();
        this.f16368i = i10;
        this.d.put(i10, this.f16364e.dataPosition());
        this.f16364e.writeInt(0);
        this.f16364e.writeInt(i10);
    }

    @Override // w1.a
    public void q(boolean z10) {
        this.f16364e.writeInt(z10 ? 1 : 0);
    }

    @Override // w1.a
    public void r(byte[] bArr) {
        if (bArr == null) {
            this.f16364e.writeInt(-1);
            return;
        }
        this.f16364e.writeInt(bArr.length);
        this.f16364e.writeByteArray(bArr);
    }

    @Override // w1.a
    public void s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f16364e, 0);
    }

    @Override // w1.a
    public void t(int i10) {
        this.f16364e.writeInt(i10);
    }

    @Override // w1.a
    public void u(Parcelable parcelable) {
        this.f16364e.writeParcelable(parcelable, 0);
    }

    @Override // w1.a
    public void v(String str) {
        this.f16364e.writeString(str);
    }
}
