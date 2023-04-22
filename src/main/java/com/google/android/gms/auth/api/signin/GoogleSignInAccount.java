package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h9.o;
import i9.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import t9.k0;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new r8.a();
    public String A;
    public String B;
    public Set<Scope> C = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final int f6773c;

    /* renamed from: f  reason: collision with root package name */
    public String f6774f;

    /* renamed from: j  reason: collision with root package name */
    public String f6775j;

    /* renamed from: m  reason: collision with root package name */
    public String f6776m;
    public String n;

    /* renamed from: t  reason: collision with root package name */
    public Uri f6777t;

    /* renamed from: u  reason: collision with root package name */
    public String f6778u;

    /* renamed from: w  reason: collision with root package name */
    public long f6779w;
    public String y;

    /* renamed from: z  reason: collision with root package name */
    public List<Scope> f6780z;

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List<Scope> list, String str7, String str8) {
        this.f6773c = i10;
        this.f6774f = str;
        this.f6775j = str2;
        this.f6776m = str3;
        this.n = str4;
        this.f6777t = uri;
        this.f6778u = str5;
        this.f6779w = j10;
        this.y = str6;
        this.f6780z = list;
        this.A = str7;
        this.B = str8;
    }

    public static GoogleSignInAccount q0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long longValue = valueOf.longValue();
        o.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, longValue, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f6778u = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            return googleSignInAccount.y.equals(this.y) && googleSignInAccount.p0().equals(p0());
        }
        return false;
    }

    public int hashCode() {
        return p0().hashCode() + a1.a.b(this.y, 527, 31);
    }

    public Set<Scope> p0() {
        HashSet hashSet = new HashSet(this.f6780z);
        hashSet.addAll(this.C);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        int i11 = this.f6773c;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        k0.r(parcel, 2, this.f6774f, false);
        k0.r(parcel, 3, this.f6775j, false);
        k0.r(parcel, 4, this.f6776m, false);
        k0.r(parcel, 5, this.n, false);
        k0.q(parcel, 6, this.f6777t, i10, false);
        k0.r(parcel, 7, this.f6778u, false);
        long j10 = this.f6779w;
        parcel.writeInt(524296);
        parcel.writeLong(j10);
        k0.r(parcel, 9, this.y, false);
        k0.u(parcel, 10, this.f6780z, false);
        k0.r(parcel, 11, this.A, false);
        k0.r(parcel, 12, this.B, false);
        k0.z(parcel, v2);
    }
}
