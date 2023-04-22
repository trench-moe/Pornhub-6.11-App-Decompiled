package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable;
import com.mixpanel.android.mpmetrics.InAppNotification;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h extends InAppNotification {
    public static final Parcelable.Creator<h> CREATOR = new a();
    public final String B;
    public final int C;
    public final int D;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public h[] newArray(int i10) {
            return new h[i10];
        }
    }

    public h(Parcel parcel) {
        super(parcel);
        this.B = parcel.readString();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
    }

    public h(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.B = cb.e.Y(jSONObject, "cta_url");
            this.C = jSONObject.getInt("image_tint_color");
            this.D = jSONObject.getInt("border_color");
        } catch (JSONException e10) {
            throw new BadDecideObjectException("Notification JSON was unexpected or bad", e10);
        }
    }

    @Override // com.mixpanel.android.mpmetrics.InAppNotification
    public InAppNotification.Type b() {
        return InAppNotification.Type.MINI;
    }

    @Override // com.mixpanel.android.mpmetrics.InAppNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
    }
}
