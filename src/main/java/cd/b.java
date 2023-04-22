package cd;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f4027c;

    /* renamed from: f  reason: collision with root package name */
    public String f4028f;

    /* renamed from: j  reason: collision with root package name */
    public int f4029j;

    /* renamed from: m  reason: collision with root package name */
    public int f4030m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public String f4031t;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(Parcel parcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = new JSONObject(parcel.readString());
        } catch (JSONException unused) {
            Log.e("MixpanelAPI.InAppButton", "Error reading JSON when creating InAppButton from Parcel");
        }
        this.f4027c = jSONObject;
        this.f4028f = parcel.readString();
        this.f4029j = parcel.readInt();
        this.f4030m = parcel.readInt();
        this.n = parcel.readInt();
        this.f4031t = parcel.readString();
    }

    public b(JSONObject jSONObject) {
        this.f4027c = jSONObject;
        this.f4028f = jSONObject.getString("text");
        this.f4029j = jSONObject.getInt("text_color");
        this.f4030m = jSONObject.getInt("bg_color");
        this.n = jSONObject.getInt("border_color");
        this.f4031t = jSONObject.getString("cta_url");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f4027c.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4027c.toString());
        parcel.writeString(this.f4028f);
        parcel.writeInt(this.f4029j);
        parcel.writeInt(this.f4030m);
        parcel.writeInt(this.n);
        parcel.writeString(this.f4031t);
    }
}
