package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable;
import com.mixpanel.android.mpmetrics.InAppNotification;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r extends InAppNotification {
    public static final Parcelable.Creator<r> CREATOR = new a();
    public final ArrayList<cd.b> B;
    public final int C;
    public final String D;
    public final int E;
    public final boolean F;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public r createFromParcel(Parcel parcel) {
            return new r(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public r[] newArray(int i10) {
            return new r[i10];
        }
    }

    public r(Parcel parcel) {
        super(parcel);
        this.B = parcel.createTypedArrayList(cd.b.CREATOR);
        this.C = parcel.readInt();
        this.D = parcel.readString();
        this.E = parcel.readInt();
        this.F = parcel.readByte() != 0;
    }

    public r(JSONObject jSONObject) {
        super(jSONObject);
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("buttons");
            this.B = new ArrayList<>();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.B.add(new cd.b((JSONObject) jSONArray.get(i10)));
            }
            this.C = jSONObject.getInt("close_color");
            this.D = cb.e.Y(jSONObject, "title");
            this.E = jSONObject.optInt("title_color");
            this.F = this.f8168f.getBoolean("image_fade");
        } catch (JSONException e10) {
            throw new BadDecideObjectException("Notification JSON was unexpected or bad", e10);
        }
    }

    @Override // com.mixpanel.android.mpmetrics.InAppNotification
    public InAppNotification.Type b() {
        return InAppNotification.Type.TAKEOVER;
    }

    @Override // com.mixpanel.android.mpmetrics.InAppNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeTypedList(this.B);
        parcel.writeInt(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.E);
        parcel.writeByte(this.F ? (byte) 1 : (byte) 0);
    }
}
